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

import com.musarana.app.entity.Categoria;
import com.musarana.app.service.ICategoriaService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="/api")
public class CategoriaRestController {
	@Autowired
	ICategoriaService categoriaService;
	
	@GetMapping("/categoria")
	public List <Categoria> categoria(){
		return categoriaService.findAllCategoria();
	}
	
	@GetMapping("/categoria/{id}")
	public Categoria blogById(@PathVariable Long id) {		
		return categoriaService.findCategoriabyId(id);
	}
	
	@PostMapping("/categoria")
	public Categoria newCustomer(@RequestBody Categoria categoria) {
		categoria.setIdCategoria(null);
		return categoriaService.saveCategoria(categoria);
	}
	
	@PutMapping("/categoria")
	public Categoria replaCategoria(@RequestBody Categoria categoria) {
		//Filtros para asegurar que esté un ID y exista
		return categoriaService.saveCategoria(categoria);
	}
	
	@DeleteMapping("categoria/{id}")
	public Categoria byeCategoria(@PathVariable Long id) {
		return categoriaService.deleteCategoriaById(id);
	}
}
