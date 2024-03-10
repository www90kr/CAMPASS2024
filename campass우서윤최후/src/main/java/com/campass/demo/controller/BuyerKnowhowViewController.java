package com.campass.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/buyer")
public class BuyerKnowhowViewController {
  	@GetMapping("/knowhow")
	public ModelAndView boardlist() {
  		return new ModelAndView("buyer/knowhow/list"); 
	}
}
