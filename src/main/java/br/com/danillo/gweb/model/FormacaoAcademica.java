package br.com.danillo.gweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_formacao_academica")
public class FormacaoAcademica {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "instituicao_ensino")
	private String instituicaoEnsino;
	@Column(name = "curso")
	private String curso;
	@Column(name = "matricula")
	private String matricula;
	@Column(name = "anoIngresso")
	private String anoIngresso;
	@Column(name = "semestre_inicial")
	private String semestreInicial;
	@Column(name = "semestre_atual")
	private String semestreAtual;

	@Column(name = "turno")
	private String turno;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(String anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public String getSemestreInicial() {
		return semestreInicial;
	}

	public void setSemestreInicial(String semestreInicial) {
		this.semestreInicial = semestreInicial;
	}

	public String getSemestreAtual() {
		return semestreAtual;
	}

	public void setSemestreAtual(String semestreAtual) {
		this.semestreAtual = semestreAtual;
	}

	public String getInstituicaoEnsino() {
		return instituicaoEnsino;
	}

	public void setInstituicaoEnsino(String instituicaoEnsino) {
		this.instituicaoEnsino = instituicaoEnsino;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

}
