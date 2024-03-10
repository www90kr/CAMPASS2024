package com.campass.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/com")
public class ComKnowhowViewController {
	// 게시판 리스트
	  	@GetMapping("/knowhow")
		public ModelAndView boardlist() {
	  		
	  		return new ModelAndView("com/knowhow/list"); 
		}
	  	
}
