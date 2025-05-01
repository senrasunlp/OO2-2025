package ar.edu.unlp.oo2.trece;

public class SandwichVegetarianoBuilder extends SandwichBuilder {
    @Override
    public void setPan() {
        sandwich.setPan("Pan con semillas", 120);
    }

    @Override
    public void setAderezo() {
        sandwich.setAderezo("Sin aderezo", 0);
    }

    @Override
    public void setPrincipal() {
        sandwich.setPrincipal("Provoleta grillada", 200);
    }

    @Override
    public void setAdicional() {
        sandwich.setAdicional("Berenjenas al escabeche", 100);
    }
}
