package com.arturdev.dsvendas.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

//mapeando a entidade para o banco
@Entity
@Table(name = "tb_sellers")
public class Seller {
	
	//mapeando a pk
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	//composicao de um para muitos
	@OneToMany(mappedBy = "seller")
	private List<Sale> sales = new ArrayList<>();
	
	public Seller() {
	}

	public Seller(Long id, String nome) {
		this.id = id;
		this.name = nome;
	}
	
	public Seller(Long id, String nome, List<Sale> sales) {
		this.id = id;
		this.name = nome;
		this.sales = sales;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public List<Sale> getSales() {
		return sales;
	}
	
}
