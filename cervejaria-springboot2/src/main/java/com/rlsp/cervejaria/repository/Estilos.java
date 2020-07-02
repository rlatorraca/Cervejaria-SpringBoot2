package com.rlsp.cervejaria.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rlsp.cervejaria.model.Estilo;
import com.rlsp.cervejaria.repository.helper.estilo.EstilosQueries;

@Repository
public interface Estilos extends JpaRepository<Estilo, Long>, EstilosQueries {

	public Optional<Estilo> findByNomeIgnoreCase(String nome);
	
}
