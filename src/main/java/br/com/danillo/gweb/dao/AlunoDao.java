package br.com.danillo.gweb.dao;

import org.hibernate.Session;

import br.com.danillo.gweb.model.Aluno;

public class AlunoDao extends DAOGeral<Aluno> {

	public AlunoDao(Session sessao) {
		super(sessao);
		
	}

 

}