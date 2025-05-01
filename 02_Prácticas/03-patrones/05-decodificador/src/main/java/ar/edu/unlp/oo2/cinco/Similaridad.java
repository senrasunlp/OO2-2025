package ar.edu.unlp.oo2.cinco;

import java.util.ArrayList;
import java.util.List;

public class Similaridad extends Criterio{

    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
        List<Pelicula> ultimasVistas = decodificador.getUltimasVistas();
        List<Pelicula> similares = new ArrayList<Pelicula>();
        ultimasVistas.forEach(vista -> similares.addAll(vista.getPeliculasSimilares()));
        List<Pelicula> filtradas = this.peliculasSinUltimasVistas(decodificador.getUltimasVistas(),similares);
        return filtradas;
    }
}
