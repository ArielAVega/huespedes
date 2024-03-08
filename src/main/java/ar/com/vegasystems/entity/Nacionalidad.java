package ar.com.vegasystems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "nacionalidades")
public class Nacionalidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nac_id")
	private Long id;
	@Column(name = "nac_nombre",nullable = false, length = 40)
	private String nombre;
	
	public Nacionalidad() {
		// TODO Auto-generated constructor stub
	}

	public Nacionalidad(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	

}
