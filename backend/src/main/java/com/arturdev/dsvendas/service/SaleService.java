package com.arturdev.dsvendas.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.arturdev.dsvendas.dto.SaleDTO;
import com.arturdev.dsvendas.entities.Sale;
import com.arturdev.dsvendas.repositories.SaleRepository;
import com.arturdev.dsvendas.repositories.SellerRepository;

@Service
public class SaleService  {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	public Page<SaleDTO> findAll(Pageable pageable) {
		//trazer todos os dados para a jpa guardar esses
		//objetos em memoria para não ir novamente
		//acessar o banco
		sellerRepository.findAll();
		Page<Sale> resultado = repository.findAll(pageable);
		return resultado
				.map(x -> new SaleDTO(x));
	}
}
