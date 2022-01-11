package com.project.springboot.web.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {

	public boolean validateUser(String userid, String password) {
		// bebetto, secret
		return userid.equalsIgnoreCase("bebetto")
				&& password.equalsIgnoreCase("secret");
	}

}
