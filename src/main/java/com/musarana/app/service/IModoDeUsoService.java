package com.musarana.app.service;

import java.util.List;


import com.musarana.app.entity.ModoDeUso;

public interface IModoDeUsoService {
	public List<ModoDeUso> findAllModoDeUso();
	public ModoDeUso saveModoDeUso(ModoDeUso mododeuso);
	public ModoDeUso deleteModoDeUsoById(Long id);
	public ModoDeUso findModoDeUsobyId(Long id);
}
