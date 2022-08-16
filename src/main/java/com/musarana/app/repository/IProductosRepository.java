package com.musarana.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.musarana.app.entity.Productos;

public interface IProductosRepository extends CrudRepository<Productos, Long> {

}
