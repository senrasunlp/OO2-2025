package ar.edu.unlp.oo2.trece;

public class Sandwich {
    private String pan;
    private double precioPan;
    private String aderezo;
    private double precioAderezo;
    private String principal;
    private double precioPrincipal;
    private String adicional;
    private double precioAdicional;

    public void setPan(String pan, double precioPan) {
        this.pan = pan;
        this.precioPan = precioPan;
    }

    public void setAderezo(String aderezo, double precioAderezo) {
        this.aderezo = aderezo;
        this.precioAderezo = precioAderezo;
    }

    public void setPrincipal(String principal, double precioPrincipal) {
        this.principal = principal;
        this.precioPrincipal = precioPrincipal;
    }

    public void setAdicional(String adicional, double precioAdicional) {
        this.adicional = adicional;
        this.precioAdicional = precioAdicional;
    }

    public double calcularPrecio() {
        return precioPan + precioAderezo + precioPrincipal + precioAdicional;
    }

    public String toString() {
        return "Sandwich: " +
                "\n Pan: " + pan +
                "\n Aderezo: " + (aderezo != null ? aderezo : "Sin aderezo") +
                "\n Principal: " + principal +
                "\n Adicional: " + (adicional != null ? adicional : "Sin adicional") +
                "\n Precio total: $" + calcularPrecio();
    }
}
