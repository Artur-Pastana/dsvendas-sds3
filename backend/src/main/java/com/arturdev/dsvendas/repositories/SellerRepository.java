package com.arturdev.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arturdev.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {
	
}
