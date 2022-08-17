package com.musarana.app.service;

import java.util.List;

import com.musarana.app.entity.Estado;


public interface IEstadoService {
	public List<Estado> findAllEstado();
	public Estado saveEstado(Estado estado);
	public Estado deleteEstadoById(Long id);
	public Estado findEstadobyId(Long id);
}
