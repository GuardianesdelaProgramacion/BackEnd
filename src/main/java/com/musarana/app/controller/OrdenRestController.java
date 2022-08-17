package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musarana.app.entity.Orden;
import com.musarana.app.service.IOrdenService;
@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api")
public class OrdenRestController {
	@Autowired
	IOrdenService ordenService;
	@GetMapping("/orden")
	public List <Orden> orden(){
		return ordenService.findAllOrden();
}
}	
