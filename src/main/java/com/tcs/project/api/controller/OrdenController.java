package com.tcs.project.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.project.api.bean.OrdenBean;
import com.tcs.project.api.service.OrdenService;

@RestController
public class OrdenController {
	
	private static Logger LOGGER = LoggerFactory.getLogger(OrdenController.class);

	@Autowired
	private OrdenService oservice;

	@RequestMapping(value = "/creaorden", produces = { "application/json" }, method = RequestMethod.POST)
	public ResponseEntity<OrdenBean> createOrden(@RequestBody OrdenBean ordenBean) {
		try {
			ordenBean = oservice.createOrden(ordenBean);
			LOGGER.info("Se va a proceder a crear la orden{}", ordenBean);
			return new ResponseEntity<OrdenBean>(ordenBean, HttpStatus.OK);
		} catch (Exception ex) {

			return new ResponseEntity<OrdenBean>(ordenBean, HttpStatus.BAD_REQUEST);

		}

	}

	@RequestMapping(value = "/buscaorden/{id}", produces = { "application/json" }, method = RequestMethod.GET)
	public OrdenBean getOrden(@PathVariable(value="id") long id) {
		
		return oservice.getOrden(id);
	}
	
	/*@RequestMapping(value ="/ordenes", produces = {"application/json"}, method = RequestMethod.GET)
	public ResponseEntity<List<OrdenBean>> getOrdenes(){
		
		return new ResponseEntity<List<OrdenBean>>(oservice.getOrdenes(),HttpStatus.OK);
		
	}*/
	
	
	/*@RequestMapping(value ="/ordenes/{idc}{est}{fec}", produces = {"application/json"}, method = RequestMethod.GET)
	public ResponseEntity<List<OrdenBean>> buscaOrden(@PathVariable(required=false, value="idc") Long idc, @PathVariable(required=false, value="est") String est, @PathVariable(required=false, value="fec") Date fec){
		
		return new ResponseEntity<List<OrdenBean>>(oservice.buscaOrden(idc,est,fec),HttpStatus.OK);
	}*/
}
