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

import com.musarana.app.entity.Presentacion;
import com.musarana.app.service.IPresentacionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api")
public class PresentacionRestController {
	@Autowired
	IPresentacionService presentacionService;
	
	@GetMapping("/presentacion")
	public List <Presentacion> presentacion(){
		return presentacionService.findAllPresentacion();
	}
	
	@GetMapping("/presentacion/{id}")
	public Presentacion presentacionById(@PathVariable Long id) {		
		return presentacionService.findPresentacionbyId(id);
	}
	
	@PostMapping("/presentacion")
	public Presentacion newPresentacion(@RequestBody Presentacion presentacion) {
		presentacion.setIdPresentacion(null);
		return presentacionService.savePresentacion(presentacion);
	}
	
	@PutMapping("/presentacion")
	public Presentacion replacePresentacion(@RequestBody Presentacion presentacion) {
		//Filtros para asegurar que esté un ID y exista
		return presentacionService.savePresentacion(presentacion);
	}
	
	@DeleteMapping("presentacion/{id}")
	public Presentacion byePresentacion(@PathVariable Long id) {
		return presentacionService.deletePresentacionById(id);
	}
}
