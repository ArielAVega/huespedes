package ar.com.vegasystems.entity;

import ar.com.vegasystems.entity.enums.EstadoHab;
import ar.com.vegasystems.entity.enums.TipoCama;
import ar.com.vegasystems.entity.enums.TipoHab;

public class Habitacion {
	private Long codigo;
	private String caracterisiticas;
	private TipoHab tipo;
	private TipoCama camas;
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
