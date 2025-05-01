package ar.edu.unlp.oo2.trece;

public class SandwichSinTaccBuilder extends SandwichBuilder {
    @Override
    public void setPan() {
        sandwich.setPan("Pan de chipá", 150);
    }

    @Override
    public void setAderezo() {
        sandwich.setAderezo("Salsa tártara", 18);
    }

    @Override
    public void setPrincipal() {
        sandwich.setPrincipal("Carne de pollo", 250);
    }

    @Override
    public void setAdicional() {
        sandwich.setAdicional("Verduras grilladas", 200);
    }
}
