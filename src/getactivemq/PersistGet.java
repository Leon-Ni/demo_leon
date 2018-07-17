package putmq;
/**
 * 获取activemq中死信的值
 */
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;
import org.junit.Test;

public class PersistGet {

	@Test
	public void get() throws SQLException, ClassNotFoundException {

		Class.forName("oracle.jdbc.driver.OracleDriver");

		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "tcd", "password");

		String sql = "select MSG from ACTIVEMQ_MSGS";
		PreparedStatement st = conn.prepareStatement(sql);

		ResultSet rs = st.executeQuery();

		if (rs == null) {
			return;
		}

		InputStream inputStream = null;
		// 创建Vector集合对象
		Vector<InputStream> vector = new Vector<InputStream>();

		while (rs.next()) {
			inputStream = rs.getBlob("MSG").getBinaryStream();
			// 添加输入流对象到集合Vector里
			vector.add(inputStream);
		}

		// 得到Enumeration对象
		Enumeration<InputStream> en = vector.elements();
		// 创建SequenceInputStream对象,将Enumeration对象传入
		SequenceInputStream sis = new SequenceInputStream(en);

		WriteFile.writer(sis, "activemsg");

	}

}







//之前的代码
/*while (rs.next()) {
			ACTIVEMQ_MSGS msgs = new ACTIVEMQ_MSGS();
			Blob msg = rs.getBlob("MSG");
			msgs.setMsg(msg);
			list.add(msgs);
		}

		InputStream inputStream = null;
		 //创建Vector集合对象 
		Vector<InputStream> vector=new Vector<InputStream>(); 
		
		for (ACTIVEMQ_MSGS mq_msg : list) {
			try {
				inputStream = mq_msg.getMsg().getBinaryStream();
				//添加输入流对象到集合Vector里
				vector.add(inputStream);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}*/