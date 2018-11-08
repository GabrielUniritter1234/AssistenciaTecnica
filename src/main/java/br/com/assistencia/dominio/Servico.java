package br.com.assistencia.dominio;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Servico extends GenericDomain{

	@Column(length = 200 , nullable = false)
	private String descricaoServico;
	@Column(nullable=false , precision = 7 , scale=2)
	private BigDecimal valor;
	@Column()
	private String observacaoServico;
	
	public String getDescricaoServico() {
		return descricaoServico;
	}
	public void setDescricaoServico(String descricaoServico) {
		this.descricaoServico = descricaoServico;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getObservacaoServico() {
		return observacaoServico;
	}
	public void setObservacaoServico(String observacaoServico) {
		this.observacaoServico = observacaoServico;
	}
	
	
}
