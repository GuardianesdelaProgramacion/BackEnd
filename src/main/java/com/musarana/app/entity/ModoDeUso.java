package com.musarana.app.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="modo_de_uso")
public class ModoDeUso implements Serializable {
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="id_modo_de_uso")
	private Long idmodoDeUso;
	@Column (name="modo_de_Uso")
	private String modoDeUso;
	/**
	 * 
	 * @param la descripciónde Modo De Uso  
	 */
	public ModoDeUso(String modoDeUso) {
		this.modoDeUso=modoDeUso;
			}
}
