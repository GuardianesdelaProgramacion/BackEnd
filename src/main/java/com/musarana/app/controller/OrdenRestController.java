package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.musarana.app.entity.Orden;
import com.musarana.app.service.IOrdenService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api")
public class OrdenRestController {
	@Autowired
	IOrdenService ordenService;

	@GetMapping("/orden")
	public List <Orden> orden(){
		return ordenService.findAllOrden();
	}

	@GetMapping("/orden/{id}")
	public Orden ordenById(@PathVariable Long id) {		
		return ordenService.findOrdenbyId(id);
	}
	
	@PostMapping("/orden")
	public Orden newOrden(@RequestBody Orden orden) {
		orden.setIdOrden(null);
		return ordenService.saveOrden(orden);
	}
	
	@PutMapping("/orden")
	public Orden replaceOrden(@RequestBody Orden orden) {
		//Filtros para asegurar que esté un ID y exista
		return ordenService.saveOrden(orden);
	}
	
	@DeleteMapping("orden/{id}")
	public Orden byeOrden(@PathVariable Long id) {
		return ordenService.deleteOrdenById(id);
	}
}
		
	