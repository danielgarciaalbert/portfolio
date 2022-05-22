package com.wander.app.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	private static String MAIN_URL = "main";
	
	@RequestMapping("/")
	public String start(Model model) {
		model.addAttribute("title", "¡Bienvenido a mi portfolio!");
		return MAIN_URL;
	}
}
