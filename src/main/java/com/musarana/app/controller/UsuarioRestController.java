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
	
	@GetMapping("/usuario/{id}")
	public Usuario usuarioById(@PathVariable Long id) {		
		return usuarioService.findUsuariobyId(id);
	}
	
	@PostMapping("/usuario")
	public Usuario newUsuario(@RequestBody Usuario usuario) {
		usuario.setIdUsuario(null);
		return usuarioService.saveUsuario(usuario);
	}
	
	@PutMapping("/usuario")
	public Usuario replaceUsuario(@RequestBody Usuario usuario) {
		//Filtros para asegurar que esté un ID y exista
		return usuarioService.saveUsuario(usuario);
	}
	
	@DeleteMapping("usuario/{id}")
	public Usuario byeUsuario(@PathVariable Long id) {
		return usuarioService.deleteUsuarioById(id);
	}
}
