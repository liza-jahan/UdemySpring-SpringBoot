package com.luv2code.spring;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
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
	@Autowired
	AlienRepo repo;

	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name", "Aliens");
	}

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("getAliens")
	public String getAliens(Model m) {
		
		m.addAttribute("result", repo.findAll());
		System.out.println("fatching aliens");
		return "showAlien";

	}
	

	@GetMapping("getAlien")
	public String getAlien(@RequestParam int aid, Model m) {

		m.addAttribute("result", repo.getOne(aid));
		return "showAlien";

	}

	@GetMapping("getAlienByName")
	public String getAlienByName(@RequestParam String aname, Model m) {

		m.addAttribute("result", repo.find(aname));
		return "showAlien";

	}

	


	@PostMapping(value = "addAline")

	public String add(@ModelAttribute Alien a) {
		repo.save(a);

		return "result";
	}
}
