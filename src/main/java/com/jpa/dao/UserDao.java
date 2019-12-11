package com.jpa.dao;

import com.jpa.domain.User;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class UserDao {
    public static void register(String userName, String password, String email){

        try {
            Configuration configuration = new Configuration().configure();
            SessionFactory factory = configuration.buildSessionFactory();
            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();
            User user = new User();
            user.setName(userName);
            user.setPassword(password);
            user.setEmail(email);
            session.save(user);
            transaction.commit();
            System.out.println("\n\n Details Added \n");
            session.close();
        }catch (HibernateException e){
            System.out.println(e.getMessage());
            System.out.println("error");
        }
    }
}
