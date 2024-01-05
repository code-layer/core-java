package in.datalayer;

import java.io.Serializable;

public class NewsAccess implements Serializable {
	private Integer userId;
	private transient String passWord;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}