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

import com.musarana.app.entity.Contacto;
import com.musarana.app.service.IContactoService;


@CrossOrigin(origins="*")
@RestController
@RequestMapping(path="/api")
public class ContactoRestController {
	@Autowired
	IContactoService contactoService;
	
	@GetMapping("/contacto")
	public List <Contacto> contacto(){
		return contactoService.findAllcontacto();
	}
	
	@GetMapping("/contacto/{id}")
	public Contacto contactoById(@PathVariable Long id) {		
		return contactoService.findContactobyId(id);
	}
	
	@PostMapping("/contacto")
	public Contacto newContacto(@RequestBody Contacto contacto) {
		contacto.setIdContacto(null);
		return contactoService.saveContacto(contacto);
	}
	
	@PutMapping("/contacto")
	public Contacto replaceContacto(@RequestBody Contacto contacto) {
		//Filtros para asegurar que esté un ID y exista
		return contactoService.saveContacto(contacto);
	}
	
	@DeleteMapping("contacto/{id}")
	public Contacto byeContacto(@PathVariable Long id) {
		return contactoService.deleteContactoById(id);
	}
}
