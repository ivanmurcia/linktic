package com.linktic.microservicio.app.reservas.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.linktic.microservicio.app.reservas.models.entity.Reserva;

public interface ReservaRepository extends CrudRepository<Reserva, Long>{

}
