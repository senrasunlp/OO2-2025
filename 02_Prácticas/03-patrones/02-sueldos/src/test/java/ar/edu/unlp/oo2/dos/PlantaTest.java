package ar.edu.unlp.oo2.dos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlantaTest {
	
	Planta juan, ricardo;
	
	@BeforeEach
	void setUp() throws Exception {
		juan = new Planta(false,0,0);
		ricardo = new Planta(true,3,10);
	}
    @Test
    public void testPlantaSolteroSinHijosSinHoras() {
		assertEquals(juan.basico(),50000);
		assertEquals(juan.adicional(),0);
    }

	@Test
	public void testPlantaConHoras() {
		assertEquals(ricardo.basico(),50000);
		assertEquals(ricardo.adicional(),5000 + 3*2000 + 10*2000);
	}
}
