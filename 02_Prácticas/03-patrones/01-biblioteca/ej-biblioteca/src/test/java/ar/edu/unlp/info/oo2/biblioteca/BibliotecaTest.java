package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;



public class BibliotecaTest {

    Biblioteca biblioteca = new Biblioteca();
    @BeforeEach

    @Test
    public void testExportarSociosEmpty() {
        biblioteca.setExporter(new VoorheesExporter());
        assertEquals("[]", biblioteca.exportarSocios());
    }
    @Test
    public void testExportSocios(){
        biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));
        biblioteca.setExporter(new JsonSimpleExporter());
        assertTrue(biblioteca.exportarSocios().contains("Arya Stark"));
        assertTrue(biblioteca.exportarSocios().contains("needle@stark.com"));
        assertTrue(biblioteca.exportarSocios().contains("Tyron Lannister"));
        assertTrue(biblioteca.exportarSocios().contains("tyron@thelannisters.com"));
    }
}
