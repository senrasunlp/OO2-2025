package ar.edu.unlp.oo2.siete;

public abstract class Modo {
    public String getResultado(Calculadora calculadora){
        return String.valueOf(calculadora.getValorAcumulado());
    }
    public void mas(Calculadora calculadora){
        calculadora.setModo(new ModoError());
        System.out.println("No puede realizar una suma en este modo.");
    }

    public void menos(Calculadora calculadora){
        calculadora.setModo(new ModoError());
        System.out.println("No puede realizar una resta en este modo.");
    }

    public void multiplicar(Calculadora calculadora){
        calculadora.setModo(new ModoError());
        System.out.println("No puede realizar una multiplicación en este modo.");
    }

    public void dividir(Calculadora calculadora){
        calculadora.setModo(new ModoError());
        System.out.println("No puede realizar una división en este modo.");
    }

    public abstract void setValor(double valor, Calculadora calculadora);
}