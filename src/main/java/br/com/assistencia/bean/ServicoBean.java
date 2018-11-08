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
import br.com.assistencia.dominio.Cliente;
import br.com.assistencia.dominio.Servico;

@SuppressWarnings("serial")
@ManagedBean (name="ServicoView")
@ViewScoped
public class ServicoBean implements Serializable {
	
	private List<Servico> servicos;
	private Servico servico = new Servico();
	private ServicoDao servicoDao = new ServicoDao();
	
	@PostConstruct
	public void listar(){
		try{
			servicos=servicoDao.listar();
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao listar Servicos");
		    erro.printStackTrace();
		}
		}

	public void salvar(){
		try{
			servicoDao.merge(servico);
			listar();
			JOptionPane.showMessageDialog(null,"Salvo!");
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao salvar Clientes");
		    erro.printStackTrace();
		}
	}
}
