package np.com.ea.fuber.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import np.com.ea.fuber.model.Feeder;
import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.model.Hungry;
import np.com.ea.fuber.service.FeederService;
import np.com.ea.fuber.service.FoodService;
import np.com.ea.fuber.service.HungryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@SessionAttributes(value = {"USER_ID", "CART"})
@Controller
@RequestMapping("/hungry")
public class HungryController 
{
	@Autowired
	private FeederService feederService;
	
	@Autowired
	private FoodService foodService;
	
	@Autowired
	private HungryService hungryService;
	
	@RequestMapping(value = { "/feeder", "/feeder/list" })
	public String listFeeder(Map<String, Object> map) 
	{	
		map.put("Feeder", new Feeder());
		map.put("FeederList", feederService.getFeeder());
		return "/feeder/list";	
	}
	
	@RequestMapping("feeder/detail/{feederId}")
	public String detailFeeder(@PathVariable("feederId") int feederId, Map<String, Object> map) 
	{
		map.put("Food", new Food());
		map.put("foodList",foodService.getFoodByFeederId(feederId));
//		
//		for (Map.Entry<String, Object> entry : map.entrySet()) {
//		    System.out.println(">>>>>"+entry.getKey()+" : "+entry.getValue());
//		}
		return "/feeder/detail";
	}
	
	@RequestMapping(value = { "/profile/{userId}" })
	public String myProfile(@PathVariable("userId") int userId, Map<String, Object> map)
	{	
		map.put("Hungry", new Hungry());
		map.put("Hungry",hungryService.find(userId));
		return "hungry/index";
	}
	
	@RequestMapping(value = { "/history/{userId}" })
	public String myHistory(@PathVariable("userId") int userId, Map<String, Object> map)
	{	
		map.put("Hungry", new Hungry());
		//map.put("Hungry",hungryService.orderHistoryByUserId(userId));
		return "hungry/index";
	}
	
	
	//Using a json response object
	@RequestMapping("/foodCart/{foodId}")
	public @ResponseBody boolean addFoodToCart(@PathVariable("foodId") int foodId, 
			Map<String, Object> map, HttpSession session)
	{
		session.putValue("cart", foodId);
		
		//System.out.println("Session VALUE>>>>>>>>>>>"+ session.getAttribute("cart"));
		
		return true;
	}
		
	@RequestMapping("/checkout")
	public String checkout(Map<String, Object> map, 
			HttpSession session)
	{
		
		System.out.println("Session VALUE>>>>>>>>>>>"+ session.getAttribute("cart"));
		Integer id = (Integer) session.getAttribute("cart");
		//System.out.println("LLLLLLLLLLL"+ id);
		map.put("Food", new Food());
		map.put("Food",foodService.find(id));
		
		for (Map.Entry<String, Object> entry : map.entrySet()) {
		    System.out.println(">>>>>"+entry.getKey()+" : "+entry.getValue());
		}
		
		return "hungry/cart";
	}
}
