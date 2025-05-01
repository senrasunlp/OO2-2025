package ar.edu.unlp.oo2.siete;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test
    public void sumaYRestaTest(){
        Calculadora calculadora = new Calculadora();
        calculadora.setValor(5); // Establece el valor inicial
        calculadora.mas(); // Prepara para sumar
        calculadora.setValor(3); // Suma 3 al valor acumulado
        System.out.println(calculadora.getResultado()); // Imprimirá "8.0"
        calculadora.multiplicar();
        calculadora.setValor(2);
        assertEquals(calculadora.getResultado(), "16.0");
        System.out.println(calculadora.getResultado()); // Imprimirá "16.0"

    }
}
