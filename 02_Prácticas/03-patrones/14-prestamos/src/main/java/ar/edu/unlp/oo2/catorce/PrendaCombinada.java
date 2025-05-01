package ar.edu.unlp.oo2.catorce;

import java.util.List;

public class PrendaCombinada implements Prenda{
    private List<Prenda> prendas;

    public PrendaCombinada(Prenda... prendas) {
        this.prendas = List.of(prendas);
    }

    @Override
    public double liquidez() {
        return 0.5;
    }

    @Override
    public double calcularValor() {
        return (prendas.stream().mapToDouble(Prenda::calcularValor).sum());
    }
}
