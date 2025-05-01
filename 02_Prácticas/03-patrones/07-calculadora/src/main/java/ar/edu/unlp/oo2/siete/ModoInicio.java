package ar.edu.unlp.oo2.siete;

public class ModoInicio extends Modo{

    @Override
    public void setValor(double valor, Calculadora calculadora) {
        calculadora.setValorAcumulado(valor);
        calculadora.setModo(new ModoSetValor());
    }
}
