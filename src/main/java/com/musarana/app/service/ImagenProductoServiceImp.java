package com.musarana.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.musarana.app.entity.ImagenProducto;
import com.musarana.app.repository.IImagenProductoRepository;
@Service
public class ImagenProductoServiceImp implements IImagenProductoService{
	@Autowired
	IImagenProductoRepository imagenProductoRepository;
	@Override
	public List<ImagenProducto> findAllImagenProducto() {
		return (List<ImagenProducto>) imagenProductoRepository.findAll();
	}

	@Override
	public ImagenProducto saveImagenProducto(ImagenProducto imagenproducto) {
		return imagenProductoRepository.save(imagenproducto);
	}

	@Override
	public ImagenProducto deleteImagenProductoById(Long id) {
		ImagenProducto imagenproducto= findImagenProductobyId(id);
		imagenProductoRepository.deleteById(id);
		return imagenproducto;
	}

	@Override
	public ImagenProducto findImagenProductobyId(Long id) {
		// TODO Auto-generated method stub
		return imagenProductoRepository.findById(id).orElse(null);
	}

}
