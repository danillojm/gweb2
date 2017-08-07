package br.com.danillo.gweb.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.constraints.AssertTrue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import br.com.danillo.gweb.dao.AlunoDao;
import br.com.danillo.gweb.model.Aluno;
import br.com.danillo.gweb.model.FormacaoAcademica;
import br.com.danillo.gweb.util.HibernateUtil;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;

@Path("aluno")
public class AlunoService {

	public static void imprimirPdf() throws JRException {

		String caminho = "br.com.danillo.gweb.relatorios.iReport";
		String rel = ".primeiroRel.jasper";
		Connection connection = HibernateUtil.getConexao();

		Map<String, Object> parameters = new HashMap<>();

		JasperPrint print = JasperFillManager.fillReport(caminho+rel,parameters, connection);

		JasperPrintManager.printReport(print, true);

	}

	public void buscar() {

	}

	@POST
	public static void salvar(String json) {
		Gson gson = new Gson();
		Aluno aluno = gson.fromJson(json, Aluno.class);
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();

		if (aluno != null) {

			if (aluno.getFormacaoAcademica() != null || !aluno.getFormacaoAcademica().equals("")) {
				AlunoDao dao = new AlunoDao(sessao);
				dao.getSessao().save(aluno.getFormacaoAcademica());
				dao.salvar(aluno);
			}

		} else {

		}
	}

	public static void main(String[] args) {
		String json /*
					 * =
					 * "{\"nome\":\"DANILLO JOSE DE MELO\",\"cpf\":\"sda\",\"rg\":\"ds\",\"sexo\":\"\","
					 * +
					 * "\"datNasc\":\"\",\"estadoCivil\":\"PE\",\"nomPai\":\"DANILLO\",\"nomMae\":\"DE MELO\","
					 * +
					 * "\"numeroContato\":\"ads\",\"formacaoAcademica\":{\"instituicao_ensino\":\"asd\","
					 * +
					 * "\"curso\":\"\",\"matricula\":\"sadasd\",\"anoIngresso\":\"asd\",\"semestre_inicial\":\"dsa\","
					 * + "\"semestre_atual\":\"\"}}"
					 */ = "";
		try {
			AlunoService.imprimirPdf();
		} catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@GET
	public String listar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		AlunoDao dao = new AlunoDao(sessao);

		List<Aluno> alunos = dao.listar();

		Gson gson = new Gson();
		String json = gson.toJson(alunos);
		return json;

	}

	@PUT
	public void editar(String json) {
		Gson gson = new Gson();
		Aluno aluno = gson.fromJson(json, Aluno.class);

		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		AlunoDao dao = new AlunoDao(sessao);

		dao.editar(aluno);

	}
}
