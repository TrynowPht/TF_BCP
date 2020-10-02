package com.relaciones.controller;

import java.util.Random;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class NotificationController {
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	public String getNotification() {
		Random aleatorio = new Random(System.currentTimeMillis());
		int numero = 1 + aleatorio.nextInt(4 - 1 + 1);
		
		switch(numero) {
		case 1:	return "Deposito";
		case 2: return "Login";
		case 3: return "Retiro"; 
		case 4: return "Promociones";
		}
		
		return null;
	}
	
	@RequestMapping("/")
	public String notification() throws JSONException{
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("notificacion", getNotification());
		return jsonObj.toString();
	}
}
