package com.sistemaweb.mb;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.sistemaweb.dao.PessoaDAO;
import com.sistemaweb.model.Pessoa;


@ManagedBean(name = "LoginMB")
@ViewScoped

public class LoginMB {

	private PessoaDAO pepssoaDAO = new PessoaDAO();
	private Pessoa pessoa = new Pessoa();


	
	// ver com o fábio pq não deu certo 



}
