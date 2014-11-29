package net.ems.authenticate; 

import java.io.IOException;
import java.security.Principal;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.RequestDispatcher;

public class AuthenticationBean {

	@Named
	
	//Variable Declaration
	
	private String username;
	private String password;
	private String originalURL;
	private UserService userService;
	
	public AuthenticationBean(){
		
	}
	@PostConstruct
	
	public void init(){
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		originalURL =(String) externalContext.getRequestMap().get(RequestDispatcher.FORWARD_REQUEST_URI);
		
		if(originalURL == null){
			originalURL = externalContext.getRequestContextPath() + "index.xhtml";
		}else{
			String originalQuery = (String) externalContext.getRequestMap().get(RequestDispatcher.FORWARD_QUERY_STRING);
			originalURL += "?" + originalQuery;
		}
	}
	
	public void
	

}
