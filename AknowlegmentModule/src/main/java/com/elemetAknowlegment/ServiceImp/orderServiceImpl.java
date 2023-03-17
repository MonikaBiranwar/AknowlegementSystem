package com.elemetAknowlegment.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elemetAknowlegment.Entity.orderHeader;
import com.elemetAknowlegment.Repository.orderHeaderRepository;
import com.elemetAknowlegment.Service.OrderService;
@Service
public class orderServiceImpl implements OrderService{

	@Autowired
	private orderHeaderRepository OrderHeaderRepo;
	
	@Override
	public orderHeader addorder(orderHeader Order) {
		
	orderHeader order = OrderHeaderRepo.save(Order);
	
		return order;
	}
	

}
