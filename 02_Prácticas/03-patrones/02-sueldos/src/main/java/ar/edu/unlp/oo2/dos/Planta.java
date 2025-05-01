package ar.edu.unlp.oo2.dos;

public class Planta extends Empleado{
    private int antiguedad;

    public Planta(boolean casado, Integer cantidadHijos, int antiguedad){
        super(casado,cantidadHijos);
        this.antiguedad=antiguedad;
    }

    public double basico(){
        return 50000;
    }
    public double adicional(){
        return (casado ? 5000 : 0) + cantidadHijos * 2000 + 2000*antiguedad;
    }
}
