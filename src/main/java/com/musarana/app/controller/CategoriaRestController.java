package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
}
