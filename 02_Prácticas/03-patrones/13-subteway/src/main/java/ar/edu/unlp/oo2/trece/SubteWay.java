package ar.edu.unlp.oo2.trece;

public class SubteWay {

    private Director director;

    SubteWay() {
        this.director = new Director();
    }

    public Sandwich armarSandwichClasico() {
        return director.armarSandwich(new SandwichClasicoBuilder());
    }

    public Sandwich armarSandwichVegano() {
        return director.armarSandwich(new SandwichVeganoBuilder());
    }

    public Sandwich armarSandwichVegetariano() {
        return director.armarSandwich(new SandwichVegetarianoBuilder());
    }

    public Sandwich armarSandwichSinTacc() {
        return director.armarSandwich(new SandwichSinTaccBuilder());
    }
}
