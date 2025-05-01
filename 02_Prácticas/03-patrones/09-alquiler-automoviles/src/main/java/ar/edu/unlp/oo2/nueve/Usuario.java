package ar.edu.unlp.oo2.nueve;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<AutoEnAlquiler> autosEnAlquiler;

    public Usuario (String nombre){
        this.nombre = nombre;
        this.autosEnAlquiler = new ArrayList<AutoEnAlquiler>();
    }

    public void addAutoEnAlquiler(AutoEnAlquiler auto){
        this.autosEnAlquiler.add(auto);
    }
}
