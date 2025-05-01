package ar.edu.unlp.oo2.once;

public class Tierra implements Topografia {
    @Override
    public double proporcionAgua() {
        return 0;
    }

    @Override
    public double proporcionTierra() {
        return 1;
    }
}
