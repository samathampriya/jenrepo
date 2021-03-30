package com.scopes.demoScope.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("session")
public class ServiceClass {
	
	public void test(){
		
		System.out.println(this);
		
	}

}
