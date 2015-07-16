package np.com.ea.fuber.controller;

import java.util.HashMap;
import java.util.Map;

import np.com.ea.fuber.model.Hungry;
import np.com.ea.fuber.service.HungryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes("USER_ID")
@Controller
public class DashboardController 
{
	//@Autowired
	//private FeederService feederService;
	
	
	
	@RequestMapping(value = { "/dashboard" })
	public String showDashboard() 
	{	
		return "dashboard/index";
	}
	
	@RequestMapping(value = { "/" })
	public String showLogin() 
	{	
		return "login/login";
	}
	
	
	

//	@RequestMapping(value = { "/feeder", })
//	public String listFeeder(Map<String, Object> map) 
//	{	
//		map.put("Feeder", new Feeder());
//		map.put("FeederList", feederService.getFeeder());
//		System.out.println(">>>"+ feederService.getFeeder());
//		return "/feeder/list";	
//	}
	
	
}
