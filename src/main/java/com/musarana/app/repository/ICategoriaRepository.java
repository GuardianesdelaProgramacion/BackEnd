package com.musarana.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.musarana.app.entity.Categoria;

public interface ICategoriaRepository extends CrudRepository<Categoria, Long> {

}
