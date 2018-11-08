package br.com.assistencia.dominio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@SuppressWarnings("serial")
@Entity
public class ServicosOrcamento extends GenericDomain{
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Servico servico;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Orcamento orcamento;
	

}
