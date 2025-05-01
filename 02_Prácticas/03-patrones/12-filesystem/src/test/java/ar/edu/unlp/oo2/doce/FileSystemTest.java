package ar.edu.unlp.oo2.doce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileSystemTest {

    FileSystem fs;
    Directorio dirA,dirB,dirA1,dirA2,dirA11,dirA12;
    Archivo archA,archB;

    @BeforeEach
    void setUp() {
        fs = new FileSystem();
        dirA = new Directorio("dirA");
        dirB = new Directorio("dirB");
        dirA1 = new Directorio("dirA1");
        dirA2 = new Directorio("dirA2");
        dirA11 = new Directorio("dirA11");
        dirA12 = new Directorio("dirA12");
        archA = new Archivo(LocalDate.now().minusDays(10),1000,"archA"); //1000
        archB = new Archivo(LocalDate.now(),100,"archB"); //100
        dirA11.add(archA);  //1000 + 32 -> 1032
        dirA1.add(dirA11,dirA12); // 32 + 32 + 1032 -> 64 + 1032 = 1096
        dirA.add(dirA1,dirA2); //32 + 32 + 1096 -> 64 + 1096 = 1160
        dirB.add(archB); // 32 + 100 = 132
        fs.add(dirA,dirB); // 32 + 132 + 1160 -> 164 + 1160 = 1324
    }

    @Test
    void tamanoTotalOcupadoTest(){
        assertEquals(1324,fs.tamanoTotalOcupado());
    }

    @Test
    void archivoMasNuevoTest(){
        assertEquals(archB,fs.archivoMasNuevo());
    }
    @Test
    void archivoMasGrandeTest(){
        assertEquals(archA,fs.archivoMasGrande());
    }
    @Test
    void buscarTest(){
        assertEquals(archA,fs.buscar("arch"));
    }

    @Test
    void buscarTodosTest(){
        assertTrue(fs.buscarTodos("arch").containsAll(List.of(archA,archB)));
    }

    @Test
    void  listadoDeContenidoTest(){
        assertTrue(fs.listadoDeContenido().contains("dirA/dirA/dirA1/dirA11/archA"));
        assertTrue(fs.listadoDeContenido().contains("dirA/dirA/dirA1/dirA12/"));
        assertTrue(fs.listadoDeContenido().contains("dirA/dirA/dirA2/"));
        assertTrue(fs.listadoDeContenido().contains("dirA/dirB/archB"));
    }
}
