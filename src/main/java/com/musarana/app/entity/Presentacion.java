package com.musarana.app.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;
@Entity
@Data
@Table(name="presentacion")
public class Presentacion implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPresentacion;
	@Column (name="presentacion")
	private String presentacion;
}
