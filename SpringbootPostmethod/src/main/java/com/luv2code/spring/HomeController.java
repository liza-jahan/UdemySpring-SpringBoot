package com.luv2code.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.luv2code.spring.model.Alien;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap m) {

		int num3 = i + j;
		m.addAttribute("num3", num3);
		return "result";
	}

	//@RequestMapping(value="addAline",method=RequestMethod.POST)
	@PostMapping(value="addAline")

	public String add(@ModelAttribute Alien a) {

	
		return "result";
	}
}
