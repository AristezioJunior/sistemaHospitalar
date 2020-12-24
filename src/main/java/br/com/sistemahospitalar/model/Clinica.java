package br.com.sistemahospitalar.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Clinica {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String descricao;
	
	@OneToMany
	private List<Leito> lstLeito;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Leito> getLstLeito() {
		return lstLeito;
	}

	public void setLstLeito(List<Leito> lstLeito) {
		this.lstLeito = lstLeito;
	}

	@Override
	public String toString() {
		return "Clinica [id=" + id + ", descricao=" + descricao + ", lstLeito=" + lstLeito + "]";
	}


	//Teste GitHub
	
		
	
		
}
