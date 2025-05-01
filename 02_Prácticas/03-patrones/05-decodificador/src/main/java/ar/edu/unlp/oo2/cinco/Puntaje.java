package ar.edu.unlp.oo2.cinco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Puntaje extends Criterio{

    @Override
    public List<Pelicula> sugerirPeliculas(Decodificador decodificador) {
        List<Pelicula> filtradas = this.peliculasSinUltimasVistas(decodificador.getUltimasVistas(),decodificador.getPeliculas());
        return filtradas.stream().sorted(Comparator
                .comparingDouble(Pelicula::getPuntaje).reversed()
                .thenComparing(Pelicula::getEstreno, Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toList());
    }
}
