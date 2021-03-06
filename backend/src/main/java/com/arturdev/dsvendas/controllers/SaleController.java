package com.arturdev.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arturdev.dsvendas.dto.SaleDTO;
import com.arturdev.dsvendas.dto.SaleSucessDTO;
import com.arturdev.dsvendas.dto.SaleSumDTO;
import com.arturdev.dsvendas.service.SaleService;

@RestController
//indicar qual é o caminho desse recurso web
@RequestMapping(value = "/sales")
public class SaleController {
	
	//o controlador depende do servico
	@Autowired
	private SaleService service;
	
	//acessar esse endpoint
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);//ok vai devolver a resposta 200 de sucesso
	}
	
	@GetMapping(value = "/sum-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
		List<SaleSumDTO> list = service.amountGroupedBySeller();
		return ResponseEntity.ok(list);//ok vai devolver a resposta 200 de sucesso
	}
	
	@GetMapping(value = "/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>> sucessGroupedBySeller(){
		List<SaleSucessDTO> list = service.sucessGroupedBySeller();
		return ResponseEntity.ok(list);//ok vai devolver a resposta 200 de sucesso
	}
}
