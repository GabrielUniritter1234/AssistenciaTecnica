package br.com.assistencia.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Cliente extends GenericDomain {

	@Column(length = 200)
	private String nomeCliente;
	@Column(length = 20)
	private String cpfCliente;
	@Column(length = 20)
	private String rgCliente;
	@Column(length = 20)
	private String foneCliente;
	@Column(length = 20)
	private String celCliente;
	@Column(length = 100)
	private String ruaCliente;
	@Column(length = 20)
	private String bairroCliente;
	@Column(length = 5)
	private String nroCliente;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getRgCliente() {
		return rgCliente;
	}
	public void setRgCliente(String rgCliente) {
		this.rgCliente = rgCliente;
	}
	public String getFoneCliente() {
		return foneCliente;
	}
	public void setFoneCliente(String foneCliente) {
		this.foneCliente = foneCliente;
	}
	public String getCelCliente() {
		return celCliente;
	}
	public void setCelCliente(String celCliente) {
		this.celCliente = celCliente;
	}
	public String getRuaCliente() {
		return ruaCliente;
	}
	public void setRuaCliente(String ruaCliente) {
		this.ruaCliente = ruaCliente;
	}
	public String getBairroCliente() {
		return bairroCliente;
	}
	public void setBairroCliente(String bairroCliente) {
		this.bairroCliente = bairroCliente;
	}
	public String getNroCliente() {
		return nroCliente;
	}
	public void setNroCliente(String nroCliente) {
		this.nroCliente = nroCliente;
	}
	
	
}
