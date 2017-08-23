package com.ecf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cate")
public class PcategoryController {
	
	@RequestMapping("/{id}")
	public String showByCate(@PathVariable String id){
		return null;
		
	}
}
