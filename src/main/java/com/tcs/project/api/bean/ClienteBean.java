package com.tcs.project.api.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteBean {

	@JsonProperty("idCliente")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private Long idCliente;
	
	@JsonProperty("rut")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String rut;
	
	@JsonProperty("dv")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String dv;
	
	@JsonProperty("paterno")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String paterno;
	
	@JsonProperty("materno")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String materno;
	
	@JsonProperty("nombreCliente")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String nombreCliente;
	
	@JsonProperty("email")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String email;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDv() {
		return dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	public String getPaterno() {
		return paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getMaterno() {
		return materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
