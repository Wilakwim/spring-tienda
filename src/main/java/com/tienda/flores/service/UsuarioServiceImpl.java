package com.tienda.flores.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tienda.flores.model.Usuario;
import com.tienda.flores.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public Optional<Usuario> findById(Integer id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	

}
