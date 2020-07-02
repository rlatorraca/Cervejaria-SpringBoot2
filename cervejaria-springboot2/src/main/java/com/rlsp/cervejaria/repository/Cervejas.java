package com.rlsp.cervejaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rlsp.cervejaria.model.Cerveja;
import com.rlsp.cervejaria.repository.helper.cerveja.CervejasQueries;

@Repository
public interface Cervejas extends JpaRepository<Cerveja, Long>, CervejasQueries {

}
