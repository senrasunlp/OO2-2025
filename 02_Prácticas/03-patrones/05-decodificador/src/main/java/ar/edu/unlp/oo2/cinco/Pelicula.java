package ar.edu.unlp.oo2.cinco;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private String nombre;
    private double puntaje;
    private int estreno;
    private List<Pelicula> peliculasSimilares;

    public Pelicula(String nombre, double puntaje, int estreno) {
        this.nombre = nombre;
        this.puntaje = puntaje;
        this.estreno = estreno;
        peliculasSimilares = new ArrayList<Pelicula>();
    }

    public void agregarSimilares(Pelicula pelicula) {
        this.peliculasSimilares.add(pelicula);
    }

    public void agregarSimilares(List<Pelicula> peliculasSimilares) {
        this.peliculasSimilares.addAll(peliculasSimilares);
    }

    public int getEstreno(){
        return estreno;
    }
    public double getPuntaje(){
        return puntaje;
    }

    public List<Pelicula> getPeliculasSimilares(){
        return peliculasSimilares;
    }
}
