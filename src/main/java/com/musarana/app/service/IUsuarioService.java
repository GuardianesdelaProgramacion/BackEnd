package com.musarana.app.service;

import java.util.List;

import com.musarana.app.entity.Usuario;

public interface IUsuarioService {
	public List<Usuario> findAllUsuario();
	public Usuario saveUsuario(Usuario usuario);
	public Usuario deleteUsuarioById(Long id);
	public Usuario findUsuariobyId(Long id);

}
