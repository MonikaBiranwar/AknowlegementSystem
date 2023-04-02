package com.elemetAknowlegment.Service;




import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.elemetAknowlegment.Entity.orderHeader;

@Service
public class BusiService {
	
	private Environment envr;
	
	RestTemplate restTemplate = new RestTemplate();
	
	public orderHeader saveorder(@RequestBody orderHeader order) {
		String coreRoot = envr.getProperty("api.bs.root");
		
		String url =coreRoot+"/saveorder";
		HttpHeaders head = new HttpHeaders();
		head.setContentType(MediaType.APPLICATION_JSON);
		
		HttpEntity<orderHeader> entity = new HttpEntity<>(order, head);
		ResponseEntity<orderHeader> response = restTemplate.exchange(url, HttpMethod.POST, entity,orderHeader.class);
		
		return response.getBody();
	}
}
