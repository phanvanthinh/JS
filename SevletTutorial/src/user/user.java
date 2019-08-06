package user;

import java.io.Serializable;

public class user implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int stt;
	private String username;
	private String password;
	private int role;
	private String avatar;
	
	public user() {
		super();
	}
	
	public user(int stt, String username, String password, int role, String avatar) {
		super();
		this.stt = stt;
		this.username = username;
		this.password = password;
		this.role = role;
		this.avatar = avatar;
	}

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	  
	  
}

