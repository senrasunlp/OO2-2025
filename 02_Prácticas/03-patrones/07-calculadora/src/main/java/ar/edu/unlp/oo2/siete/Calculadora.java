package ar.edu.unlp.oo2.siete;

public class Calculadora {

    private double valorAcumulado;
    private Modo modo;
    public Calculadora() {
        valorAcumulado = 0;
        this.modo = new ModoInicio();
    }

    public String getResultado(){
        return this.modo.getResultado(this);
    }

    public void borrar(){
        valorAcumulado = 0;
        this.modo = new ModoInicio();
    }

    public void mas(){
        this.modo.mas(this);
    }

    public void menos(){
        this.modo.menos(this);
    }

    public void multiplicar(){
        this.modo.multiplicar(this);
    }

    public void dividir(){
        this.modo.dividir(this);
    }

    public void setValor(double valor){
        this.modo.setValor(valor, this);
    }

    public void setValorAcumulado(double valor){
        this.valorAcumulado = valor;
    }

    public double getValorAcumulado() {
        return valorAcumulado;
    }

    public void setModo(Modo modo){
        this.modo = modo;
    }

}
