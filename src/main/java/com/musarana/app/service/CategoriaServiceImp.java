package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musarana.app.entity.Categoria;
import com.musarana.app.repository.ICategoriaRepository;
@Service
public class CategoriaServiceImp implements ICategoriaService {
	@Autowired
	ICategoriaRepository categoriaRepository;
	@Override
	public List<Categoria> findAllCategoria() {
		return (List<Categoria>) categoriaRepository.findAll();
	}

	@Override
	public Categoria saveCategoria(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}

	@Override
	public Categoria deleteCategoriaById(Long id) {
		Categoria categoria= findCategoriabyId(id);
		categoriaRepository.deleteById(id);
		return categoria;

	}

	@Override
	public Categoria findCategoriabyId(Long id) {
		return categoriaRepository.findById(id).orElse(null);
	}

}
