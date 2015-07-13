package np.com.ea.fuber.controller;

import java.util.HashMap;
import java.util.Map;

import np.com.ea.fuber.model.Feeder;
import np.com.ea.fuber.service.FeederService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/dashboard")
public class DashboardController 
{
	@Autowired
	private FeederService feederService;
	
	@RequestMapping(value = { "/" })
	public String showDashboard() 
	{	
		return "dashboard/index";
	}
	
	@RequestMapping(value = { "/feeder", })
	public String listFeeder(Map<String, Object> map) 
	{	
		map.put("Feeder", new Feeder());
		map.put("FeederList", feederService.getFeeder());
		System.out.println(">>>"+ feederService.getFeeder());
		return "/feeder/list";	
	}
}
