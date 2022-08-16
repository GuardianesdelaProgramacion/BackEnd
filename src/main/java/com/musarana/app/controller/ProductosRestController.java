package com.musarana.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musarana.app.entity.Productos;
import com.musarana.app.service.IProductosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(path="/api") //locaclhost:port/api
public class ProductosRestController {
	@Autowired
	IProductosService productosService;
	@GetMapping("/productos")
	public List<Productos> productos(){
		return productosService.findAllProductos();
	}
}
