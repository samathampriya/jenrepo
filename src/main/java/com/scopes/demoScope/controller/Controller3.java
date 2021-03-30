package com.scopes.demoScope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scopes.demoScope.service.ServiceClass;

@RestController
@Scope("prototype")
public class Controller3 {
	@Autowired
	private ServiceClass sc;
	
	@RequestMapping("Controller3")
	public void test(){
		System.out.println("Test In Controller3::"+sc);
		sc.test();
	}

}
