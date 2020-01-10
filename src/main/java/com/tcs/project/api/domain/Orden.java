package com.tcs.project.api.domain;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ORDEN_DE_COMPRA")
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOrden")
	private long idOrden;

	@Column(name = "fechaOrden")
	private LocalTime fechaOrden;

	@Column(name = "idProducto")
	private long idProducto;

	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name = "Cliente", joinColumns = @JoinColumn(name="idCliente")
	, inverseJoinColumns = @JoinColumn(name="idOrden"))
	private long idCliente;

	@Column(name = "cantidad")
	private int cantidad;

	@Column(name = "detalle")
	private String detalle;

	@Column(name = "total")
	private int total;

	@Column(name = "estado")
	private String estado;

	public Orden() {
		super();
	}

	public Orden(LocalTime fechaOrden, long idProducto, long idCliente, int cantidad, String detalle, int total,
			String estado) {
		super();
		this.fechaOrden = fechaOrden;
		this.idProducto = idProducto;
		this.idCliente = idCliente;
		this.cantidad = cantidad;
		this.detalle = detalle;
		this.total = total;
		this.estado = estado;
	}

	public long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public long getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(Long idOrden) {
		this.idOrden = idOrden;
	}

	public LocalTime getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(LocalTime localTime) {
		this.fechaOrden = localTime;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
