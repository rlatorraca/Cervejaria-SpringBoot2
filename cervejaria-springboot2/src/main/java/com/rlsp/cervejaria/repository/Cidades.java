package com.rlsp.cervejaria.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlsp.cervejaria.model.Cidade;
import com.rlsp.cervejaria.model.Estado;
import com.rlsp.cervejaria.repository.helper.cidade.CidadesRepositoryQueries;

public interface Cidades extends JpaRepository<Cidade, Long>, CidadesRepositoryQueries {

	public List<Cidade> findByEstadoCodigo(Long codigoEstado);

	public Optional<Cidade> findByNomeAndEstado(String nome, Estado estado);
	
}
