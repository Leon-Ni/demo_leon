package getactivemq;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;

//import com.tms.config.ConfigManager;
public class WriteFile {
	
	public static void writer(String content,String dir) {

		FileOutputStream fop = null;
		File file = null;

		try {
			//String uploadFilePath = ConfigManager.getInstance().getValue(com.tms.sys.Constants.SYS_REPO_ROOT);
			String uploadFilePath = "t:/";
			java.util.Date date = new java.util.Date();
			SimpleDateFormat formatDj = new SimpleDateFormat("yyyy-MM-dd");
			String datepath = formatDj.format(date);
			String path = uploadFilePath+"/PUT_DOC/"+datepath+"/";
			file = new File(path);
			if (!file.exists()) {
				file.mkdirs();
			}
			file = new File(path+dir+"log.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			
			fop = new FileOutputStream(file);

			byte[] contentInBytes = content.getBytes();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void writer(InputStream inputStream,String dir) {
		
		InputStreamReader inputStreamReader = null;
		OutputStreamWriter outputStreamWriter = null;
		FileOutputStream fop = null;
		File file = null;
		
		try {
			//String uploadFilePath = ConfigManager.getInstance().getValue(com.tms.sys.Constants.SYS_REPO_ROOT);
			String uploadFilePath = "T:\\tms-repo";
			java.util.Date date = new java.util.Date();
			SimpleDateFormat formatDj = new SimpleDateFormat("yyyy-MM-dd");
			String datepath = formatDj.format(date);
			String path = uploadFilePath+"/ACTIVE_MQ/"+datepath+"/";
			file = new File(path);
			if (!file.exists()) {
				file.mkdirs();
			}
			file = new File(path+dir+date.getTime()+"log.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			
			inputStreamReader = new InputStreamReader(inputStream, "utf-8");
			fop = new FileOutputStream(file);
			outputStreamWriter = new OutputStreamWriter(fop, "utf-8");
			
			char[] b = new char[1024];
//			byte[] b = new byte[1024];
			int size = 0;
			while ((size = inputStreamReader.read(b)) != -1) {
//			while ((size = inputStream.read(b)) != -1) {
				
				outputStreamWriter.write(b, 0, size);
//				fop.write(b, 0, size);
				
			}
			outputStreamWriter.flush();
			outputStreamWriter.close();
//			fop.flush();
//			fop.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fop != null) {
					fop.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}