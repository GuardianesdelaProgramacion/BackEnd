package com.musarana.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.musarana.app.entity.Usuario;

public interface IUsuarioRepository extends CrudRepository<Usuario,Long>{

}
