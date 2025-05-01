package ar.edu.unlp.oo2.seis;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExcursionTest {

    Excursion excursion;
    Usuario juan,lucas,pedro,ricardo;

    @BeforeEach
    public void setUp() {
        juan = new Usuario("Juan","Díaz","juandiaz@gmail.com");
        lucas = new Usuario("Lucas","Díaz","lucasdiaz@gmail.com");
        pedro = new Usuario("Pedro","Diaz","pedrodiaz@gmail.com");
        ricardo = new Usuario("Ricardo","Diaz","ricardodiaz@gmail.com");
        excursion = new Excursion("Dos días en kayak bajando el Paraná", LocalDate.now(),LocalDate.now().plusMonths(11),"Obelisco",1250.5,2,3);
    }

    @Test
    public void testInscribir() {
        excursion.inscribir(juan);
        assertTrue(excursion.getEstado() instanceof Provisoria);
        excursion.inscribir(lucas);
        assertTrue(excursion.getEstado() instanceof Definitiva);
        excursion.inscribir(pedro);
        assertTrue(excursion.getEstado() instanceof Completada);
        excursion.inscribir(ricardo);
        assertEquals(1,excursion.getListaEsperaSize());
    }

}
