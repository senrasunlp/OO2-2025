package ar.edu.unlp.oo2.once;

public class Pantano implements Topografia {
    @Override
    public double proporcionAgua() {
        return 0.7;
    }

    @Override
    public double proporcionTierra() {
        return 0.3;
    }
}
