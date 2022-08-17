package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musarana.app.entity.Estado;
import com.musarana.app.repository.IEstadoRepository;


@Service
public class EstadosServiceImp implements IEstadoService {
	@Autowired
	IEstadoRepository estadoRepository;
	
	@Override
	public List<Estado> findAllEstado() {
		return (List<Estado>) estadoRepository.findAll();
	}

	@Override
	public Estado saveEstado(Estado estado) {
		return estadoRepository.save(estado);
	}

	@Override
	public Estado deleteEstadoById(Long id) {
		Estado estado= findEstadobyId(id);
		estadoRepository.deleteById(id);
		return estado;
	}

	@Override
	public Estado findEstadobyId(Long id) {
		return estadoRepository.findById(id).orElse(null);
	}

}
