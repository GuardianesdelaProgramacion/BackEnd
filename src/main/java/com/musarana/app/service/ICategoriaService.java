package com.musarana.app.service;

import java.util.List;

import com.musarana.app.entity.Categoria;

public interface ICategoriaService {
	public List<Categoria> findAllCategoria();
	public Categoria saveCategoria(Categoria categoria);
	public Categoria deleteCategoriaById(Long id);
	public Categoria findCategoriabyId(Long id);
}
