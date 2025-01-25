package com.tienda.flores.service;

import java.util.Optional;

import com.tienda.flores.model.Usuario;

public interface IUsuarioService {
      Optional<Usuario>findById(Integer id);
      Usuario save (Usuario usuario);
}
