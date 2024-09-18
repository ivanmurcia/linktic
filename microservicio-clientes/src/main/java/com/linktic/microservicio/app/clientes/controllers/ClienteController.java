package com.linktic.microservicio.app.clientes.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.linktic.microservicio.app.clientes.services.ClienteService;
import com.linktic.microservicio.app.commons.models.entitys.Cliente;
import com.linktic.microservicio.commons.controllers.CommonController;

@RestController
public class ClienteController extends CommonController<Cliente, ClienteService>{

	@PutMapping("/{id}")
	public ResponseEntity<?> edit(@RequestBody Cliente cliente, @PathVariable Long id){
		Optional<Cliente> o = service.findById(id);
		if(o.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		
		Cliente clienteDb = o.get();
		clienteDb.setIdentityDocument(cliente.getIdentityDocument());
		clienteDb.setFirstName(cliente.getFirstName());
		clienteDb.setSecondName(cliente.getSecondName());
		clienteDb.setFirstLastName(cliente.getFirstLastName());
		clienteDb.setSecondLastName(cliente.getSecondLastName());
		clienteDb.setPhone(cliente.getPhone());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(clienteDb));
		
	}
		
}
