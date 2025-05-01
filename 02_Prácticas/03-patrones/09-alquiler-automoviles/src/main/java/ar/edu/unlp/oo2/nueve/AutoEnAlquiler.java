package ar.edu.unlp.oo2.nueve;

public class AutoEnAlquiler {
    private double precioPorDia;
    private Integer cantidadPlazas;
    private String marca;
    private PoliticaCancelacion politica;

    public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca) {
        this.precioPorDia = precioPorDia;
        this.cantidadPlazas = cantidadPlazas;
        this.marca = marca;
        this.politica = new PoliticaFlexible();
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public Double montoAReembolsar(Reserva reserva) {
        return this.politica.montoAReembolsar(reserva);
    }

    public void setPolitica(PoliticaCancelacion politica) {
        this.politica = politica;
    }

    public PoliticaCancelacion getPolitica() {
        return politica;
    }
}
