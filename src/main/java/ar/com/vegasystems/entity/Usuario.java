package ar.com.vegasystems.entity;

import java.util.Date;

import ar.com.vegasystems.entity.enums.TipoUsuario;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {
	@Id
	@Column(name = "usu_dni")
	private Long dni;
	@Column(name = "usu_apellido",nullable = false, length = 20)
	private String apellido;
	@Column(name = "usu_nombre",nullable = false, length = 20)
	private String nombre;
	@Column(name = "usu_fec_nac",nullable = false)
	private Date fecNac;
	@Column(name = "usu_password",nullable = false, length = 256)
	private String password;
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Nacionalidad nacionalidad;
	@Enumerated(EnumType.STRING)
	@Column(name = "usu_tipo_usuario", nullable = false)
	private TipoUsuario tipoUsuario;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Long dni, String apellido, String nombre, Date fecNac, String password, Nacionalidad nacionalidad,
			TipoUsuario tipoUsuario) {
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fecNac = fecNac;
		this.password = password;
		this.nacionalidad = nacionalidad;
		this.tipoUsuario = tipoUsuario;
	}

	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecNac() {
		return fecNac;
	}

	public void setFecNac(Date fecNac) {
		this.fecNac = fecNac;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	
}
