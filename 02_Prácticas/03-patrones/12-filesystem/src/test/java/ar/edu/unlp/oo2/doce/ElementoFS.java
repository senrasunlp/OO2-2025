package ar.edu.unlp.oo2.doce;

import java.util.List;

public abstract class ElementoFS {

    private String nombre;

    public ElementoFS(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract Archivo archivoMasNuevo();

    public abstract Archivo archivoMasGrande();

    public abstract int tamanoTotalOcupado();

    public abstract ElementoFS buscar(String nombre);

    public abstract List<ElementoFS> buscarTodos(String nombre);

    public abstract List<String> listadoDeContenido();
}
