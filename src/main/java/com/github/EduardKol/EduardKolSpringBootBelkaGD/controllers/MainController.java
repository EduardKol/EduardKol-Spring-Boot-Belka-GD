package com.github.EduardKol.EduardKolSpringBootBelkaGD.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

	@GetMapping("/") //вызов при переходе на главную страницу
	public String home(Model model) {
		model.addAttribute("title", "Главная страница сайта");
		return "home";
	}

	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "Страница про нас");
		return "about";
	}

}
