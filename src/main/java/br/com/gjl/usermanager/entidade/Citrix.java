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

public class Citrix extends Entidade implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "citrix_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "citrix_seq", sequenceName = "citrix_seq", allocationSize = 1, initialValue = 1)
	private Integer id;

	 private String loja;
	 
	 private String area;
	 
	 private String departamento;
	 
	 private String nome;
	 
	 private boolean ferramentas;
	 
	 private boolean office;
	 
	 private boolean proprios;
	 
	 private boolean sefaz;
	 
	 private boolean terceiro;
	 
	 private boolean situacao;
	 
	 private boolean tarefasCriacao;
	 
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

	public boolean isFerramentas() {
		return ferramentas;
	}

	public void setFerramentas(boolean ferramentas) {
		this.ferramentas = ferramentas;
	}

	public boolean isOffice() {
		return office;
	}

	public void setOffice(boolean office) {
		this.office = office;
	}

	public boolean isProprios() {
		return proprios;
	}

	public void setProprios(boolean proprios) {
		this.proprios = proprios;
	}

	public boolean isSefaz() {
		return sefaz;
	}

	public void setSefaz(boolean sefaz) {
		this.sefaz = sefaz;
	}

	public boolean isTerceiro() {
		return terceiro;
	}

	public void setTerceiro(boolean terceiro) {
		this.terceiro = terceiro;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public boolean isTarefasCriacao() {
		return tarefasCriacao;
	}

	public void setTarefasCriacao(boolean tarefasCriacao) {
		this.tarefasCriacao = tarefasCriacao;
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
	 
}