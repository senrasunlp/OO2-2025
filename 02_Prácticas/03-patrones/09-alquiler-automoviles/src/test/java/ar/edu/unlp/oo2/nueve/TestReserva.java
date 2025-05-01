package ar.edu.unlp.oo2.nueve;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestReserva {

    AutoEnAlquiler autoRojo;
    Reserva reservaAutoRojo;
    Usuario juan;

    @BeforeEach
    public void setUp(){
        juan = new Usuario("Juan");
        autoRojo = new AutoEnAlquiler(12.5,3,"Honda");
        reservaAutoRojo = new Reserva(3, LocalDate.of(2025, 4, 30),juan,autoRojo);
    }

    @Test
    public void testMontoAReembolsar(){
        //Flexible
        assertTrue(autoRojo.getPolitica() instanceof PoliticaFlexible);
        System.out.println("\nPolítica Flexible:" + reservaAutoRojo.montoAReembolsar());
        assertEquals(12.5*3,reservaAutoRojo.montoAReembolsar());
        //Moderada
        autoRojo.setPolitica(new PoliticaModerada());
        assertTrue(autoRojo.getPolitica() instanceof PoliticaModerada);
        System.out.println("\nPolítica Moderada:" + reservaAutoRojo.montoAReembolsar());
        assertEquals(12.5*3,reservaAutoRojo.montoAReembolsar());
        //Estricta
        autoRojo.setPolitica(new PoliticaEstricta());
        assertTrue(autoRojo.getPolitica() instanceof PoliticaEstricta);
        System.out.println("\nPolítica Estricta:" + reservaAutoRojo.montoAReembolsar());
        assertEquals(0,reservaAutoRojo.montoAReembolsar());
    }
}
