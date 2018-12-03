package com.sistemaweb.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import org.hibernate.annotations.common.test.reflection.java.generics.deep.ANN612IssueTest.C;

@Entity
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String nome;

	private long telefone;

	@Size(min = 5, message = "tamanho inv�lido", max = 45)
	private String email;

	@Column()
	private String empresa;
	
	@Column(name="senha", nullable=false, unique=false)
    private String senha;

	@OneToMany()
	private List<Pessoa> amigos = new ArrayList<Pessoa>();

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public List<Pessoa> getAmigos() {
		return amigos;
	}

	public void setAmigos(List<Pessoa> amigos) {
		this.amigos = amigos;
	}
	
	public void adicionarAmigo(Pessoa amigo) {
		List<Pessoa> amigos = this.getAmigos();
		amigos.add(amigo);
		this.setAmigos(amigos);
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
}
