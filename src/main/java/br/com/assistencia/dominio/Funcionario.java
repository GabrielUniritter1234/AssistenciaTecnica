package br.com.assistencia.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;

import br.com.assistencia.dominio.GenericDomain;

@SuppressWarnings("serial")
@Entity
public class Funcionario extends GenericDomain {

	@Column(length = 200 , nullable = false)
	private String nomeFuncionario;
	@Column(length = 20)
	private String cpfFuncionario;
	@Column(length = 20)
	private String rgFuncionario;
	@Column(length = 20)
	private String foneFuncionario;
	@Column(length = 20)
	private String celFuncionario;
	@Column(length = 100)
	private String ruaFuncionario;
	@Column(length = 20)
	private String bairroFuncionario;
	@Column(length = 5)
	private String nroFuncionario;
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getCpfFuncionario() {
		return cpfFuncionario;
	}
	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	public String getRgFuncionario() {
		return rgFuncionario;
	}
	public void setRgFuncionario(String rgFuncionario) {
		this.rgFuncionario = rgFuncionario;
	}
	public String getFoneFuncionario() {
		return foneFuncionario;
	}
	public void setFoneFuncionario(String foneFuncionario) {
		this.foneFuncionario = foneFuncionario;
	}
	public String getCelFuncionario() {
		return celFuncionario;
	}
	public void setCelFuncionario(String celFuncionario) {
		this.celFuncionario = celFuncionario;
	}
	public String getRuaFuncionario() {
		return ruaFuncionario;
	}
	public void setRuaFuncionario(String ruaFuncionario) {
		this.ruaFuncionario = ruaFuncionario;
	}
	public String getBairroFuncionario() {
		return bairroFuncionario;
	}
	public void setBairroFuncionario(String bairroFuncionario) {
		this.bairroFuncionario = bairroFuncionario;
	}
	public String getNroFuncionario() {
		return nroFuncionario;
	}
	public void setNroFuncionario(String nroFuncionario) {
		this.nroFuncionario = nroFuncionario;
	}
	
	

}
