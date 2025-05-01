package ar.edu.unlp.oo2.siete;

public class ModoError extends Modo {

    @Override
    public void setValor(double valor, Calculadora calculadora) {
        System.out.println("Error");
    }

    public String getResultado(Calculadora calculadora){
        return "Error";
    }
}
