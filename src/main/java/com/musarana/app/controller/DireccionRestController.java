package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musarana.app.entity.Direccion;
import com.musarana.app.service.IDireccionService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api")
public class DireccionRestController {
	@Autowired
	IDireccionService direccionService;
	@GetMapping("/direccion")
	public List <Direccion> direccion(){
		return direccionService.findAllDireccion();
	}

}
