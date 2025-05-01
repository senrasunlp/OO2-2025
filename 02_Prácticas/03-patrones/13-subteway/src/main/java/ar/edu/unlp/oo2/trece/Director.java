package ar.edu.unlp.oo2.trece;

public class Director {

    private SandwichBuilder builder;

    public Sandwich armarSandwich(SandwichBuilder builder){
        builder.reset();
        builder.setPan();
        builder.setAderezo();
        builder.setPrincipal();
        builder.setAdicional();
        return builder.getResultado();
    }
}
