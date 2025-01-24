package com.tienda.flores.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.flores.model.Orden;
import com.tienda.flores.repository.IOrdenRepository;

@Service
public class OrdenServiceImpl implements IOrdenService {

	@Autowired
	private IOrdenRepository ordenRepository;
	
	
	@Override
	public Orden save(Orden orden) {
		return ordenRepository.save(orden);
	
	}
	
	
}