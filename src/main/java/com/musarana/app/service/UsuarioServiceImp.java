package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.musarana.app.entity.Usuario;
import com.musarana.app.repository.IUsuarioRepository;
@Service
public class UsuarioServiceImp implements IUsuarioService {
	@Autowired
	IUsuarioRepository usuariorepository;
	@Override
	public List<Usuario> findAllUsuario() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuariorepository.findAll();
	}

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuariorepository.save(usuario);
	}

	@Override
	public Usuario deleteUsuarioById(Long id) {
		Usuario usuario= findUsuariobyId(id);
		usuariorepository.deleteById(id);
		return usuario;
	}

	@Override
	public Usuario findUsuariobyId(Long id) {
		// TODO Auto-generated method stub
		return usuariorepository.findById(id).orElse(null);
	}

}
