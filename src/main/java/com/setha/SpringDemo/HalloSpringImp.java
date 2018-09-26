package com.setha.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class HalloSpringImp implements HalloSpringService{

	@Override
	public void sayHallo() {
		// TODO Auto-generated method stub
		System.out.println("=================HALLO TEMAN MARI BELAJAR SPRING BOOT===============");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("firstname	: setha");
		System.out.println("lastname	: sakti pramudya");
		System.out.println("email		: setha.sakti@iconpln.co.id");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("====================================================================");
	}

}
