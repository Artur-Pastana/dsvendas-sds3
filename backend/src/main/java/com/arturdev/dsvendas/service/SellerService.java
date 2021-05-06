package com.arturdev.dsvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arturdev.dsvendas.dto.SellerDTO;
import com.arturdev.dsvendas.entities.Seller;
import com.arturdev.dsvendas.repositories.SellerRepository;

@Service
public class SellerService  {
	
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> resultado = repository.findAll();
		return resultado.stream()
				.map(x -> new SellerDTO(x))
				.collect(Collectors.toList());
	}
}
