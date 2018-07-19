package getactivemq;
import java.sql.Blob;

public class ACTIVEMQ_MSGS {

	private int id;
	private String container;
	private String masid_prod;
	private int expiration;
	private int msgid_seq;
	private Blob msg;
	private int priority;
	private String xid;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContainer() {
		return container;
	}
	public void setContainer(String container) {
		this.container = container;
	}
	public String getMasid_prod() {
		return masid_prod;
	}
	public void setMasid_prod(String masid_prod) {
		this.masid_prod = masid_prod;
	}
	public int getExpiration() {
		return expiration;
	}
	public void setExpiration(int expiration) {
		this.expiration = expiration;
	}
	public int getMsgid_seq() {
		return msgid_seq;
	}
	public void setMsgid_seq(int msgid_seq) {
		this.msgid_seq = msgid_seq;
	}
	
	public Blob getMsg() {
		return msg;
	}
	public void setMsg(Blob msg) {
		this.msg = msg;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getXid() {
		return xid;
	}
	public void setXid(String xid) {
		this.xid = xid;
	}
	
	
	
}
