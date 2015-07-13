package np.com.ea.fuber.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LoginController {
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		System.out.print("loading login page");
		return "/login";
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
}