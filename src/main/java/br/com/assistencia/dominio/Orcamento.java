package br.com.assistencia.dominio;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Orcamento extends GenericDomain {
 
	@Column(nullable=false , precision = 7 , scale=2)
	private BigDecimal valorOrcamento;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cliente cliente;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Funcionario funcionario;
	
	@Temporal(TemporalType.DATE)
	private Date diaOrcamento;
}
