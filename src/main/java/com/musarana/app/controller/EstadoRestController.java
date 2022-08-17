package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musarana.app.entity.Estado;
import com.musarana.app.service.IEstadoService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="api")
public class EstadoRestController {
	@Autowired
	IEstadoService estadoService;
	@GetMapping("/estado")
	public List<Estado> modoDeUso(){
		return estadoService.findAllEstado();
	}
}
