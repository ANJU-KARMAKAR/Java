package com.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisController {
	@ResponseBody
	@RequestMapping("/makeup")
	public String givenMakeupt() {
		return "OK...Sis";
	}
	@ResponseBody
	@RequestMapping("/book")
	public String getBook() {
		return "OK...Book";
	}
}
