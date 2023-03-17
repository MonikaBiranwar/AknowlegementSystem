package com.elemetAknowlegment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elemetAknowlegment.Entity.orderHeader;
import com.elemetAknowlegment.Service.OrderService;

@RestController
public class ServiceController {
	@Autowired
	private OrderService orderSer;

	@PostMapping("/saveorder")
	public orderHeader saveorder(@RequestBody orderHeader oheader) {
		
		orderHeader addorder = orderSer.addorder(oheader);
		
		return addorder;
		
	}
}
