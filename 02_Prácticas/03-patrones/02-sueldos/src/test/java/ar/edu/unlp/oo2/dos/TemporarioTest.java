package ar.edu.unlp.oo2.dos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemporarioTest {
	
	Temporario juan, ricardo,martin;
	
	@BeforeEach
	void setUp() throws Exception {
		juan = new Temporario(false,0,0);
		ricardo = new Temporario(false,0,160);
		martin = new Temporario(true,3,80);

	}
	
    @Test
    public void testTemporarioSolteroSinHijosSinHoras() {
		assertEquals(juan.basico(),20000);
		assertEquals(juan.adicional(),0);
    }

	@Test
	public void testTemporarioConHoras() {
		assertEquals(ricardo.basico(),20000+160*300);
		assertEquals(ricardo.adicional(),0);
	}

	@Test
	public void testTemporarioCasadoConHijos() {
		assertEquals(martin.basico(),20000+80*300);
		assertEquals(martin.adicional(),5000+3*2000);
	}
}
