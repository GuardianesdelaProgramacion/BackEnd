package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musarana.app.entity.ImagenProducto;
import com.musarana.app.service.IImagenProductoService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api")
public class ImagenProductoRestController {
	@Autowired
	IImagenProductoService imagenproductoService;
	@GetMapping("/imgproducto")
	public List <ImagenProducto> imagenproducto(){
		return imagenproductoService.findAllImagenProducto();
	}
}
