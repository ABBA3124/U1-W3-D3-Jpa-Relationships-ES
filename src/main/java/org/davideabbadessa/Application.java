package org.davideabbadessa;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U1-W3-D3-Jpa-Relationships");

    public static void main(String[] args) {

        System.out.println("Start U1-W3-D3-Jpa-Relationships-ES");


    }
}
