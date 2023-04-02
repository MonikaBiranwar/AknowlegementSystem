package com.elemetAknowlegment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elemetAknowlegment.Entity.orderHeader;
import com.elemetAknowlegment.Service.OrderService;

@RestController
public class ServiceController {
	//@Autowired
	//private OrderService orderSer;
	
	@GetMapping("/load")
	public String loadform() {
		return "Welcome";
	}

	//@PostMapping("/saveorder")
	//public orderHeader saveorder(@RequestBody orderHeader oheader) {
		
		//orderHeader addorder = orderSer.addorder(oheader);
		
		//System.out.println(addorder.getOrderitems().getProductQuantity());
		//return addorder;
		
		
	}

