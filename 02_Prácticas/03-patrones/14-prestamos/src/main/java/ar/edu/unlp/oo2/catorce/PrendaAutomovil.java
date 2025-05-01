package ar.edu.unlp.oo2.catorce;

import java.time.LocalDate;

public class PrendaAutomovil implements Prenda {
    private int modelo;
    private double kilometraje;
    private int costo0km;

    public PrendaAutomovil(int modelo, double kilometraje, int costo0km) {
        this.modelo = modelo;
        this.kilometraje = kilometraje;
        this.costo0km = costo0km;
    }

    @Override
    public double liquidez() {
        return 0.7;
    }

    @Override
    public double calcularValor() {
        return ((LocalDate.now().getYear() - modelo)/10.0)* costo0km;
    }
}
