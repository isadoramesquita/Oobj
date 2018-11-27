package com.sistemaweb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;
import javax.validation.constraints.Size;

@Entity 
public class Pessoa {

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="nome", nullable=false, unique=true)
	private String nome;
	
	@Column(name="telefone", nullable=false, unique=true)
	private long telefone;
	
	@Column(name="e-mail")
	@Size (min=10, message="tamanho inválido", max=25)
	private String email;
	
	@Column(name="empresa", nullable=false, unique=true)
	private String empresa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getTelefone() {
		return telefone;
	}

	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
}
