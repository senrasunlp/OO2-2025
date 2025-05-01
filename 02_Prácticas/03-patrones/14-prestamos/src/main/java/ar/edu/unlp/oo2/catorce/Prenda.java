package ar.edu.unlp.oo2.catorce;

public interface Prenda {

    double liquidez();
    double calcularValor();
    default double calcularValorPrendario(){
        return calcularValor() * liquidez();
    }

}
