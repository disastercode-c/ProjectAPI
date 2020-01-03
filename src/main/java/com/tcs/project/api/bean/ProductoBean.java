package com.tcs.project.api.bean;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductoBean {

	
	@JsonProperty("idProducto")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int idProducto;
	
	@JsonProperty("nombreProducto")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String nombreProducto;
	
	@JsonProperty("descripcion")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private String descripcion;
	
	@JsonProperty("stock")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int stock;
	
	@JsonProperty("precio")
	@JsonInclude(JsonInclude.Include.NON_NULL)
	private int precio;
	
}


