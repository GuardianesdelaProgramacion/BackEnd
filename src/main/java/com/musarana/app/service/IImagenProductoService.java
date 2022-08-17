package com.musarana.app.service;

import java.util.List;
import com.musarana.app.entity.ImagenProducto;

public interface IImagenProductoService {
	public List<ImagenProducto> findAllImagenProducto();
	public ImagenProducto saveImagenProducto(ImagenProducto imagenproducto);
	public ImagenProducto deleteImagenProductoById(Long id);
	public ImagenProducto findImagenProductobyId(Long id);
}
