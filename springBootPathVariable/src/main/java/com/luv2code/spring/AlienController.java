package com.luv2code.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.luv2code.spring.model.Alien;

@Controller
public class AlienController {
	@Autowired
	AlienRepo repo;

	@GetMapping("aliens")
	@ResponseBody
	public List<Alien> getAliens() {
		List<Alien> aliens = repo.findAll();
		return aliens;

	}
	// postman thake localhost:8080/aliens diya run krte hobe
	@GetMapping("alien/{aid}")
	@ResponseBody
	public Alien getAlien(@PathVariable("aid") int aid) {
		Alien alien = repo.findById(aid).orElse(new Alien(0,""));
		return alien;
	}
	// postman thake localhost:8080/alien/(104 or any number) diya run krte hobe
}
