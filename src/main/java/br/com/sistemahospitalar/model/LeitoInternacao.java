package br.com.sistemahospitalar.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LeitoInternacao {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@JoinColumn(unique = true) // informando que a chave primaria é unica
	@ManyToOne
	private Leito leito;
	@JoinColumn(unique = true) // informando que a chave primaria é unica
	@ManyToOne
	private Paciente paciente;
	
	private LocalDate dataInternacao;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Leito getLeito() {
		return leito;
	}
	public void setLeito(Leito leito) {
		this.leito = leito;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public LocalDate getDataInternacao() {
		return dataInternacao;
	}
	public void setDataInternacao(LocalDate dataInternacao) {
		this.dataInternacao = dataInternacao;
	}
	
	
	
	
}
