package com.victorm.principal;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.victorm.principal.services.implementations.UserService;
import com.victorm.principal.util.LoginUser;
import com.victorm.principal.util.User;

@Controller
public class RegisterController {
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

	@RequestMapping(value = "/RegisterController/Register", method = RequestMethod.GET, name = "loginGetEndpoint")
	public String GetRegisterView() {
		System.out.println("Returning Register View");
		return "register";
	}
	
	
	
	@RequestMapping(value = "/RegisterController/Register", method = RequestMethod.POST, name = "loginPostEndpoint")
	public String LoginUserPost(Locale locale, Model model, @ModelAttribute("userRegister")LoginUser user) {
		
		logger.info("Welcome to the Account Controller, we have hit the loginGetEndpoint, the client locale is {}.", locale);
		
		UserService userService = new UserService(); // register the user here in the db;
		User user2 = new User(); // this will be returned by the user service.
		
		
		model.addAttribute("user", user2);
		
		return "welcome";
	}
	
	
}
