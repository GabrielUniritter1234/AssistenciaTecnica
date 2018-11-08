package br.com.assistencia.bean;

import java.io.Serializable;

 




import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;
import javax.swing.JOptionPane;

import org.omnifaces.util.Messages;

import br.com.assistencia.dao.ClienteDao;
import br.com.assistencia.dao.UsuarioDao;
import br.com.assistencia.dominio.Cliente;
import br.com.assistencia.dominio.Usuario;

@SuppressWarnings("serial")
@ManagedBean (name="UsuarioView")
@ViewScoped
public class UsuarioBean implements Serializable {
	
	private List<Usuario> usuarios;
	private Usuario usuario = new Usuario();
	private UsuarioDao usuarioDao = new UsuarioDao();
	
	@PostConstruct
	public void listar(){
		try{
			usuarios=usuarioDao.listar();
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao listar Usuários");
		    erro.printStackTrace();
		}
		}

	public void salvar(){
		try{
			usuarioDao.merge(usuario);
			listar();
			JOptionPane.showMessageDialog(null,"Salvo!");
		}catch(RuntimeException erro){
			Messages.addGlobalError("Ocorreu um erro ao salvar Usuario");
		    erro.printStackTrace();
		}
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
}
