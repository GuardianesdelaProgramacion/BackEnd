package com.musarana.app.service;

import java.util.List;

import com.musarana.app.entity.Direccion;

public interface IDireccionService {
	public List<Direccion> findAllDireccion();
	public Direccion saveDireccion(Direccion direccion);
	public Direccion deleteDireccionById(Long id);
	public Direccion findDireccionbyId(Long id);

}
