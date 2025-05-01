package ar.edu.unlp.oo2.dos;

public abstract class Empleado {
    protected boolean casado;
    protected Integer cantidadHijos;

    public Empleado(boolean casado, Integer cantidadHijos){
        this.casado=casado;
        this.cantidadHijos=cantidadHijos;
    };

    public double descuento(){
        return this.basico()*0.13 + this.adicional()*0.05;
    };
    abstract double basico();
    abstract double adicional();

    public double sueldo(){
        return this.basico() + this.adicional() - this.descuento();
    }
}