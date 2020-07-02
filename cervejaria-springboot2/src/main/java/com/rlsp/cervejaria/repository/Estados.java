package com.rlsp.cervejaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rlsp.cervejaria.model.Estado;

@Repository
public interface Estados extends JpaRepository<Estado, Long> {

}
