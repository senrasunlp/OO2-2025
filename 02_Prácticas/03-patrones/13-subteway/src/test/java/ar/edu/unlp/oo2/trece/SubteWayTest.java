package ar.edu.unlp.oo2.trece;

import org.junit.jupiter.api.Test;

public class SubteWayTest {
    SubteWay subteWay = new SubteWay();

    @Test
    public void armarSandwichClasicoTest() {
        Sandwich sandwich = subteWay.armarSandwichClasico();
        System.out.println(sandwich);
    }

    @Test
    public void armarSandwichVeganoTest() {
        Sandwich sandwich = subteWay.armarSandwichVegano();
        System.out.println(sandwich);
    }

    @Test
    public void armarSandwichVegetarianoTest() {
        Sandwich sandwich = subteWay.armarSandwichVegetariano();
        System.out.println(sandwich);
    }

    @Test
    public void armarSandwichSinTaccTest() {
        Sandwich sandwich = subteWay.armarSandwichSinTacc();
        System.out.println(sandwich);
    }
}
