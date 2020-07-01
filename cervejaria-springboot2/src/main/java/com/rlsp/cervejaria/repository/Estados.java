package com.rlsp.cervejaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rlsp.cervejaria.model.Estado;

public interface Estados extends JpaRepository<Estado, Long> {

}
