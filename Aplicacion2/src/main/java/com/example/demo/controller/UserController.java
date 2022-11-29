package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Se le indica que es un metodo controller
public class UserController {
	
	@GetMapping("/")
	//El string es para que redireccione a el archivo html en especifico
	public String index() {
		return "index";
	}
	
	@GetMapping("/userForm")
	//El string es para que redireccione a el archivo html en especifico
	public String userForm() {
		return "user-form/user-view";
	}

}
