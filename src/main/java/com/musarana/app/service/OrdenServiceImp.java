package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.musarana.app.entity.Orden;
import com.musarana.app.repository.IOrdenRepository;
@Service
public class OrdenServiceImp implements IOrdenService{
	@Autowired
	IOrdenRepository ordenRepository;
	@Override
	public List<Orden> findAllOrden() {
		return (List<Orden>) ordenRepository.findAll();
	}

	@Override
	public Orden saveOrden(Orden orden) {
		return ordenRepository.save(orden);
	}

	@Override
	public Orden deleteOrdenById(Long id) {
		Orden orden= findOrdenbyId(id);
		ordenRepository.deleteById(id);
		return orden;
	}

	@Override
	public Orden findOrdenbyId(Long id) {
		return ordenRepository.findById(id).orElse(null);
	}

}
