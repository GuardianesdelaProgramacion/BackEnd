package com.musarana.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="imagen_producto")
public class ImagenProducto implements Serializable {
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idImagenProducto;
	@Column(name="imagen")
	private String imagen;
}
