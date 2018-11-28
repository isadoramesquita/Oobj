package com.sistemaweb.main;

import com.sistemaweb.dao.PessoaDAO;
import com.sistemaweb.model.Pessoa;

public class TestarPessoa {

	public static void main(String[] args) {

		PessoaDAO DB = new PessoaDAO();
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Teste");
		pessoa.setTelefone(62999632520L);
		pessoa.setEmail("teste@teste.com");
		pessoa.setEmpresa("Oobj");
		
		
		// ver como colocar pessoa.setUltimoAcesso(new Date());

		DB.inserirPessoa(pessoa);
	}

}
