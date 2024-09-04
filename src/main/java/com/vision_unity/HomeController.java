package com.vision_unity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class HomeController {

	
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome To Vision Unity";
	}
	
}
