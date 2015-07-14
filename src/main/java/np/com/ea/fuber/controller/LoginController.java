package np.com.ea.fuber.controller;

import java.util.List;

import np.com.ea.fuber.service.FoodService;
import np.com.ea.fuber.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("USER_ID")
@Controller
@RequestMapping("/auth")
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginPage(@RequestParam(value = "error", required = false) boolean error,
			ModelMap model) {
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>Received request to show login page");
		
		return "login/login";
	}

	@RequestMapping(value = "/denied", method = RequestMethod.GET)
	public String getDeniedPage() {

		// logger.debug("Received request to show denied page");

		// This will resolve to /WEB-INF/jsp/deniedpage.jsp
		return "/login/loginfailed";
	}


	@RequestMapping(value = "/403")
	public String accessDenied(Model model) {
		model.addAttribute("error", "true");
		return "/login/403";
	}

	@RequestMapping(value = "/loginfailed")
	public String loginfailed(Model model) {
		model.addAttribute("error", "true");
		return "/login/loginfailed";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model) {
		return "/login";
	}
	
	@RequestMapping(value = "/storeLogin", method = RequestMethod.GET)
	public String storeLogin(Model model) {
		User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		//System.out.println("USER>>"+user.getUsername() + "PASS>>>" +user.getPassword() +"AUTH>>"+ user.getAuthorities() );
		
		np.com.ea.fuber.model.User us = userService.getUserIdByUserName(user.getUsername());
		System.out.println("===================="+us);
		model.addAttribute("USER_ID", us.getId());
		model.addAttribute("username", user.getUsername());
		model.addAttribute("role", user.getAuthorities());
		//System.out.println("Logged In:" + us.getId());
		return "dashboard/index";
	}
}