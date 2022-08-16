package com.musarana.app.entity;
import java.io.Serializable;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name= "productos")
public class Productos implements Serializable {
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProductos;
	@Column(name="sku")
	private String sku;
	@Column(name="nombre_producto")
	private String nombreProducto;
	@Column(name="precio")
	private Float  precio;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@Column(name="id_modo_de_uso")
	private ModoDeUso idmodoDeUso;
	@Column(name="id_categoria")
	private Integer idCategoria;
	@Column(name="inventario")
	private Integer inventario;
	@Column(name="ingredientes")
	private String ingredientes;
	@Column(name="id_presentacion")
	private Integer idPresentacion;
	@Column(name="descripcion")
	private String descripcion;


	public Productos() {
		
	}
	/**
	 * 
	 * @param sku
	 * @param nombreProducto
	 * @param precio
	 * @param número del Modo De Uso
	 * @param número de la Categoría
	 * @param inventario
	 * @param ingredientes
	 * @param número de la Presentación
	 * @param descripción
	 */
	public Productos(String sku, String nombreProducto, Float precio, ModoDeUso idmodoDeUso, Integer idCategoria, Integer inventario, String ingredientes, Integer idPresentacion, String descripcion) {
	this.sku=sku;
	this.nombreProducto=nombreProducto;
	this.precio=precio;
	this.idmodoDeUso=idmodoDeUso;
	this.idCategoria=idCategoria;
	this.inventario=inventario;
	this.ingredientes=ingredientes;
	this.idPresentacion=idPresentacion;
	this.descripcion=descripcion;
	}
}
