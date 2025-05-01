package ar.edu.unlp.oo2.cinco;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
    private List<Pelicula> peliculas;
    private List<Pelicula> ultimasVistas;
    private Criterio criterio;

    public Decodificador(){
        peliculas = new ArrayList<>();
        ultimasVistas = new ArrayList<>();
    }
    public void agregarPeliculas(List<Pelicula> peliculas) {
        this.peliculas.addAll(peliculas);
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public List<Pelicula> sugerirPeliculas() {
        return criterio.sugerirPeliculas(this);
    }

    public void agregarUltimasVistas(List<Pelicula> ultimasVistas) {
        this.ultimasVistas = ultimasVistas;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public List<Pelicula> getUltimasVistas() {
        return ultimasVistas;
    }
}
