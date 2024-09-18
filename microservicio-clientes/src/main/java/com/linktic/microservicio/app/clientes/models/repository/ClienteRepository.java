package com.linktic.microservicio.app.clientes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.linktic.microservicio.app.commons.models.entitys.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
