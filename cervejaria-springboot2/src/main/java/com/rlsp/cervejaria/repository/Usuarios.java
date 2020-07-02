package com.rlsp.cervejaria.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rlsp.cervejaria.model.Usuario;
import com.rlsp.cervejaria.repository.helper.usuario.UsuariosQueries;

@Repository
public interface Usuarios extends JpaRepository<Usuario, Long>, UsuariosQueries {

	public Optional<Usuario> findByEmail(String email);

	public List<Usuario> findByCodigoIn(Long[] codigos);

}
