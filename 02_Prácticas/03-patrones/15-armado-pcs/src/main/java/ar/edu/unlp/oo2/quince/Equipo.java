package ar.edu.unlp.oo2.quince;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private List<Componente> componentes;

    public Equipo(){
        componentes = new ArrayList<>();
    }

    public void addComponente(Componente componente) {
        componentes.add(componente);
    }

    public double consumoTotal(){
        return componentes.stream().mapToDouble(Componente::getConsumo).sum();
    }

    public double precioTotal(){
        return componentes.stream().mapToDouble(Componente::getPrecio).sum()*1.21;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }
}
