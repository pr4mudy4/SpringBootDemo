package com.setha.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjeksiViaSetter {
//menggunakan method setter
	
	private HalloSpringService halloSpringService;

	//setter
	@Autowired
	public void setHalloSpringService(HalloSpringService halloSpringService) {
		this.halloSpringService = halloSpringService;
	}
	
	
	public void getMessage(){
		halloSpringService.sayHallo();	
	}

}
