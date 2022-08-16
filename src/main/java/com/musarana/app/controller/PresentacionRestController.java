package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
	
}
