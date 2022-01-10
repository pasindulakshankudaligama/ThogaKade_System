package util;

import model.Customer;
import model.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private final SessionFactory sessionFactory;
  //  private final SessionFactory sessionFactory1;

    private FactoryConfiguration() {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Customer.class ).addAnnotatedClass(Item.class);
      //  Configuration configuration1 = new Configuration().configure().addAnnotatedClass();

        sessionFactory = configuration.buildSessionFactory();
        //sessionFactory1 = configuration1.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        return (factoryConfiguration == null) ? factoryConfiguration = new FactoryConfiguration()
                : factoryConfiguration;
    }

    public Session getSession() {
        return sessionFactory.openSession();
    }
}
