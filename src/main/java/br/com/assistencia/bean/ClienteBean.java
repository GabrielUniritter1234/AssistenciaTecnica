package br.com.assistencia.bean;

import java.io.Serializable;

 




import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.view.ViewScoped;
import javax.swing.JOptionPane;

import org.omnifaces.util.Messages;

import br.com.assistencia.dao.ClienteDao;
import br.com.assistencia.dominio.Cliente;

@SuppressWarnings("serial")
@ManagedBean (name="ClienteView")
@SessionScoped
public class ClienteBean implements Serializable {
	
	private List<Cliente> clientes;
	private Cliente cliente = new Cliente();
	private ClienteDao clienteDao = new ClienteDao();
	private Long codigoCliente;
	
	@PostConstruct
	public void listar(){
		try{
			clientes=clienteDao.listar();
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao listar Clientes");
		    erro.printStackTrace();
		}
		}

	public void salvar(){
		try{
			 
			clienteDao.merge(cliente);
			cliente = new Cliente();
			clientes = clienteDao.listar();
			JOptionPane.showMessageDialog(null,"Salvo!");
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao salvar cliente");
		    erro.printStackTrace();
		}
	}
	public void sair(){
		cliente = new Cliente();
		clientes = clienteDao.listar();
	}
	public void listaEditar(){
		cliente=clienteDao.buscar(codigoCliente);
	}
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ClienteDao getClienteDao() {
		return clienteDao;
	}

	public void setClienteDao(ClienteDao clienteDao) {
		this.clienteDao = clienteDao;
	}

	public Long getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	
}
