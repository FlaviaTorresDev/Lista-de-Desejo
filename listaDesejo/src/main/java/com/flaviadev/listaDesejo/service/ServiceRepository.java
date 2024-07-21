package com.flaviadev.listaDesejo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flaviadev.listaDesejo.model.Desejo;
import com.flaviadev.listaDesejo.repository.DesejoRepository;

@Service
public class ServiceRepository {
	
	@Autowired
	private DesejoRepository desejoRepository;
	
	public Desejo creatDesejo(Desejo desejo) {
		return desejoRepository.save(desejo);
	}

	public List<Desejo> listDesejo(){
		return desejoRepository.findAll();
	}
}
