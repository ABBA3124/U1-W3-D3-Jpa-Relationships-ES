package org.davideabbadessa;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.davideabbadessa.dao.EventoDAO;
import org.davideabbadessa.dao.LocationDAO;
import org.davideabbadessa.dao.PartecipazioneDAO;
import org.davideabbadessa.dao.PersonaDAO;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U1-W3-D3-Jpa-Relationships");

    public static void main(String[] args) {

        System.out.println("Start U1-W3-D3-Jpa-Relationships-ES");

        PersonaDAO personaDAO = new PersonaDAO();
        LocationDAO locationDAO = new LocationDAO();
        EventoDAO eventoDAO = new EventoDAO();
        PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO();

        
    }
}
