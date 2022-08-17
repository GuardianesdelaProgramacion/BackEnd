package com.musarana.app.entity;
import java.io.Serializable;
import java.util.List;

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
	private ModoDeUso modoDeUso;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Categoria categoria;
	@Column(name="inventario")
	private Integer inventario;
	@Column(name="ingredientes")
	private String ingredientes;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Presentacion presentacion;
	@Column(name="descripcion")
	private String descripcion;
	@ManyToMany(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Seccion> seccion;
	@ManyToMany(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<ImagenProducto> imagenproducto;
	@ManyToMany (fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private List<Orden> orden;
	
	
	public Productos() {
		
	}

}

