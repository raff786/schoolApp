package com.mastek.schoolApp.api;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.mastek.schoolApp.services.StudentsService;
@Component // declare it as spring component 
public class APIConfig
			 extends ResourceConfig{
	
	
	
	public APIConfig() {
		register(StudentsService.class);

}
}