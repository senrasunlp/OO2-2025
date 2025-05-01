package ar.edu.unlp.oo2.dos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasanteTest {
	
	Pasante juan, ricardo;
	
	@BeforeEach
	void setUp() throws Exception {
		juan = new Pasante(false,0,0);
		ricardo = new Pasante(false,0,10);
	}
	
    @Test
    public void testPasanteSinExamenesRendidos() {
		assertEquals(juan.basico(),20000);
		assertEquals(juan.adicional(),0);
    }

	@Test
	public void testPasanteConExamenesRendidos() {
		assertEquals(ricardo.basico(),20000);
		assertEquals(ricardo.adicional(),10*2000);
	}
}
