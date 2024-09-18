package com.linktic.microservicio.app.reservas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.linktic.microservicio.app.commons.models.entitys",
			 "com.linktic.microservicio.app.reservas.models.entity"})
public class MicroserviciosReservasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosReservasApplication.class, args);
	}

}
