package com.arturdev.dsvendas.dto;

import java.io.Serializable;

import com.arturdev.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public SellerDTO() {
	}
	
	public SellerDTO(Seller entidade) {
		id = entidade.getId();
		name = entidade.getName();
	}
	
	public SellerDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
