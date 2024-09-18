package com.linktic.microservicio.app.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication
@EntityScan({"com.linktic.microservicio.app.commons.models.entitys"})
public class MicroservicioClientesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioClientesApplication.class, args);
	}

}
