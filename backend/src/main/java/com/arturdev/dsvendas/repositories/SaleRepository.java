package com.arturdev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturdev.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
}
