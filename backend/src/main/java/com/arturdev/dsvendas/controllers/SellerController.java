package com.arturdev.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arturdev.dsvendas.dto.SellerDTO;
import com.arturdev.dsvendas.service.SellerService;

@RestController
//indicar qual é o caminho desse recurso web
@RequestMapping(value = "/sellers")
public class SellerController {
	
	//o controlador depende do servico
	@Autowired
	private SellerService service;
	
	//acessar esse endpoint
	@GetMapping
	public ResponseEntity<List<SellerDTO>> findAll(){
		List<SellerDTO> list = service.findAll();
		return ResponseEntity.ok(list);//ok vai devolver a resposta 200 de sucesso
	}
}
