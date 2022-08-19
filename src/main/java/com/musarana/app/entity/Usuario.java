package com.musarana.app.entity;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity
@Data
@Table (name="Usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	@Column (name="nombre")
	private String nombre;
	@Column (name="email")
	private String email;
	@Column (name="contrasenia")
	private String contrasenia;
	@Column (name="fecha_nacimiento")
	private Date fechaNacimiento;
	@Column(name="telefono")
	private Long telefono;
	@Column(name="metodo_de_pago")
	private String metodoPago;
	@Column(name="rol")
	private String rol;
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Direccion direccion;
	
	
}
