package org.davideabbadessa;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.davideabbadessa.dao.EventoDAO;
import org.davideabbadessa.dao.LocationDAO;
import org.davideabbadessa.dao.PartecipazioneDAO;
import org.davideabbadessa.dao.PersonaDAO;
import org.davideabbadessa.entities.Persona;

import java.time.LocalDate;
import java.util.ArrayList;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("U1-W3-D3-Jpa-Relationships");

    public static void main(String[] args) {

        System.out.println("Start U1-W3-D3-Jpa-Relationships-ES");


        // CREO ISTANZE DAO PER OPERAZIONI DI PERSISTENZA
        PersonaDAO personaDAO = new PersonaDAO();
        LocationDAO locationDAO = new LocationDAO();
        EventoDAO eventoDAO = new EventoDAO();
        PartecipazioneDAO partecipazioneDAO = new PartecipazioneDAO();

        Persona persona = new Persona("Davide", "Abbadessa", "davideabbadessa@gmail.com", LocalDate.of(1999, 3, 2), 'M', new ArrayList<>());

        personaDAO.save(persona);
        System.out.println("" + persona.getNome() + " " + persona.getCognome() + " Aggiunta con successo");
    }
}
