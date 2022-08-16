package com.musarana.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.musarana.app.entity.ModoDeUso;
import com.musarana.app.service.IModoDeUsoService;
import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path="api")
public class ModoDeUsoRestController {
	@Autowired
	IModoDeUsoService modoDeUsoService;
	@GetMapping("/mododeuso")
	public List<ModoDeUso> modoDeUso(){
		return modoDeUsoService.findAllModoDeUso();
	}
}
	
