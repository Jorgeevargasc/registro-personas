package co.com.registropersonas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;


@Entity @Getter @Setter
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotEmpty
	private String nombre;
	@NotEmpty
	private String apellido;	
	private boolean procesado;
	
	
	

}
