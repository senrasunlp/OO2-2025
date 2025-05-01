package ar.edu.unlp.oo2.quince;

import java.time.LocalDate;

public class Presupuestador {

    private Catalogo catalogo;
    private Director director;

    public Presupuestador(Catalogo catalogo) {
        this.catalogo = catalogo;
        this.director = new Director();
    }

    public Presupuesto armarPresupuestoBasico(String cliente){
        Equipo equipo = director.armarPc(new PCBasicaBuilder(catalogo));
        return new Presupuesto(equipo, cliente, LocalDate.now());
    }

    public Presupuesto armarPresupuestoIntermedio(String cliente){
        Equipo equipo = director.armarPc(new PCIntermediaBuilder(catalogo));
        return new Presupuesto(equipo, cliente, LocalDate.now());
    }

    public Presupuesto armarPresupuestoGamer(String cliente){
        Equipo equipo = director.armarPc(new PCGamerBuilder(catalogo));
        return new Presupuesto(equipo, cliente, LocalDate.now());
    }

}
