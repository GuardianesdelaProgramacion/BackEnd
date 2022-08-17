package com.musarana.app.service;

import java.util.List;

import com.musarana.app.entity.Seccion;

public interface ISeccionService {
	public List<Seccion> findAllSeccion();
	public Seccion saveSeccion(Seccion seccion);
	public Seccion deleteSeccionById(Long id);
	public Seccion findSeccionbyId(Long id);

}
