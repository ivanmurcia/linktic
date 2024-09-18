package com.linktic.microservicio.app.reservas.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.linktic.microservicio.app.reservas.models.entity.Reserva;
import com.linktic.microservicio.app.reservas.services.ReservaService;
import com.linktic.microservicio.commons.controllers.CommonController;

@RestController
public class ReservaController extends CommonController<Reserva, ReservaService>{

	@PutMapping("/{id}")
	public ResponseEntity<?> edit(@RequestBody Reserva reserva, @PathVariable Long id){
		Optional<Reserva> o = service.findById(id);
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Reserva reservaDb = o.get();
		reservaDb.setDateReservation(reserva.getDateReservation());
		reservaDb.setService(reserva.getService());
		reservaDb.setCliente(reserva.getCliente());
				
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(reservaDb));
		
	}
	
}
