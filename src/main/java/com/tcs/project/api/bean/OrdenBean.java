package com.tcs.project.api.bean;

import java.time.LocalTime;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrdenBean {

	@JsonProperty("idOrden")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Long idOrden;

	@JsonProperty("fechaOrden")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private LocalTime fechaOrden;

	@JsonProperty("idProducto")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Long idProducto;

	@JsonProperty("idCliente")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Long idCliente;

	@JsonProperty("cantidad")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int cantidad;

	@JsonProperty("detalle")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String detalle;

	@JsonProperty("total")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int total;

	@JsonProperty("estado")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String estado;

	public Long getIdOrden() {
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

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	
}
