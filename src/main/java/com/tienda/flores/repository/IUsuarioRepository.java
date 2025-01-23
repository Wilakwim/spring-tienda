package com.tienda.flores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.flores.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer>{

}

