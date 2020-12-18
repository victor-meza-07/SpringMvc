package com.victorm.principal;

import java.time.LocalDate;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
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
public class AccountController {
	
	/*
	 * TODO: Make sure this works
	 * 
	 * */
	
	
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(AccountController.class);
	
	
	@RequestMapping(value = "/AccountController/Login", method = RequestMethod.GET, name = "loginGetEndpoint")
	public String LogInUserGet(Locale locale, Model model) {
		
		logger.info("Welcome to the Account Controller, we have hit the loginGetEndpoint, the client locale is {}.", locale);
		User u = new User();
		
		
		model.addAttribute("User", u);
		model.addAttribute("message", "Hello Login Page!");
		
		
		return "login";
	}
	
	@RequestMapping(value = "/AccountController/Login", method = RequestMethod.POST, name = "loginPostEndpoint")
	public ModelAndView LoginUserPost(Locale locale, Model model, @ModelAttribute("userLogin")LoginUser user) {
		
		logger.info("Welcome to the Account Controller, we have hit the loginGetEndpoint, the client locale is {}.", locale);
		
		UserService userService = new UserService();
		
		
		if(userService.LogUserIn(user) == true) {
			return new ModelAndView("home", "user", user);
		}
		else {
			return new ModelAndView("redirect:/RegisterController/Register");
		}
	}
	
	

}
