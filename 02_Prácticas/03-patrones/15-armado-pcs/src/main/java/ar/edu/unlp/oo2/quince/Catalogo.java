package ar.edu.unlp.oo2.quince;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {

    private List<Componente> componentes;

    public Catalogo() {
        componentes = new ArrayList<Componente>();
    }
    public Catalogo(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public void agregarComponentes(List<Componente> componentes){
        this.componentes.addAll(componentes);
    }

    public void agregarComponente(Componente componente){
        componentes.add(componente);
    }

    public Componente getComponente(String descripcion){
        return componentes.stream().filter(c -> c.getDescripcion().equals(descripcion)).findFirst().orElse(null);
    }
}
