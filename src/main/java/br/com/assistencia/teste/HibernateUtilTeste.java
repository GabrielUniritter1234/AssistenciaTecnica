package br.com.assistencia.teste;

import org.hibernate.Session;
import org.junit.Test;

import br.com.assistencia.Util.HibernateUtil;

 

public class HibernateUtilTeste {

	
@Test
	
	public void conectar(){
		
	Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
	sessao.close();
	HibernateUtil.getFabricaDeSessoes().close();
}
}
