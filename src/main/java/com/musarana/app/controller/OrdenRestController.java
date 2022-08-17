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

import com.musarana.app.entity.Orden;
import com.musarana.app.service.IOrdenService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api")
public class OrdenRestController {
	@Autowired
<<<<<<< HEAD:src/main/java/com/musarana/app/controller/OrdenRestController.java
	IOrdenService ordenService;
	@GetMapping("/orden")
	public List <Orden> orden(){
		return ordenService.findAllOrden();
=======
	IDireccionService direccionService;
	
	@GetMapping("/direccion")
	public List <Direccion> direccion(){
		return direccionService.findAllDireccion();
	}

	@GetMapping("/direccion/{id}")
	public Direccion direccionById(@PathVariable Long id) {		
		return direccionService.findDireccionbyId(id);
	}
	
	@PostMapping("/direccion")
	public Direccion newDireccion(@RequestBody Direccion direccion) {
		direccion.setIdDireccion(null);
		return direccionService.saveDireccion(direccion);
	}
	
	@PutMapping("/direccion")
	public Direccion replaceDireccion(@RequestBody Direccion direccion) {
		//Filtros para asegurar que esté un ID y exista
		return direccionService.saveDireccion(direccion);
	}
	
	@DeleteMapping("direccion/{id}")
	public Direccion byeDireccion(@PathVariable Long id) {
		return direccionService.deleteDireccionById(id);
	}
>>>>>>> entityproductos:src/main/java/com/musarana/app/controller/DireccionRestController.java
}
}	
