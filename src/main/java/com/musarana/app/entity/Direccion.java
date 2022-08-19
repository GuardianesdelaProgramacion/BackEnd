package com.musarana.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table(name="direccion")
public class Direccion implements Serializable{
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDireccion;
	@Column (name="nombre")
	private String nombre;
	@Column (name="apellidos")
	private String apellidos;
	@Column(name="calle_no_ext_no_int", length=1000)
	private String calleyNumeros;
	@Column(name="colonia", length=1000)
	private String colonia;
	@Column(name="municipio", length=1000)
	private String municipio;
	@Column(name="codigo_postal")
	private String codigoPostal;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Estado estado;

}
