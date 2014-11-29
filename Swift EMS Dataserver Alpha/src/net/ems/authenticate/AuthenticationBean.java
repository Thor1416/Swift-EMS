package net.ems.authenticate; 

import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.RequestDispatcher;

public class AuthenticationBean {

	@ManagedBean(name="AuthenticationBean")
	
	//Variable Declaration
	
	private String username;
	private String password;
	private User user;
	
	public AuthenticationBean(){
		
	}
	@PostConstruct
	
	private void Init(){
		th
	}
	
	public void setUsername (String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}
	public void setPÅasswo

}
