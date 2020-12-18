package com.victorm.principal.services.implementations;

import com.victorm.principal.util.LoginUser;
import com.victorm.principal.util.User;

public class UserService {
	
	
	public UserService() {
		
	}
	
	
	public boolean LogUserIn(LoginUser user) {
		//use helper_LogUserINQueryDb
		return false;
	}
	
	
	
	
	private User helper_LogUserInQueryDb(String username, String password) {
		
		if(username.equals("vic@email.com") && password.equals("password")) {
			User u = new User();
			//query db;
		}
		
		
		return null;
	}
}
