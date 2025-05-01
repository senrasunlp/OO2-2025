package ar.edu.unlp.oo2.siete;

public class ModoMultiplicacion extends Modo {

    @Override
    public void setValor(double valor, Calculadora calculadora) {
        double valorAcumulado = calculadora.getValorAcumulado() * valor;
        calculadora.setValorAcumulado(valorAcumulado);
        calculadora.setModo(new ModoSetValor());
    }
}
