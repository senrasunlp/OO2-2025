package ar.edu.unlp.info.oo2.biblioteca;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import  org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class VorheesExporterTest {

    VoorheesExporter exporter;
    List<Socio> socios;
    @BeforeEach
    public void setUp() {
        exporter = new VoorheesExporter();
        socios = new ArrayList<Socio>();
        socios.add(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
        socios.add(new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2"));

    }

    @Test public void exportar() {
        String sociosExportados = exporter.exportar(socios);
        assertTrue(sociosExportados.contains("Arya Stark"));
        assertTrue(sociosExportados.contains("Tyron Lannister"));
        assertTrue(sociosExportados.contains("tyron@thelannisters.com"));
        assertTrue(sociosExportados.contains("Arya Stark"));
    }
}
