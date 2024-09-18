package com.linktic.microservicio.app.servicios.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.linktic.microservicio.app.commons.models.entitys.Servicio;
import com.linktic.microservicio.app.servicios.services.ServicioService;
import com.linktic.microservicio.commons.controllers.CommonController;

public class ServicioController extends CommonController<Servicio, ServicioService>{

	@PutMapping("/{id}")
	public ResponseEntity<?> edit(@RequestBody Servicio servicio, @PathVariable Long id){
		Optional<Servicio> o = service.findById(id);
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Servicio servicioDb = o.get();
		servicioDb.setServiceName(servicio.getServiceName());
		servicioDb.setDescription(servicio.getDescription());
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(servicioDb));
		
	}
	
}
