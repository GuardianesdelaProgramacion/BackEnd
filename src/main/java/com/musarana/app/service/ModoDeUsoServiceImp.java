package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.musarana.app.entity.ModoDeUso;
import com.musarana.app.repository.IModoDeUsoRepository;
@Service
public class ModoDeUsoServiceImp implements IModoDeUsoService{
	@Autowired
	IModoDeUsoRepository modoDeUsoRepository;
	@Override
	public List<ModoDeUso> findAllModoDeUso() {
		
		return (List<ModoDeUso>) modoDeUsoRepository.findAll();
	}

	@Override
	public ModoDeUso saveModoDeUso(ModoDeUso mododeuso) {
		// TODO Auto-generated method stub
		return modoDeUsoRepository.save(mododeuso);
	}

	@Override
	public ModoDeUso deleteModoDeUsoById(Long id) {
		ModoDeUso modoDeUso= findModoDeUsobyId(id);
		modoDeUsoRepository.deleteById(id);
		return modoDeUso;
	}

	@Override
	public ModoDeUso findModoDeUsobyId(Long id) {
		// TODO Auto-generated method stub
		return modoDeUsoRepository.findById(id).orElse(null);
	}
	
	
}
