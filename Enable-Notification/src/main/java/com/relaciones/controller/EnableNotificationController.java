package com.relaciones.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnableNotificationController {

	
	@PostMapping("/enablenotification")
	public String enableNotification(@RequestBody String affirmation) {
		
		System.out.println(affirmation);
		return null;
	}
	
	@RequestMapping("/")
	public String mandar() {
		return "que tal";
	}
}
