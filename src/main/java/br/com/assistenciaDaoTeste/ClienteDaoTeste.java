package br.com.assistenciaDaoTeste;

import java.util.Date;

import org.junit.Test;

import br.com.assistencia.dao.ClienteDao;
import br.com.assistencia.dominio.Cliente;
 

public class ClienteDaoTeste {

	@Test
	 public void salvar(){
		 
		Cliente cliente = new Cliente();
		cliente.setCpfCliente("12121212454");
		cliente.setRuaCliente("ruaCliente");
		cliente.setBairroCliente("bairroCliente");
		cliente.setNomeCliente("nomeDulcidio");
		 
		cliente.setRgCliente("rgCliente");
		ClienteDao clienteDAO = new ClienteDao();
		clienteDAO.merge(cliente);
		
	}
}
