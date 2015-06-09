package me.huxos.checkout.entity;

/**
 * 拦截日志实体类
 * 
 * @author KangLin <kl222@126.com>
 * 
 */
public class CBlockerPhoneLog {
	private Integer no;
	private String phone_number;
	private long time;
	public CBlockerPhoneLog(Integer no, String phone_number, long time) {
		super();
		this.no = no;
		this.phone_number = phone_number;
		this.time = time;
	}
	public CBlockerPhoneLog(String phone_number, long time) {
		super();
		this.phone_number = phone_number;
		this.time = time;
	}

	public Integer getNo(){
		return no;
	}
	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}
}