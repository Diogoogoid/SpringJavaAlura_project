package br.com.livrariaastec.loja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


	@RequestMapping("/")
	public String index() {
		System.out.println("home livraria");
		return "home";
	}

}
