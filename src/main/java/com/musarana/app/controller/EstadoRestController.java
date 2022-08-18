package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public List<Estado> estado(){
		return estadoService.findAllEstado();
	}
	
	@GetMapping("/estado/{id}")
	public Estado estadoById(@PathVariable Long id) {		
		return estadoService.findEstadobyId(id);
	}
	
	@PostMapping("/estado")
	public Estado newEstado(@RequestBody Estado estado) {
		estado.setIdEstado(null);
		return estadoService.saveEstado(estado);
	}
	
	@PutMapping("/estado")
	public Estado replaceEstado(@RequestBody Estado estado) {
		//Filtros para asegurar que esté un ID y exista
		return estadoService.saveEstado(estado);
	}
	
	@DeleteMapping("estado/{id}")
	public Estado byeEstado(@PathVariable Long id) {
		return estadoService.deleteEstadoById(id);
	}
}
