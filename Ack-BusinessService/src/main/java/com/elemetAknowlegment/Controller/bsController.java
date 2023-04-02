package com.elemetAknowlegment.Controller;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.elemetAknowlegment.Entity.orderHeader;
import com.elemetAknowlegment.Service.BusiService;

public class bsController {
	@Autowired
	private BusiService busiService;
	
	@PostMapping("/save")
	public orderHeader home(@RequestBody orderHeader order) {
		busiService.saveorder(order);
		return order;
	}

}
