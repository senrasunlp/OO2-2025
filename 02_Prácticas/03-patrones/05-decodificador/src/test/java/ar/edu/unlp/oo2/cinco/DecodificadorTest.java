package ar.edu.unlp.oo2.cinco;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DecodificadorTest {

    Decodificador decodificador;
    Pelicula thor, capitanAmerica, ironMan, dunkirk, rocky, rambo;

    @BeforeEach
    public void setUp() {
        decodificador = new Decodificador();
        thor = new Pelicula ("Thor", 7.9, 2007);
        capitanAmerica = new Pelicula ("Capitan America", 7.8, 2016);
        ironMan = new Pelicula ("Iron man", 7.9, 2010);
        dunkirk = new Pelicula ("Dunkirk", 7.9, 2017);
        rocky = new Pelicula ("Rocky", 8.1, 1976 );
        rambo = new Pelicula ("Rambo", 7.8, 1979);
        thor.agregarSimilares(Arrays.asList(capitanAmerica,ironMan));
        capitanAmerica.agregarSimilares(Arrays.asList(thor,ironMan));
        ironMan.agregarSimilares(Arrays.asList(thor,capitanAmerica));
        rocky.agregarSimilares(rambo);
        rambo.agregarSimilares(rocky);
        decodificador.agregarPeliculas(Arrays.asList(thor,capitanAmerica,ironMan,dunkirk,rocky,rambo));
        decodificador.agregarUltimasVistas(Arrays.asList(thor,rocky));
    }

    @Test
    public void testNovedad() {
        decodificador.setCriterio(new Novedad());
        assertEquals(3, decodificador.sugerirPeliculas().size());
        assertTrue(decodificador.sugerirPeliculas().containsAll(Arrays.asList(dunkirk,capitanAmerica,ironMan)));
    }

    @Test
    public void testSimilaridad() {
        decodificador.setCriterio(new Similaridad());
        assertTrue(decodificador.sugerirPeliculas().containsAll(Arrays.asList(capitanAmerica,ironMan,rambo)));
        assertEquals(3, decodificador.sugerirPeliculas().size());
    }

    @Test
    public void testPuntaje() {
        decodificador.setCriterio(new Puntaje());
        assertEquals(3, decodificador.sugerirPeliculas().size());
        List<Pelicula> aux = decodificador.sugerirPeliculas();
        assertTrue(decodificador.sugerirPeliculas().containsAll(Arrays.asList(dunkirk,ironMan,capitanAmerica)));
    }
}
