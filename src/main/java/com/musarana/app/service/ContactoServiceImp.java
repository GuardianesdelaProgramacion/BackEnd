package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musarana.app.entity.Contacto;
import com.musarana.app.repository.IContactoRepository;
@Service
public class ContactoServiceImp implements IContactoService{
	@Autowired
	IContactoRepository contactoRepository;
	
	@Override
	public List<Contacto> findAllcontacto() {
		// TODO Auto-generated method stub
		return (List<Contacto>) contactoRepository.findAll();
	}

	@Override
	public Contacto saveContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		return contactoRepository.save(contacto);
	}

	@Override
	public Contacto deleteContactoById(Long id) {
		Contacto contacto= findContactobyId(id);
		contactoRepository.deleteById(id);
		return contacto;
	}

	@Override
	public Contacto findContactobyId(Long id) {
		return contactoRepository.findById(id).orElse(null);
	}

}
