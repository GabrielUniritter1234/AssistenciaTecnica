package br.com.assistencia.bean;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.swing.JOptionPane;

import org.omnifaces.util.Messages;

import br.com.assistencia.dao.FuncionarioDao;
import br.com.assistencia.dominio.Funcionario;
 

@SuppressWarnings("serial")
@ManagedBean (name="FuncionarioView")
@ViewScoped
public class FuncionarioBean implements Serializable {
	
	private List<Funcionario> funcionarios;
	private Funcionario funcionario = new Funcionario();
	private FuncionarioDao funcionarioDao = new FuncionarioDao();
	
	@PostConstruct
	public void listar(){
		try{
			funcionarios=funcionarioDao.listar();
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao listar Clientes");
		    erro.printStackTrace();
		}
		}

	public void salvar(){
		try{
			funcionarioDao.merge(funcionario);
			listar();
			JOptionPane.showMessageDialog(null,"Salvo!");
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao salvar cliente");
		    erro.printStackTrace();
		}
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public FuncionarioDao getFuncionarioDao() {
		return funcionarioDao;
	}

	public void setFuncionarioDao(FuncionarioDao funcionarioDao) {
		this.funcionarioDao = funcionarioDao;
	}
	
}
