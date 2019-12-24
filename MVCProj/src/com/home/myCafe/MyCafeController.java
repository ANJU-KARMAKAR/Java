package com.home.myCafe;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeController {

	@RequestMapping("/cafe")
	public String showWelcome(Model model) {
		/*
		 * String name="Anju"; model.addAttribute("value", name);
		 * model.addAttribute("titel", "Mom's Cafe");
		 */
		return "welcome-page";
	}
	@RequestMapping("/order")
	public String order(HttpServletRequest request, Model model) {
	String userValue=request.getParameter("foodType");
	model.addAttribute("userValue", userValue);
	return "process_order";
	}
}
