//package com.example.hibernate.demo.repo;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//
//import javax.imageio.spi.ServiceRegistry;
//
//public class HibernateUtil { private static final
//SessionFactory sessionFactory;
//    private static ServiceRegistry serviceRegistry; static { try
//    {
//        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build(); sessionFactory = metaData.getSessionFactoryBuilder().build();
//    }
//    catch (Throwable th)
//    {
//        System.err.println("Enitial SessionFactory creation failed" + th);
//        throw new ExceptionInInitializerError(th); }
//    }
//    public static SessionFactory getSessionFactory() { return sessionFactory; } }