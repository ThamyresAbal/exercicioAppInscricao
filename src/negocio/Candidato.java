package negocio;

import java.util.Calendar;

public class Candidato {
    
	private String nome;
	private String email; 
	private String emailConfirmacao; 
	private String rg;
	private Calendar dataExpedicao;  
	private String orgao;                    
	private String uf;
	private Informacao informacao;
	
	
	private boolean validacao() {
		 return this.validaEmail();
		 
	}
	
	private boolean validaEmail() {
		//verificar se foi escrito o mesmo email nos dois campos
		return this.getEmail().equals(this.getEmailConfirmacao());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmailConfirmacao() {
		return emailConfirmacao;
	}
	public void setEmailConfirmacao(String emailConfirmacao) {
		this.emailConfirmacao = emailConfirmacao;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Calendar getDataExpedicao() {
		return dataExpedicao;
	}
	public void setDataExpedicao(Calendar dataExpedicao) {
		this.dataExpedicao = dataExpedicao;
	}
	public String getOrgao() {
		return orgao;
	}
	public void setOrgao(String orgao) {
		this.orgao = orgao;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}

	public Informacao getInformacao() {
		return informacao;
	}

	public void setInformacao(Informacao informacao) {
		this.informacao = informacao;
	}
	
}
