package com.musarana.app.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="categoria")
public class Categoria implements Serializable {
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_categoria")
	private Long idCategoria;
	@Column(name="categoria")
	private String categoria;
	

}
