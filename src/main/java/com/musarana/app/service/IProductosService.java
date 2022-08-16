package com.musarana.app.service;

import java.util.List;

import com.musarana.app.entity.Productos;

public interface IProductosService {

	/**
	 * Enlista todos los productos
	 * @param Productos
	 * @return lista de producto
	 */
	public List<Productos> findAllProductos();	
	 /**
	  * Guarda un producto en la base de datos
	  * @param productos
	  * @return devuelve el producto con su Id 
	  */
	public Productos saveProductos (Productos productos);
	/**
	 * Borrar unn producto con su id
	 * @param id del producto a borrar
	 * @return
	 */
	public Productos deleteProductosById(Long id);
	/**
	 * Encontrar un producto en la base de datos
	 * @param id del producto
	 * @return
	 */
	
	public Productos findProductosbyId(Long id);
}
