package ar.edu.unlp.oo2.siete;

public class ModoSetValor extends Modo {

    @Override
    public void setValor(double valor, Calculadora calculadora) {
        System.out.println("No puede agregar otro valor, debe ingresar una operación.");
        calculadora.setModo(new ModoError());
    }

    @Override
    public void mas(Calculadora calculadora) {
        calculadora.setModo(new ModoSuma());
    }

    @Override
    public void menos(Calculadora calculadora) {
        calculadora.setModo(new ModoResta());
    }

    @Override
    public void multiplicar(Calculadora calculadora) {
        calculadora.setModo(new ModoMultiplicacion());
    }

    @Override
    public void dividir(Calculadora calculadora) {
        calculadora.setModo(new ModoDivision());
    }


}
