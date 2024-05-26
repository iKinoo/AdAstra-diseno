/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hibernate_test;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class App {

    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        SessionFactory sessionFactory;

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .build();
        try {
            sessionFactory = new MetadataSources(registry)
                    .addAnnotatedClass(Persona.class)
                    .addAnnotatedClass(Puesto.class)
                    .buildMetadata()
                    .buildSessionFactory();

            sessionFactory.inTransaction(session -> {
                Puesto puesto1 = new Puesto("Programador");
                Puesto puesto2 = new Puesto("Analista");
                Puesto puesto3 = new Puesto("Tester");

                session.persist(puesto1);
                session.persist(puesto2);
                session.persist(puesto3);

                session.persist(new Persona("Juan", puesto1));
                session.persist(new Persona("Pedro", puesto2));
                session.persist(new Persona("Maria", puesto3));
            });

            sessionFactory.inTransaction(session -> {
                session.createSelectionQuery("from Persona", Persona.class)
                        .getResultList()
                        .forEach(persona -> System.out
                                .println("Event (" + persona.getNombre() + ") : " + persona.getPuesto()));
            });
        } catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we
            // had trouble building the SessionFactory so destroy it manually.
            StandardServiceRegistryBuilder.destroy(registry);
        }

    }
}
