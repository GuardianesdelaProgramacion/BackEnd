package com.musarana.app.entity;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="blog")
public class Blog implements Serializable {
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idBlog;
    @Column(name="fecha")
	private Date fecha; 
	@Column (name="contenido")
	private String contenido;
	@Column (name="categoria_blog")
	private String categoriaBlog;
	@Column (name="titulo")
	private String titulo;
	@Column (name="resumen")
	private String resumen;
	

}