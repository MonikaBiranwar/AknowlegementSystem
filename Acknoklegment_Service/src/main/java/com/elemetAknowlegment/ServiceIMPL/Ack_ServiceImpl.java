package com.elemetAknowlegment.ServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.elemetAknowlegment.Entity.orderHeader;
import com.elemetAknowlegment.Service.AckService;

public class Ack_ServiceImpl implements  AckService{

	RestTemplate restTemp = new RestTemplate();
	@Autowired
	private Environment env;
	
	@Override
	public orderHeader addorder(orderHeader order) {
		String bsRoot = env.getProperty("api.bs.root");
		
		String url = bsRoot+"/save";
		
		HttpHeaders httpHeaders = new HttpHeaders();
		//org.springframework.http.HttpHeaders httpHeaders = new org.springframework.http.HttpHeaders();
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<orderHeader> httpEntity = new HttpEntity<>(order, httpHeaders);
		
		ResponseEntity<orderHeader> response = restTemp.exchange(url, HttpMethod.POST, httpEntity,orderHeader.class);
		
		//restTemp.delete(null);
		return response.getBody();
	}

	
}
