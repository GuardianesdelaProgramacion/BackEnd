package com.musarana.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musarana.app.entity.Productos;
import com.musarana.app.service.IProductosService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api") // locaclhost:port/api
public class ProductosRestController {
	@Autowired
	IProductosService productosService;

	@GetMapping("/productos")
	public List<Productos> productos() {
		return productosService.findAllProductos();
	}

	@GetMapping("/productos/{id}")
	public Productos productosById(@PathVariable Long id) {
		return productosService.findProductosbyId(id);
	}

	@PostMapping("/productos")
	public Productos newProductos(@RequestBody Productos productos) {
		productos.setIdProductos(null);
		return productosService.saveProductos(productos);
	}

	@PutMapping("/productos")
	public Productos replaceProductos(@RequestBody Productos productos) {
		// Filtros para asegurar que esté un ID y exista
		return productosService.saveProductos(productos);
	}

	@DeleteMapping("productos/{id}")
	public Productos byeProductos(@PathVariable Long id) {
		return productosService.deleteProductosById(id);
	}
}
