package com.tienda.flores.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.flores.model.Orden;




@Repository
public interface IOrdenRepository extends JpaRepository<Orden, Integer> {
	
}
