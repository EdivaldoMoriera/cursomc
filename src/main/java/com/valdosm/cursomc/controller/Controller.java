package com.valdosm.cursomc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class Controller {
	     @RequestMapping(method = RequestMethod.GET)
	    public String  listar() {
	        return "bem vindos ao vc code spring";
	    }
	      
	}