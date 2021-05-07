package com.arturdev.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.arturdev.dsvendas.dto.SaleDTO;
import com.arturdev.dsvendas.dto.SaleSucessDTO;
import com.arturdev.dsvendas.dto.SaleSumDTO;
import com.arturdev.dsvendas.entities.Sale;
import com.arturdev.dsvendas.repositories.SaleRepository;
import com.arturdev.dsvendas.repositories.SellerRepository;

@Service
public class SaleService  {
	
	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		//trazer todos os dados para a jpa guardar esses
		//objetos em memoria para não ir novamente
		//acessar o banco
		sellerRepository.findAll();
		Page<Sale> resultado = repository.findAll(pageable);
		return resultado
				.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSucessDTO> sucessGroupedBySeller(){
		return repository.sucessGroupedBySeller();
	}
}
