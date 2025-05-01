package ar.edu.unlp.oo2.catorce;

public class PrendaInmueble implements Prenda{
    private String direccion;
    private double superficie;
    private double costom2;

    public PrendaInmueble(String direccion, double superficie, double costom2) {
        this.direccion = direccion;
        this.superficie = superficie;
        this.costom2 = costom2;
    }

    @Override
    public double liquidez() {
        return 0.2;
    }

    @Override
    public double calcularValor() {
        return superficie * costom2;
    }
}
