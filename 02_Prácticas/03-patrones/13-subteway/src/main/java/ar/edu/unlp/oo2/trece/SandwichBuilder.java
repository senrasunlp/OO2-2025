package ar.edu.unlp.oo2.trece;

public abstract class SandwichBuilder {
    protected Sandwich sandwich;

    public void reset() {
        sandwich = new Sandwich();
    }
    public Sandwich getResultado() {
        return sandwich;
    }

    public abstract void setPan();

    public abstract void setAderezo();

    public abstract void setPrincipal();

    public abstract void setAdicional();
}
