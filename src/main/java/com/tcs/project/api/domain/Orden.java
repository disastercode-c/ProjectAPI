package com.tcs.project.api.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ORDEN_DE_COMPRA")
public class Orden {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idOrden")
	private Long idOrden;

	@Column(name="fechaOrden")
	private Date fechaOrden;

	public Long getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Long idOrden) {
		this.idOrden = idOrden;
	}

	public Date getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}
	
	
	
	
	
}
