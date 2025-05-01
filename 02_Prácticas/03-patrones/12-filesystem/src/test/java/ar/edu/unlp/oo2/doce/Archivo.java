package ar.edu.unlp.oo2.doce;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Archivo extends ElementoFS {
    private LocalDate fechaCreacion;
    private int tamano;

    public Archivo(LocalDate fechaCreacion, int tamano, String nombre) {
        super(nombre);
        this.fechaCreacion = fechaCreacion;
        this.tamano = tamano;
    }

    @Override
    public Archivo archivoMasNuevo() {
        return this;
    }

    @Override
    public Archivo archivoMasGrande() {
        return this;
    }

    @Override
    public int tamanoTotalOcupado() {
        return tamano;
    }

    @Override
    public ElementoFS buscar(String nombre) {
       return this.getNombre().contains(nombre) ? this : null;
    }

    @Override
    public List<ElementoFS> buscarTodos(String nombre) {
        return this.getNombre().contains(nombre) ? List.of(this) : null;

    }

    @Override
    public List<String> listadoDeContenido() {
        return List.of(this.getNombre());
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public int getTamano() {
        return tamano;
    }
}
