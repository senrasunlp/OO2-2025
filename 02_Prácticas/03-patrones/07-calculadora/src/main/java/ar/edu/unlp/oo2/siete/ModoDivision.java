package ar.edu.unlp.oo2.siete;

public class ModoDivision extends Modo {

    @Override
    public void setValor(double valor, Calculadora calculadora) {
        if (valor == 0) {
            System.out.println("No se puede dividir por cero");
            calculadora.setModo(new ModoError());
        }
        double valorAcumulado = calculadora.getValorAcumulado() % valor;
        calculadora.setValorAcumulado(valorAcumulado);
        calculadora.setModo(new ModoSetValor());
    }
}
