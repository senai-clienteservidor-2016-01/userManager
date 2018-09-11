package br.com.gjl.usermanager.vo;

import java.util.ArrayList;
import java.util.List;

import br.com.gjl.usermanager.entidade.ActiveDirectory;
import br.com.gjl.usermanager.entidade.Citrix;

public class SolucaoVO {

	private List<ActiveDirectory> activeDirectoryes = new ArrayList<ActiveDirectory>();
	
	private List<Citrix> citrixes = new ArrayList<Citrix>();

	public void addActiveDirectory(ActiveDirectory activeDirectory){
		this.activeDirectoryes.add(activeDirectory);
	}
	
	public void addCitrix(Citrix citrix){
		this.citrixes.add(citrix);
	}
	
	public List<ActiveDirectory> getActiveDirectoryes() {
		return activeDirectoryes;
	}

	public List<Citrix> getCitrixes() {
		return citrixes;
	}

	
}