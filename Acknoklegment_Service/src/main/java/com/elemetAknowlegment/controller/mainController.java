package com.elemetAknowlegment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.elemetAknowlegment.Entity.orderHeader;
import com.elemetAknowlegment.Service.AckService;

@RestController
public class mainController {

	@Autowired
	private AckService ackSer;
	
	public ResponseEntity<orderHeader> saveorder(@RequestBody orderHeader order){

		try {
			
			orderHeader addorder = ackSer.addorder(order);
			return new ResponseEntity<> (addorder, HttpStatus.CREATED);
		}catch(Exception e) {
			e.printStackTrace();
			
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return null;
	}
}
