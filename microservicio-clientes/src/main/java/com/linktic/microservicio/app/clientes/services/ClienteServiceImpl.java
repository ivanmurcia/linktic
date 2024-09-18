package com.linktic.microservicio.app.clientes.services;

import org.springframework.stereotype.Service;

import com.linktic.microservicio.app.clientes.models.repository.ClienteRepository;
import com.linktic.microservicio.app.commons.models.entitys.Cliente;
import com.linktic.microservicio.commons.service.CommonServiceImpl;

@Service
public class ClienteServiceImpl extends CommonServiceImpl<Cliente, ClienteRepository> implements ClienteService {
	
}
