package com.flaviadev.listaDesejo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flaviadev.listaDesejo.model.Desejo;
import com.flaviadev.listaDesejo.service.ServiceDesejo;

@RestController
@RequestMapping("/desejo")
public class ControllerDesejo {
	
	@Autowired
	private ServiceDesejo serviceDesejo;
	
	@PostMapping
	public Desejo createDesejo(@RequestBody Desejo desejo) {
		return serviceDesejo.creatDesejo(desejo);
	}

	@GetMapping
	public List<Desejo> listDesejo(){
		return serviceDesejo.listDesejo();
	}
}
