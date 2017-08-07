package br.com.danillo.gweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

	public static final String strId = "id";
	public static final String strNome = "nome";
	public static final String strDatNasc = "datNasc";
	public static final String strCpf = "cpf";
	public static final String strRg = "rg";
	public static final String strNacionalidade = "nacionalidade";
	public static final String strEstadoCivil = "estadoCivil";
	public static final String strSexo = "sexo";
	public static final String strNomPai = "nomPai";
	public static final String strNomMae = "nomMae";
	public static final String strNumeroContato = "numeroContato";
	public static final String strFormacaoAcademica = "formacaoAcademica";
	public static final String strLogradouro = "logradouro";

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "dat_nasc")
	private String datNasc;

	@Column(name = "cpf")
	private String cpf;
	@Column(name = "rg")
	private String rg;

	@Column(name = "nacionalidade")
	private String nacionalidade;
	@Column(name = "estado_civil")
	private String estadoCivil;

	@Column(name = "sexo", length = 2)
	private String sexo;

	@Column(name = "nom_pai")
	private String nomPai;
	@Column(name = "nom_mae")
	private String nomMae;
	@Column(name = "numero_contato")
	private String numeroContato;
	@Column(name = "email")
	private String email;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_logradouro")
	private Logradouro logradouro;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_formacao_academica")
	private FormacaoAcademica formacaoAcademica;

	@Column(name = "dth_exclusao")
	private Date dthExclusao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDatNasc() {
		return datNasc;
	}

	public void setDatNasc(String datNasc) {
		this.datNasc = datNasc;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getNomPai() {
		return nomPai;
	}

	public void setNomPai(String nomPai) {
		this.nomPai = nomPai;
	}

	public String getNomMae() {
		return nomMae;
	}

	public void setNomMae(String nomMae) {
		this.nomMae = nomMae;
	}

	public String getNumeroContato() {
		return numeroContato;
	}

	public void setNumeroContato(String numeroContato) {
		this.numeroContato = numeroContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Logradouro getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(Logradouro logradouro) {
		this.logradouro = logradouro;
	}

	public FormacaoAcademica getFormacaoAcademica() {
		return formacaoAcademica;
	}

	public void setFormacaoAcademica(FormacaoAcademica formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}

	public Date getDthExclusao() {
		return dthExclusao;
	}

	public void setDthExclusao(Date dthExclusao) {
		this.dthExclusao = dthExclusao;
	}

}
