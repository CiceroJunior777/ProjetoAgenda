/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Entidade.Agenda;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AgendaModel {

	public static EntityManager getEm(){
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjetoAgendaPU");
	return factory.createEntityManager();
	
	}
	public static void Adicionar(Agenda a) {
		EntityManager em = getEm();
		try {
			em.getTransaction().begin();
			if (a.getId() == null) {
				em.persist(a);
			} else {
				em.merge(a);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}
}
