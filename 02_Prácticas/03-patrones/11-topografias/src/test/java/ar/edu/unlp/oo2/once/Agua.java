package ar.edu.unlp.oo2.once;

public class Agua implements Topografia {
    @Override
    public double proporcionAgua() {
        return 1;
    }

    @Override
    public double proporcionTierra() {
        return 0;
    }
}
