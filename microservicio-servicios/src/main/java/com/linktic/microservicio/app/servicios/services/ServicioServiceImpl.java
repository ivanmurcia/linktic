package com.linktic.microservicio.app.servicios.services;

import org.springframework.stereotype.Service;

import com.linktic.microservicio.app.commons.models.entitys.Servicio;
import com.linktic.microservicio.app.servicios.models.repository.ServicioRepository;
import com.linktic.microservicio.commons.service.CommonServiceImpl;

@Service
public class ServicioServiceImpl extends CommonServiceImpl<Servicio, ServicioRepository> implements ServicioService {
	
}
