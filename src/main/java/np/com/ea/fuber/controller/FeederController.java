package np.com.ea.fuber.controller;

import java.util.HashMap;
import java.util.Map;

import np.com.ea.fuber.model.Feeder;
import np.com.ea.fuber.model.Food;
import np.com.ea.fuber.service.FeederService;
import np.com.ea.fuber.service.FoodService;

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
@RequestMapping("/feeder")
public class FeederController 
{

	@Autowired
	private FeederService feederService;
	
	@Autowired
	private FoodService foodService;
	
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
		System.out.println(food);
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
