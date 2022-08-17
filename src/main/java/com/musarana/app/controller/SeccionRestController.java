package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musarana.app.entity.Seccion;
import com.musarana.app.service.ISeccionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api")
public class SeccionRestController {
	@Autowired
	ISeccionService seccionService;
	@GetMapping(path="/seccion")
	public List<Seccion> seccion(){
		return seccionService.findAllSeccion();
	}
}
