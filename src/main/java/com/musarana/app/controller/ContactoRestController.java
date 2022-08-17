package com.musarana.app.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
}
