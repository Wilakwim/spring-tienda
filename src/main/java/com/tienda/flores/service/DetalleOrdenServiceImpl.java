package com.tienda.flores.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.flores.model.DetalleOrden;
import com.tienda.flores.repository.IDetalleOrdenRepository;

@Service
public class DetalleOrdenServiceImpl implements IDetalleOrdenService{
	
	
	
	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;
	

	@Override
	public DetalleOrden save(DetalleOrden detalleOrden) {
		return detalleOrdenRepository.save(detalleOrden);
		
	}
		
	
}