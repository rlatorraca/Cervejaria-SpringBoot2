package com.rlsp.cervejaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rlsp.cervejaria.model.Grupo;

@Repository
public interface Grupos extends JpaRepository<Grupo, Long> {

}
