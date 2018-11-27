package com.sistemaweb.mb;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.validation.ValidationException;

import com.sistemaweb.dao.PessoaDAO;
import com.sistemaweb.model.Pessoa;

@ManagedBean
@ViewScoped
public class PessoaMB {

	private final String TELA_NOVA_PESSOA = "/telas/novaPessoa.xhtml?faces-redirect=true";
	private final String TELA_LISTA_PESSOAS = "/telas/listaPessoas?faces-redirect=true";
	private final String TELA_EDITAR_PESSOA = "/telas/editarPessoa?faces-redirect=true&id=";

	private PessoaDAO pessoaDAO = new PessoaDAO();
	private Pessoa pessoa = new Pessoa();
	private Object pessoaListDb; // foi criado automaticamente, ver com o fábio

	// colocar @PostConstruct? olhar no controle-usuario-crip

	public List pessoaListDb() {
		return pessoaDAO.listarPessoa();
	}

	public void exlcluirPessoaDb(Pessoa pessoa) {
		pessoaDAO.deletarPessoa(pessoa);
	}

	// observar esseS retornoS
	public String incluirPessoaDb(Pessoa pessoa) {
		if (!pessoaDAO.inserirPessoa(pessoa)) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro: Essa Pessoa já existe!", "--"));
			context.getExternalContext().getFlash().setKeepMessages(true);

			return "/telas/novaPessoa.xhtml?faces-redirect=true";
		}
		return "/restrito/main?faces-redirect=true";
	}

	// observar se esse cód está certo pois o controle-usuario está diferente
	public String paginaEditar(Pessoa pessoa) {
		return "/telas/editarPessoa?faces-redirect=true&id=" + pessoa.getNome();
	}

	public String editarPessoaDb(Pessoa pessoa) {
		pessoaDAO.alterarPessoa(pessoa);
		return "/telas/listaPessoas?faces-redirect=true";
	}

	public PessoaDAO getPessoaDAO() {
		return pessoaDAO;
	}

	public void setPessoaDAO(PessoaDAO pessoaDAO) {
		this.pessoaDAO = pessoaDAO;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	
	public void setPessoaListDb(List<Pessoa> pesssoaListDb) {
		this.pessoaListDb = pessoaListDb;
	}
	
}
