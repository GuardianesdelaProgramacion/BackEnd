package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musarana.app.entity.Presentacion;
import com.musarana.app.repository.IPresentacionRepository;
@Service
public class PresentacionServiceImp implements IPresentacionService {
	@Autowired
	IPresentacionRepository presentacionRepository;
	@Override
	public List<Presentacion> findAllPresentacion() {
		return (List<Presentacion>) presentacionRepository.findAll();

	}

	@Override
	public Presentacion savePresentacion(Presentacion presentacion) {
		return presentacionRepository.save(presentacion);

	}

	@Override
	public Presentacion deletePresentacionById(Long id) {
		Presentacion presentacion= findPresentacionbyId(id);
		presentacionRepository.deleteById(id);
		return presentacion;

	}

	@Override
	public Presentacion findPresentacionbyId(Long id) {
		// TODO Auto-generated method stub
		return presentacionRepository.findById(id).orElse(null);

	}

}
