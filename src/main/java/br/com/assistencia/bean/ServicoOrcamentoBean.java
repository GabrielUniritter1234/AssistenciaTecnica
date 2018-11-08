package br.com.assistencia.bean;

import java.io.Serializable;

 




import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.swing.JOptionPane;

import org.omnifaces.util.Messages;

import br.com.assistencia.dao.ClienteDao;
import br.com.assistencia.dao.ServicoDao;
import br.com.assistencia.dao.ServicosOrcamentoDao;
import br.com.assistencia.dominio.Cliente;
import br.com.assistencia.dominio.Servico;
import br.com.assistencia.dominio.ServicosOrcamento;

@SuppressWarnings("serial")
@ManagedBean (name="ServicoOrcamentoView")
@ViewScoped
public class ServicoOrcamentoBean implements Serializable {
	
	private List<ServicosOrcamento> servicosOrcamentos;
	private ServicosOrcamento servicosOrcamento = new ServicosOrcamento();
	private ServicosOrcamentoDao servicosOrcamentoDao = new ServicosOrcamentoDao();
	
	@PostConstruct
	public void listar(){
		try{
			servicosOrcamentos=servicosOrcamentoDao.listar();
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao listar Servicos");
		    erro.printStackTrace();
		}
		}

	public void salvar(){
		try{
			servicosOrcamentoDao.merge(servicosOrcamento);
			listar();
			JOptionPane.showMessageDialog(null,"Salvo!");
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao adicionar servico ao Orcamento");
		    erro.printStackTrace();
		}
	}
}
