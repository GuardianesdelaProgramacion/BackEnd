package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musarana.app.entity.Seccion;
import com.musarana.app.repository.ISeccionRepository;
@Service
public class SeccionServiceImp implements ISeccionService{
@Autowired
ISeccionRepository seccionRepository;
	@Override
	public List<Seccion> findAllSeccion() {
		return (List<Seccion>) seccionRepository.findAll();
	}

	@Override
	public Seccion saveSeccion(Seccion seccion) {
		return seccionRepository.save(seccion);
	}

	@Override
	public Seccion deleteSeccionById(Long id) {
		Seccion seccion= findSeccionbyId(id);
		seccionRepository.deleteById(id);
		return seccion;
	}

	@Override
	public Seccion findSeccionbyId(Long id) {
		return seccionRepository.findById(id).orElse(null);
	}

}
