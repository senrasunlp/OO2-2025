package ar.edu.unlp.oo2.trece;

public class SandwichVeganoBuilder extends SandwichBuilder {
    @Override
    public void setPan() {
        sandwich.setPan("Pan integral", 100);
    }

    @Override
    public void setAderezo() {
        sandwich.setAderezo("Salsa criolla", 20);
    }

    @Override
    public void setPrincipal() {
        sandwich.setPrincipal("Milanesa de gírgolas", 500);
    }

    @Override
    public void setAdicional() {
        sandwich.setAdicional("Sin adicional", 0);
    }
}
