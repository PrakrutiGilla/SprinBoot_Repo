package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Welcome {
	
	public String[] getcity() {
		return new String[] {"Hyd","Pune"};
	}
	
	public String[] getHotels() {
		return new String[] {"Paradise","Sangeetha"};
	}
	

}
