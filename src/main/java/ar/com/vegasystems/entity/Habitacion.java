package ar.com.vegasystems.entity;

import ar.com.vegasystems.entity.enums.EstadoHab;
import ar.com.vegasystems.entity.enums.TipoCama;
import ar.com.vegasystems.entity.enums.TipoHab;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitaciones")
public class Habitacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "hab_codigo")
	private Long codigo;
	@Column(name = "hab_caracteristica",nullable = false, length = 256)
	private String caracterisiticas;
	@Enumerated(EnumType.STRING)
	@Column(name = "hab_tipo", nullable = false)
	private TipoHab tipo;
	@Enumerated(EnumType.STRING)
	@Column(name = "hab_cama", nullable = false)
	private TipoCama camas;
	@Enumerated(EnumType.STRING)
	@Column(name = "hab_estado", nullable = false)
	private EstadoHab estadoHab;
	
	public Habitacion() {
		// TODO Auto-generated constructor stub
	}

	public Habitacion(String caracterisiticas, TipoHab tipo, TipoCama camas, EstadoHab estadoHab) {
		this.caracterisiticas = caracterisiticas;
		this.tipo = tipo;
		this.camas = camas;
		this.estadoHab = estadoHab;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getCaracterisiticas() {
		return caracterisiticas;
	}

	public void setCaracterisiticas(String caracterisiticas) {
		this.caracterisiticas = caracterisiticas;
	}

	public TipoHab getTipo() {
		return tipo;
	}

	public void setTipo(TipoHab tipo) {
		this.tipo = tipo;
	}

	public TipoCama getCamas() {
		return camas;
	}

	public void setCamas(TipoCama camas) {
		this.camas = camas;
	}

	public EstadoHab getEstadoHab() {
		return estadoHab;
	}

	public void setEstadoHab(EstadoHab estadoHab) {
		this.estadoHab = estadoHab;
	}
	
	
}
