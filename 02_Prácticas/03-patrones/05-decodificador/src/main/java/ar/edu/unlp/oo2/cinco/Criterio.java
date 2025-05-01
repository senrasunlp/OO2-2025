package ar.edu.unlp.oo2.cinco;

import java.util.ArrayList;
import java.util.List;

public abstract class Criterio {
    abstract List<Pelicula> sugerirPeliculas(Decodificador decodificador);

    List<Pelicula> peliculasSinUltimasVistas(List<Pelicula> ultimasVistas, List<Pelicula> peliculasSinFiltrar){
        List<Pelicula> peliculasSinUltimasVistas = new ArrayList<>(peliculasSinFiltrar);
        peliculasSinUltimasVistas.removeAll(ultimasVistas);
        return peliculasSinUltimasVistas;
    }
}
