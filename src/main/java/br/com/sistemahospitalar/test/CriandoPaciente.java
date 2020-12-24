package br.com.sistemahospitalar.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.sistemahospitalar.model.Paciente;

public class CriandoPaciente {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sistemaHospitalar");
		EntityManager em = emf.createEntityManager();
		
		Paciente paciente = new Paciente();
		paciente.setNome("Aristezio Júnior");
		paciente.setIdade(33);
		
		em.getTransaction().begin();
		
		em.persist(paciente);
		
		em.getTransaction().commit();
		
		em.close();
		
	}

}
