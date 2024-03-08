package ar.com.vegasystems.entity;

import java.util.Date;

import ar.com.vegasystems.entity.enums.TipoUsuario;

public class Usuario {
	private Long dni;
	private String apellido;
	private String nombre;
	private Date fecNac;
	private String password;
	private Nacionalidad nacionalidad;
	private TipoUsuario tipoUsuario;
	
}
