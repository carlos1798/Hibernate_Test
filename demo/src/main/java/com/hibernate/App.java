package com.hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import org.hibernate.SessionFactory;

public class App {

  private static EntityManagerFactory entityManagerFactory;
  static SessionFactory sessionFactory;

  protected void setUp() throws Exception {
    // like discussed with regards to SessionFactory, an EntityManagerFactory is set up once for an application
    // 		IMPORTANT: notice how the name here matches the name we gave the persistence-unit in persistence.xml!
    entityManagerFactory = Persistence.createEntityManagerFactory("empleados");
  }

  protected void tearDown() throws Exception {
    entityManagerFactory.close();
  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    entityManagerFactory = Persistence.createEntityManagerFactory("empleados");

    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    List<Employee> result = entityManager
      .createQuery("from employee", Employee.class)
      .getResultList();
    for (Employee empleado : result) {
      System.out.println(
        "Empleado (" +
        empleado.getFirst_name() +
        ") : " +
        empleado.getBirth_date()
      );
    }
  }
}
