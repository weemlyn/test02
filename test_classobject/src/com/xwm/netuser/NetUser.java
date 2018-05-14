package com.xwm.netuser;

public class NetUser {
	private String ID;
	private String username;
	String email;
	public NetUser(String ID, String username) {
		super();
		this.ID = ID;
		this.username = username;
		this.email =ID+"@gameschool.com";
	}
	public NetUser(String iD, String username, String email) {
		super();
		ID = iD;
		this.username = username;
		this.email = email;
	}
	public void check() {
		System.out.println("ID:"+ID+"\n"+"用户名："+username+"\n"+"email:"+email);
	}
	

}
