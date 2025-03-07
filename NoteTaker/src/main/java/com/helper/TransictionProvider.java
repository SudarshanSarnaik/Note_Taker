package com.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TransictionProvider {
    private static EntityManagerFactory emf;

    static {
        try {
            emf = Persistence.createEntityManagerFactory("dev");
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("EntityManagerFactory initialization failed.");
        }
    }

    //  Always return a new EntityManager
    public static EntityManager getNewEntityManager() {
        if (emf == null) {
            throw new IllegalStateException("EntityManagerFactory is not initialized.");
        }
        return emf.createEntityManager();
    }

    //  Add this method to close EntityManagerFactory
    public static void closeTransaction() {
        if (emf != null) {
            emf.close();
        }
    }
}
