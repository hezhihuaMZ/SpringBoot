package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String hello() {
		return "hello world!";
	}
	
	@RequestMapping("/getDemo")
	public Demo getDemo() {
		
		Demo demo = new Demo() ;
		demo.setId(1);
		demo.setName("jack");

		return demo;
	}
}
