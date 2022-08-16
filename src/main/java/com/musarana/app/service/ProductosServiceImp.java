package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.musarana.app.entity.Productos;
import com.musarana.app.repository.IProductosRepository;
@Service
public class ProductosServiceImp implements IProductosService{
	@Autowired
	IProductosRepository productosRepository;

	@Override
	public List<Productos> findAllProductos() {
		return (List<Productos>) productosRepository.findAll();
	}

	@Override
	public Productos saveProductos(Productos productos) {
		return productosRepository.save(productos);
	}

//	@Override
//	public Productos deleteProductosById(Long id) {
//		Productos= productos findProductosbyId(id);
//		productosRepository.deleteById(id);
//		return productos;
//	}

	@Override
	public Productos findProductosbyId(Long id) {
		return productosRepository.findById(id).orElse(null);
	}

	@Override
	public Productos deleteProductosById(Long id) {
		Productos productos= findProductosbyId(id);
		productosRepository.deleteById(id);
		return productos;
	}

}
