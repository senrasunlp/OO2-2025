package ar.edu.unlp.oo2.once;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopografiaTest {

    Topografia agua, tierra,pantano, mixta1,mixta2,mixta3;

    @BeforeEach
    public void setUp() {
        agua = new Agua();
        tierra = new Tierra();
        pantano = new Pantano();
        mixta1 = new Mixta(agua,tierra,tierra,agua);
        mixta2 = new Mixta(agua,tierra,tierra,mixta1);
        mixta3 = new Mixta(agua,tierra,pantano,tierra);
    }

    @Test
    void proporcionAguaTest(){
        assertEquals(1, agua.proporcionAgua());
        assertEquals(0, tierra.proporcionAgua());
        assertEquals(0.5, mixta1.proporcionAgua());
        assertEquals((double) 6 /16, mixta2.proporcionAgua());
        assertEquals(0.425,mixta3.proporcionAgua());


    }

    @Test
    void proporcionTierraTest(){
        assertEquals(0, agua.proporcionTierra());
        assertEquals(1, tierra.proporcionTierra());
        assertEquals(0.5, mixta1.proporcionTierra());
        assertEquals((double)10/16, mixta2.proporcionTierra());
        assertEquals(0.575, mixta3.proporcionTierra());
    }
}
