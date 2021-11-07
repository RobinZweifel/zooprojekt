package ch.bbw.rz.persistence;

import ch.bbw.rz.model.Animal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class AnimalPersistence {

    private static EntityManagerFactory emfactory;
    private EntityManager entityManager;


    public AnimalPersistence(){
        emfactory = Persistence.createEntityManagerFactory("jcg-JPA");
        entityManager = emfactory.createEntityManager();
        entityManager.getTransaction().begin();
    }

    public List<Animal> getAllAnimals(){
        List animals;
        animals = entityManager.createQuery("FROM animal").getResultList();
        entityManager.getTransaction().commit();
        return animals;
    }
}
