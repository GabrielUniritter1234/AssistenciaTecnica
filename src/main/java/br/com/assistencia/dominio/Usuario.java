package br.com.assistencia.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Usuario  extends GenericDomain{
	
	@Column(length = 50 , nullable = false)
	private String loginUsuario;
	@Column(length = 50 , nullable = false)
	private String senhaUsuario;
	@Column(length = 50 , nullable = false)
	private String confSenhaUsuario;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Funcionario funcionario;
	
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public String getLoginUsuario() {
		return loginUsuario;
	}
	public void setLoginUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}
	public String getSenhaUsuario() {
		return senhaUsuario;
	}
	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}
	public String getConfSenhaUsuario() {
		return confSenhaUsuario;
	}
	public void setConfSenhaUsuario(String confSenhaUsuario) {
		this.confSenhaUsuario = confSenhaUsuario;
	}
	
	
	

}
