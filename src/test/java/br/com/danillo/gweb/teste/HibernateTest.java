package br.com.danillo.gweb.teste;

import org.hibernate.Session;
import org.junit.Test;

import br.com.danillo.gweb.util.HibernateUtil;

public class HibernateTest {

	@Test
	public void test() {
  Session sessao =		 HibernateUtil.getFabricaDeSessoes().openSession();
 System.out.println( "Esta conectado ?"+ sessao.isConnected());
 sessao.close();
	}

}
