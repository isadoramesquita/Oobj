package com.sistemaweb.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.sistemaweb.dao.PessoaDAO;
import com.sistemaweb.model.Pessoa;

@ManagedBean
@ViewScoped
public class PessoaMB {

	private PessoaDAO pessoaDAO = new PessoaDAO();
	private Pessoa pessoa = new Pessoa();
	private Pessoa contato = new Pessoa();

	@PostConstruct
	public void init() {
		FacesContext facesContext = FacesContext.getCurrentInstance();

		String id = (String) facesContext.getExternalContext().getRequestParameterMap().get("id");
		if (id != null) {
			Integer idPessoa = Integer.parseInt(id);
			this.pessoa = pessoaDAO.getPessoa(idPessoa);
		}
	}

	public List pessoaListDb() {
		return pessoaDAO.listarPessoa();
	}

	public void excluirPessoaDb(Pessoa pessoa) {
		pessoaDAO.deletarPessoa(pessoa);
	}

	public String incluirPessoaoDb(Pessoa pessoa) {
		if (!pessoaDAO.inserirPessoa(pessoa)) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro: Essa pessoa já existe!", null));

			context.getExternalContext().getFlash().setKeepMessages(true);
			return "/restrito/novaPessoa.xhtml?faces-redirect=true";
		}
		return "/restrito/listaPessoas?faces-redirect=true";
	}
	
	public String adicionarContato(Pessoa pessoa, long idContato) {
		if (!pessoaDAO.inserirContato(pessoa, idContato)) {
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro: Essa pessoa já existe!", null));

			context.getExternalContext().getFlash().setKeepMessages(true);
			return this.paginaAdicionarContato(pessoa);
		}
		return this.paginaContatos(pessoa);
	}

	public String paginaEditar(Pessoa pessoa) {
		this.pessoa = pessoa;
		return "/restrito/editarPessoa?faces-redirect=true&id=" + pessoa.getId();
	}
	
	public String paginaContatos(Pessoa pessoa) {
		this.pessoa = pessoa;
		return "/restrito/contatos?faces-redirect=true&id=" + pessoa.getId();
	}
	
	public String paginaAdicionarContato(Pessoa pessoa) {
		this.pessoa = pessoa;
		return "/restrito/novoContato?faces-redirect=true&id=" + pessoa.getId();
	}

	public String editarPessoaDb(Pessoa pessoa) {
		pessoaDAO.alterarPessoa(pessoa);
		return "/restrito/listaPessoas?faces-redirect=true";
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getContato() {
		return contato;
	}

	public void setContato(Pessoa contato) {
		this.contato = contato;
	}

	
}
