package com.rlsp.cervejaria.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlsp.cervejaria.model.Cliente;
import com.rlsp.cervejaria.repository.helper.cliente.ClientesRepositoryQueries;

public interface Clientes extends JpaRepository<Cliente, Long>, ClientesRepositoryQueries {

	public Optional<Cliente> findByCpfOuCnpj(String cpfOuCnpj);

	public List<Cliente> findByNomeStartingWithIgnoreCase(String nome);

}
