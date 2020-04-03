package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entidade.Pessoa;

public class AppStarter {

	public static void main(String[] args) {
		
		// dado a ser criado.
		Pessoa p1 = new Pessoa(null, "Ant�nio de cesar", "cesar_antonio@outlook.com.br", "2140028922");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin(); // inicia uma transa��o no banco de dados;
		em.persist(p1);
		em.getTransaction().commit(); // confirmar altera��es da transa��o;
		
		
		emf.close();
		em.close();
		System.out.println("OK!");
		
	}

}
