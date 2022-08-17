package com.musarana.app.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
@Entity
@Data
@Table(name="estado")
public class Estado implements Serializable{
	
		private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long idEstado;
		@Column (name="estado")
		private String estado;
}
