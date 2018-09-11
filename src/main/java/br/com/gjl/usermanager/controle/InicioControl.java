package br.com.gjl.usermanager.controle;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.event.ActionEvent;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import br.com.ambientinformatica.ambientjsf.util.UtilFaces;
import br.com.gjl.usermanager.entidade.ActiveDirectory;
import br.com.gjl.usermanager.entidade.Citrix;

@Named
@Scope("conversation")
public class InicioControl {
	
	private List<ActiveDirectory> activeDirectoryes = new ArrayList<ActiveDirectory>();
	
	private List<Citrix> citrixes = new ArrayList<Citrix>();
	
	private String solucaoSelecionada = "";
	
	@PostConstruct
	public void init(){
		
		ActiveDirectory ad01 = new ActiveDirectory();
		ad01.setLoja("Active Directory Loja 01");
		activeDirectoryes.add(ad01);
		
		ActiveDirectory ad02 = new ActiveDirectory();
		ad02.setLoja("Active Directory Loja 02");
		activeDirectoryes.add(ad02);
		
		
		Citrix citrix01 = new Citrix();
		citrix01.setLoja("Citrix Loja 01");
		citrixes.add(citrix01);
		
		Citrix citrix02 = new Citrix();
		citrix02.setLoja("Citrix Loja 02");
		citrixes.add(citrix02);
				
	}
	
	public void teste(ActionEvent event){
		UtilFaces.addMensagemFaces("TESTE");
	}
	
	public String getSolucaoSelecionada() {
		return solucaoSelecionada;
	}

	public void setSolucaoSelecionada(String solucaoSelecionada) {
		this.solucaoSelecionada = solucaoSelecionada;
	}

	public List<ActiveDirectory> getActiveDirectoryes() {
		return activeDirectoryes;
	}

	public List<Citrix> getCitrixes() {
		return citrixes;
	}

	
}