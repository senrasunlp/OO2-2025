package ar.edu.unlp.oo2.dos;

public class Temporario extends Empleado {
    private Integer horasTrabajo;

    public Temporario(boolean casado, Integer cantidadHijos, Integer horasTrabajo){
        super(casado, cantidadHijos);
        this.horasTrabajo=horasTrabajo;
    }

    public double basico(){
        return 20000 + horasTrabajo*300;
    }

    public double adicional(){
        return (casado ? 5000 : 0) + cantidadHijos * 2000;
    }
}
