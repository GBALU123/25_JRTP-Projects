package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.binding.Order;
import in.ashokit.service.OrderService;

@RestController 
public class OrderRestController {
	
	@Autowired
	public OrderService orderService;
	
	@PostMapping("/order")
	public String placeOrder( @RequestBody Order order) {
		
		 return orderService.publishMsg1(order);
		
		
	}

}
