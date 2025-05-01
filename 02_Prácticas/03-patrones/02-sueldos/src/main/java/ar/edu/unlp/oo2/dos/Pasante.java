package ar.edu.unlp.oo2.dos;

public class Pasante extends Empleado{
    private int examenesRendidos;

    public Pasante(boolean casado, Integer cantidadHijos, int examenesRendidos){
        super(casado,cantidadHijos);
        this.examenesRendidos=examenesRendidos;
    }

    public double basico(){
        return 20000;
    }
    public double adicional(){
        return examenesRendidos * 2000;
    }
}
