package ar.edu.unlp.oo2.catorce;

import java.time.LocalDate;

public class PrendaAlquiler implements Prenda{
    private LocalDate inicioAlquiler;
    private LocalDate finAlquiler;
    private double costoMensual;

    public PrendaAlquiler(LocalDate inicioAlquiler, LocalDate finAlquiler, double costoMensual) {
        this.inicioAlquiler = inicioAlquiler;
        this.finAlquiler = finAlquiler;
        this.costoMensual = costoMensual;
    }

    @Override
    public double liquidez() {
        return 0.9;
    }

    @Override
    public double calcularValor() {
        return (finAlquiler.getYear() - inicioAlquiler.getYear()) * costoMensual;
    }
}
