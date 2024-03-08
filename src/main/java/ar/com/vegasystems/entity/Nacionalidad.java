package ar.com.vegasystems.entity;

public class Nacionalidad {
	private Long id;
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
