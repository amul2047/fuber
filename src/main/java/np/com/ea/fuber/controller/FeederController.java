package np.com.ea.fuber.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import np.com.ea.fuber.model.Feeder;
import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.model.Order;
import np.com.ea.fuber.service.FeederService;
import np.com.ea.fuber.service.FoodService;
import np.com.ea.fuber.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/feeder")
public class FeederController 
{

	@Autowired
	private FeederService feederService;
	
	@Autowired
	private FoodService foodService;
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = { "/", "/list" })
	public String listFeeder(Map<String, Object> map) 
	{	
		map.put("Feeder", new Feeder());
		map.put("FeederList", feederService.getFeeder());
		return "/feeder/list";	
	}

	//Using a json response object
	@RequestMapping("/addToCart/{foodId}")
	public @ResponseBody Map<String, Object> getProductBacklog(@PathVariable("foodId") int foodId, Map<String, Object> map) 
	{
		map = new HashMap<String, Object>();
		Food food = foodService.find(foodId);
		map.put("cart", food);
		
		return map;
	}
	
	@RequestMapping("/detail/{feederId}")
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
	
	//TODO
	@RequestMapping("/viewFoods/{feederId}")
	public String viewFoods(@PathVariable("feederId") int feederId, Map<String, Object> map){
		return null;
	}
	
	@RequestMapping("/viewOrders/{feederId}")
	public String viewOrders(@PathVariable("feederId") int feederId, Map<String, Object> map){
		map.put("Order", new Order());
		List<Order> orderList = orderService.getOrderByFeederId(feederId);
		map.put("orderList", orderList);
		for(Object o: orderList){
			System.out.println(">>>"+o);
			
		}
		return "/feeder/orders";
	}	
	
	@RequestMapping("/details/{orderId}")
	public String viewOrderDetails(@PathVariable("orderId") int orderId, Map<String, Object> map) 
	{	
		
		System.out.println("");
		Map<String, Object> map2 = orderService.getOrderAndOrderList(orderId);
		map.put("Order", map2.get("Order"));
		map.put("OrderItems", map2.get("OrderItems"));
		return "/order/detail";	
	}		
	
	@RequestMapping(value = { "/profile/{feederId}" })
	public String viewProfile(@PathVariable("feederId") int feederId, Map<String, Object> map) 	{
		Feeder feeder = feederService.find(feederId);
		map.put("feeder", feeder);
		return "/feeder/profile";
	}
	
	@RequestMapping(value="/profile/edit/{feederId}", method = RequestMethod.GET)
	public String editProfile(@PathVariable("feederId") int feederId, Map<String, Object> map) 	{
		Feeder feeder = feederService.find(feederId);
		//System.out.println("??>>>??FEeder ID on edit page is" + feeder.getId());
		map.put("feeder", feeder);
		
		return "/feeder/edit";
	}	
	
	@RequestMapping(value="/profile/edit", method = RequestMethod.POST)
	public String handleEditProfile(Feeder feeder, Map<String, Object> map) {
		//System.out.println("??>>>??FEeder ID before update is:" + feeder.getId());
		feederService.update(feeder);
		map.put("feeder", feeder);
		//System.out.println("??>>>??FEeder ID after update is:" + feeder.getId());
		return "redirect:/feeder/profile/"+feeder.getId();	
	}		
	
//	@RequestMapping("/releasebacklog/{productBacklogId}")
//	public String relaseproductbacklog(@PathVariable("productBacklogId") Long productbacklogId, Map<String, Object> map){	
//		System.out.println("Caling Service");
//		System.out.println(productbacklogId);
//		map.put("ReleaseBacklog",new ReleaseBacklog());
//		System.out.println("Caling Service");
//		map.put("ReleaseBacklogList",productBacklogService.getReleaseByProductBacklogId(productbacklogId));
//		System.out.println("called service");
//		return "/productbacklog/listreleasebacklog";
//	}
//	
//	@RequestMapping(value = "/saveProductBacklog", method = RequestMethod.POST)
//	public String saveProductBacklog(@ModelAttribute("productbacklog") ProductBacklog productBacklog,
//		BindingResult result) 
//	{	
//		productBacklogService.create(productBacklog);
//
//		return "redirect:index";
//	}
//
//	@RequestMapping("/delete/{productBacklogId}")
//	public String deleteProductBacklog(@PathVariable("productBacklogId") Long id) 
//	{
//		productBacklogService.delete(id);
//
//		return "redirect:/productbacklog/index";
//	}
//	
//	@RequestMapping(value = "/{productBacklogId}/saveUserStory", method = RequestMethod.POST)
//	public String saveUserStory(@ModelAttribute("userstory") UserStory userstory, @PathVariable("productBacklogId") Long pbId,
//		BindingResult result) 
//	{	
//		ProductBacklog pb = productBacklogService.find(pbId);
//		userstory.setProductBacklog(pb);
//		UserStoryService.create(userstory);
//
//		return "redirect:../detail/" + pbId;
//	}
}
