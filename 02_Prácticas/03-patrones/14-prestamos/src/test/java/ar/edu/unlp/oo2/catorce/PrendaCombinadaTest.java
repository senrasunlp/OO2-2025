package ar.edu.unlp.oo2.catorce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PrendaCombinadaTest {

    PrendaCombinada prendaCombinada;
    PrendaAlquiler prendaAlquiler;
    PrendaAutomovil prendaAutomovil;

    @BeforeEach
    void setUp() {
        LocalDate inicioAlquiler = LocalDate.now().minusMonths(10);
        LocalDate finAlquiler = LocalDate.now().plusMonths(5);
        prendaAlquiler = new PrendaAlquiler(inicioAlquiler,finAlquiler,200000.0);
        prendaAutomovil = new PrendaAutomovil(2020,150000.5,10);
        prendaCombinada = new PrendaCombinada(prendaAlquiler,prendaAutomovil);
    }

    @Test
    void calcularValorPrendatario(){
        System.out.println(prendaAlquiler.calcularValorPrendario());
        System.out.println(prendaAutomovil.calcularValor());
        System.out.println(prendaCombinada.calcularValorPrendario());
    }
}
