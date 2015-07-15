package np.com.ea.fuber.controller;

import java.util.List;
import java.util.Map;

import np.com.ea.fuber.model.Order;
import np.com.ea.fuber.model.OrderItem;
import np.com.ea.fuber.service.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping("/details/{orderId}")
	public String viewOrderDetails(@PathVariable("orderId") int orderId, Map<String, Object> map) 
	{	
		Map<String, Object> map2 = orderService.getOrderAndOrderList(orderId);
		map.put("Order", new Order());
		map.put("OrderItem", new OrderItem());
		map.put("OrderItems", map2.get("OrderItems"));
		map.put("TheOrder",map2.get("Order"));
		double total = 0.0;
		List<OrderItem> itemList = (List<OrderItem>) map2.get("OrderItems");
		for (OrderItem oi: itemList){
			total += oi.getPrice() * (double) oi.getQuantity();
		}
		map.put("Total", total);
		return "/order/detail";	
	}	

}
