package com.elemetAknowlegment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elemetAknowlegment.Entity.orderHeader;
import com.elemetAknowlegment.Service.OrderHeaderService;

@RestController
public class CoreController {
	@Autowired
	private OrderHeaderService orderHead;
	
	
	@GetMapping("/load")
	public ResponseEntity<String> load() {
		
		String msg ="Welcome to Supply Chain managment System";
		
		return new ResponseEntity<String>(msg, HttpStatus.OK);
		}

	@PostMapping("/saveorder")
	public orderHeader saveorder(@RequestBody orderHeader Order) {
		
		orderHeader addorder = orderHead.addorder(Order);
		
		return addorder;}
	
	@GetMapping("/get/{ordId}")
	public ResponseEntity<orderHeader> getorder(@PathVariable int ordId) {
		
		orderHeader orderData = orderHead.getOrderData(ordId);
		return new ResponseEntity<>(orderData, HttpStatus.OK);
}
	@DeleteMapping("/delete/{ordId}")
	public String deletData(@PathVariable int ordId) {
		return orderHead.deletById(ordId);}
	
	@PutMapping("/putFunction")
	public orderHeader putData (@RequestBody orderHeader o) {
	
		return orderHead.putOrderHeaderData(o);	
	}	
	
}


}
