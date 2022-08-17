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
	
	@GetMapping("/imgproducto/{id}")
	public ImagenProducto imagenProductoById (@PathVariable Long id) {		
		return imagenproductoService.findImagenProductobyId(id);
	}
	
	@PostMapping("/imgproducto")
	public ImagenProducto newCustomer(@RequestBody ImagenProducto imagenproducto) {
		imagenproducto.setIdImagenProducto(null);
		return imagenproductoService.saveImagenProducto(imagenproducto);
	}
	
	@PutMapping("/imgproducto")
	public ImagenProducto replaceImagenProducto(@RequestBody ImagenProducto imagenproducto) {
		//Filtros para asegurar que esté un ID y exista
		return imagenproductoService.saveImagenProducto(imagenproducto);
	}
	
	@DeleteMapping("imgproducto/{id}")
	public ImagenProducto byeImagenProducto(@PathVariable Long id) {
		return imagenproductoService.deleteImagenProductoById(id);
	}
}
