package com.musarana.app.service;
import java.util.List;
import com.musarana.app.entity.Orden;

public interface IOrdenService {
	public List<Orden> findAllOrden();
	public Orden saveOrden(Orden orden);
	public Orden deleteOrdenById(Long id);
	public Orden findOrdenbyId(Long id);
}
