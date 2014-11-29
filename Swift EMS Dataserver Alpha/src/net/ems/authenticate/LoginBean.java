package net.ems.authenticate;

import javax.inject.Named;

public class LoginBean {
	@Named
	
	private String Username;
	private String Password;
	
	public void setUsername (String usrname){
		Username = usrname;
	}
	public String getUsername(){
		return Username;
	}
	public void setPassword(String Passwrd){
		Password=Passwrd;
	}
	public boolean ValidateLogin(){
		if(){
			return true;
		}else{
			return false
		}
	}
	public void Connect(String Domain){}
}
