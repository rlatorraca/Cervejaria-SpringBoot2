package com.rlsp.cervejaria.repository.helper.usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.rlsp.cervejaria.model.Usuario;
import com.rlsp.cervejaria.repository.filter.UsuarioFilter;

public interface UsuariosQueries {

	public Optional<Usuario> porEmailEAtivo(String email);
	
	public List<String> permissoes(Usuario usuario);

	Page<Usuario> filtrar(UsuarioFilter filtro, Pageable pageable);
	
	public Usuario buscarComGrupos(Long codigo);
	
}
