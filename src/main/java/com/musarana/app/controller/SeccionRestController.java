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

import com.musarana.app.entity.Seccion;
import com.musarana.app.service.ISeccionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api")
public class SeccionRestController {
	@Autowired
	ISeccionService seccionService;

	@GetMapping(path = "/seccion")
	public List<Seccion> seccion() {
		return seccionService.findAllSeccion();
	}
	
	@GetMapping("/seccion/{id}")
	public Seccion seccionById(@PathVariable Long id) {		
		return seccionService.findSeccionbyId(id);
	}

	@PostMapping("/seccion")
	public Seccion newSeccion(@RequestBody Seccion seccion) {
		seccion.setSeccion(null);
		return seccionService.saveSeccion(seccion);
	}

	@PutMapping("/seccion")
	public Seccion replaceSeccion(@RequestBody Seccion seccion) {
		// Filtros para asegurar que esté un ID y exista
		return seccionService.saveSeccion(seccion);
	}

	@DeleteMapping("seccion/{id}")
	public Seccion byeSeccion(@PathVariable Long id) {
		return seccionService.deleteSeccionById(id);
	}
}
