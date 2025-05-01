package ar.edu.unlp.oo2.trece;

public class SandwichClasicoBuilder extends SandwichBuilder {
    @Override
    public void setPan() {
        sandwich.setPan("Brioche", 100);
    }

    @Override
    public void setAderezo() {
        sandwich.setAderezo("Mayonesa", 20);
    }

    @Override
    public void setPrincipal() {
        sandwich.setPrincipal("Carne de ternera", 300);
    }

    @Override
    public void setAdicional() {
        sandwich.setAdicional("Tomate", 80);
    }
}
