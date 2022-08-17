package com.musarana.app.entity;
import java.io.Serializable;
import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name="contacto")
public class Contacto implements Serializable{
	private static final long serialVersionUID =1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idContacto;
	@Column (name="nombre_cn")
	private String nombrecn;
	@Column (name="asunto_cn")
	private String astuntocn;
	@Column(name="telefono_cn")
	private Integer telefonocn;
	@Column(name="comentario")
	private String comentario;


public Contacto() {
	
}
}