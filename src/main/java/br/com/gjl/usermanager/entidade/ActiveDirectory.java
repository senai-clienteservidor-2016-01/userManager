package br.com.gjl.usermanager.entidade;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.ambientinformatica.util.Entidade;

public class ActiveDirectory extends Entidade implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "activedirectory_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "activedirectory_seq", sequenceName = "activedirectory_seq", allocationSize = 1, initialValue = 1)
	private int id;
	
	private String loja;
	
	private String area;
	
	private String departamento;
	
	private String nome;
	
	private String login;
	
	private String autorizacao;
	
	private String situação;
	
	private String matricula;
	
	private String userName;
	
	private String unidadeOrganizacional;
	
	private String grupoPertecente;
	
	private String resposanvel;
	
	private String tarefas;
	
	private String status;
	
	private String ultimaAlteracao;
	
	private String grupo;
	
	private String descricao;
	
	private String solucao;
	
	
	public String inicio(){
		
		return "initio.xhtml?faces-redirect=true";
	}

	@Temporal(TemporalType.DATE)
	private Date dataCricação = new Date();
	
	@Temporal(TemporalType.DATE)
	private Date dataAlteração = new Date();
	
	private String tarefasAlteração;
	
	private String obs;

	public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAutorizacao() {
		return autorizacao;
	}

	public void setAutorizacao(String autorizacao) {
		this.autorizacao = autorizacao;
	}

	public String getSituação() {
		return situação;
	}

	public void setSituação(String situação) {
		this.situação = situação;
	}

	public Date getDataCricação() {
		return dataCricação;
	}

	public void setDataCricação(Date dataCricação) {
		this.dataCricação = dataCricação;
	}

	public Date getDataAlteração() {
		return dataAlteração;
	}

	public void setDataAlteração(Date dataAlteração) {
		this.dataAlteração = dataAlteração;
	}

	public String getTarefasAlteração() {
		return tarefasAlteração;
	}

	public void setTarefasAlteração(String tarefasAlteração) {
		this.tarefasAlteração = tarefasAlteração;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Integer getId() {
		return id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUnidadeOrganizacional() {
		return unidadeOrganizacional;
	}

	public void setUnidadeOrganizacional(String unidadeOrganizacional) {
		this.unidadeOrganizacional = unidadeOrganizacional;
	}

	public String getGrupoPertecente() {
		return grupoPertecente;
	}

	public void setGrupoPertecente(String grupoPertecente) {
		this.grupoPertecente = grupoPertecente;
	}

	public String getResposanvel() {
		return resposanvel;
	}

	public void setResposanvel(String resposanvel) {
		this.resposanvel = resposanvel;
	}

	public String getTarefas() {
		return tarefas;
	}

	public void setTarefas(String tarefas) {
		this.tarefas = tarefas;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUltimaAlteracao() {
		return ultimaAlteracao;
	}

	public void setUltimaAlteracao(String ultimaAlteracao) {
		this.ultimaAlteracao = ultimaAlteracao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSolucao() {
		return solucao;
	}

	public void setSolucao(String solucao) {
		this.solucao = solucao;
	}
	
	
	
	
}