package com.bdi.sb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController {
	@GetMapping("/**")
	public String goPage(HttpServletRequest req) {
		return req.getRequestURI();
	}
	
	@GetMapping("/")
	public String home() {
		return "/front/index";
	}
}
