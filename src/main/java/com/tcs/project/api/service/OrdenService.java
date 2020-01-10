package com.tcs.project.api.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.project.api.bean.OrdenBean;
import com.tcs.project.api.domain.Orden;
import com.tcs.project.api.jpa.OrdenRepository;

@Service
public class OrdenService {

	@Autowired
	private OrdenRepository repository;

	public OrdenBean createOrden(OrdenBean bean) {
		Orden o = new Orden();
		o.setFechaOrden(LocalTime.now());
		o.setIdCliente(bean.getIdCliente());
		o.setIdProducto(bean.getIdProducto());
		o.setDetalle(bean.getDetalle());
		o.setCantidad(bean.getCantidad());
		o.setEstado(bean.getEstado());
		o.setTotal(bean.getTotal());

		o = repository.save(o);

		bean.setIdOrden(o.getIdOrden());
		bean.setFechaOrden(o.getFechaOrden());

		return bean;

	}

	public OrdenBean obtenerOrdenBean(Orden orden) {
		OrdenBean bean = new OrdenBean();

		bean.setIdOrden(orden.getIdOrden());
		bean.setFechaOrden(orden.getFechaOrden());
		bean.setCantidad(orden.getCantidad());
		bean.setDetalle(orden.getDetalle());
		bean.setEstado(orden.getEstado());
		bean.setIdCliente(orden.getIdCliente());
		bean.setIdProducto(orden.getIdProducto());
		bean.setTotal(orden.getTotal());

		return bean;

	}

	public OrdenBean getOrden(long id) {
		Orden orden = repository.findById(id).get();

		return obtenerOrdenBean(orden);
	}

	/*public List<OrdenBean> getOrdenes() {
		List<Orden> ordenes = repository.findAll();

		return ordenes.stream().map(p -> obtenerOrdenBean(p)).collect(Collectors.toList());
	}*/

	
	/*public List<OrdenBean> buscaOrden(Long idc, String est, Date fec){
		List<Orden> ords = repository.findAll();
		for(Orden o : ords) {
			if (o.getIdCliente() == idc) {
				return ords.stream().map(p -> obtenerOrdenBean(p)).collect(Collectors.toList());
			}
		}			
		
	}*/
	
}
