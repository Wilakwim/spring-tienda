package com.tienda.flores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.flores.model.Producto;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {

}
