package com.musarana.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@GetMapping("/mododeuso/{id}")
	public ModoDeUso modoDeUsoById(@PathVariable Long id) {		
		return modoDeUsoService.findModoDeUsobyId(id);
	}
	
	@PostMapping("/mododeuso")
	public ModoDeUso newModoDeUso(@RequestBody ModoDeUso modoDeUso) {
		modoDeUso.setIdmodoDeUso(null);
		return modoDeUsoService.saveModoDeUso(modoDeUso);
	}
	
	@PutMapping("/mododeuso")
	public ModoDeUso replaceModoDeUso(@RequestBody ModoDeUso modoDeUso) {
		//Filtros para asegurar que esté un ID y exista
		return modoDeUsoService.saveModoDeUso(modoDeUso);
	}
	
	@DeleteMapping("mododeuso/{id}")
	public ModoDeUso byeModoDeUso(@PathVariable Long id) {
		return modoDeUsoService.deleteModoDeUsoById(id);
	}
}
	
