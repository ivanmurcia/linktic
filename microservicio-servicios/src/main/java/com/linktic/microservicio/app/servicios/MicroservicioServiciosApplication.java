package com.linktic.microservicio.app.servicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.linktic.microservicio.app.commons.models.entitys"})
public class MicroservicioServiciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioServiciosApplication.class, args);
	}

}
