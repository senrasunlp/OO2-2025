package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class JsonExporterTest {

    ExporterBehaviour exporter;
    List<Socio> socios;
    @BeforeEach
    public void setUp() {
        exporter = new JsonSimpleExporter();
        socios = new ArrayList<Socio>();
        socios.add(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        socios.add(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));

    }

    @Test public void exportar() {
        String sociosExportados = exporter.exportar(socios);
        assertTrue(sociosExportados.contains("Arya Stark"));
        assertTrue(sociosExportados.contains("Tyron Lannister"));
        assertTrue(sociosExportados.contains("tyron@thelannisters.com"));
    }
}
