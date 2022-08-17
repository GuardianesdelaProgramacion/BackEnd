package com.musarana.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musarana.app.entity.Usuario;
import com.musarana.app.service.IUsuarioService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api")
public class UsuarioRestController {
	@Autowired
	IUsuarioService usuarioService;
	@GetMapping("/usuario")
	public List <Usuario> usuario(){
		return usuarioService.findAllUsuario();
	}
}
