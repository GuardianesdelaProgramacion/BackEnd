package com.musarana.app.service;

import java.util.List;

import com.musarana.app.entity.Presentacion;

public interface IPresentacionService {
	public List<Presentacion> findAllPresentacion();
	public Presentacion savePresentacion(Presentacion presentacion);
	public Presentacion deletePresentacionById(Long id);
	public Presentacion findPresentacionbyId(Long id);
}

