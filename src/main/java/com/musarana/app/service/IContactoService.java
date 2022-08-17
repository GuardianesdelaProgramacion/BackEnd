package com.musarana.app.service;

import java.util.List;

import com.musarana.app.entity.Contacto;

public interface IContactoService {
	public List<Contacto> findAllcontacto();
	public Contacto saveContacto(Contacto contacto);
	public Contacto deleteContactoById(Long id);
	public Contacto findContactobyId(Long id);
}
