package com.tienda.flores.service;

import java.util.List;

import com.tienda.flores.model.Orden;

public interface IOrdenService {
    List<Orden> findAll();
	Orden save (Orden orden);
	
}
	

	