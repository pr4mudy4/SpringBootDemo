package com.setha.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjeksiViaConstructor {
	
	//menggunakan method constructor
	private HalloSpringService halloSpringService;
	
	//constructor
	@Autowired
	public InjeksiViaConstructor(HalloSpringService halloSpringService) {
		
		this.halloSpringService = halloSpringService;
	}
	
	public void getMessage(){
		halloSpringService.sayHallo();
	}
	
}
