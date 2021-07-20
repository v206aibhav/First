package com.pheonix.web.models;

public class LoginBean {
	
	private String uname;
	private String passwd;
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}


	public boolean isValid()
	{
		if(uname!=null && passwd!=null && uname.equals("Vaibhav") && passwd.equals("Vai@123"))
			return true;
		else
			return false;
	}

}
