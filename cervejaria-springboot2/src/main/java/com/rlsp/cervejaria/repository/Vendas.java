package com.rlsp.cervejaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rlsp.cervejaria.model.Venda;
import com.rlsp.cervejaria.repository.helper.venda.VendasCustom;

@Repository
public interface Vendas extends JpaRepository<Venda, Long>, VendasCustom {

}
