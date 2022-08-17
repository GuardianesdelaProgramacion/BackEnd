package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musarana.app.entity.Direccion;
import com.musarana.app.repository.IDireccionRepository;

@Service
public class DireccionServiceImp implements IDireccionService{
	
	@Autowired
	IDireccionRepository direccionRepository;

	@Override
	public List<Direccion> findAllDireccion() {
		return (List<Direccion>) direccionRepository.findAll();
	}

	@Override
	public Direccion saveDireccion(Direccion direccion) {
		return direccionRepository.save(direccion);
	}

	@Override
	public Direccion deleteDireccionById(Long id) {
		Direccion direccion= findDireccionbyId(id);
		direccionRepository.deleteById(id);
		return direccion;
	}

	@Override
	public Direccion findDireccionbyId(Long id) {
		return direccionRepository.findById(id).orElse(null);
	}

}
