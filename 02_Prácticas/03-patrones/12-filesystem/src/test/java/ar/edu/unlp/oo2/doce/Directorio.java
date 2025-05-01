package ar.edu.unlp.oo2.doce;

import java.util.*;
import java.util.stream.Collectors;

public class Directorio extends ElementoFS {
    private List<ElementoFS> elementos;

    public Directorio(String nombre) {
        super(nombre);
        elementos = new ArrayList<ElementoFS>();
    }

    public List<ElementoFS> getElementos() {
        return elementos;
    }
    public void add(ElementoFS... elementos) {
        Collections.addAll(this.elementos, elementos);
    }

    @Override
    public Archivo archivoMasNuevo() {
        List<Archivo> archivos = elementos.stream().map( ElementoFS::archivoMasNuevo ).filter(Objects::nonNull).collect(Collectors.toList());
        return archivos.stream().max(Comparator.comparing(Archivo::getFechaCreacion)).orElse(null);
    }

    @Override
    public Archivo archivoMasGrande() {
        List<Archivo> archivos = elementos.stream().map( ElementoFS::archivoMasGrande ).filter(Objects::nonNull).collect(Collectors.toList());
        return archivos.stream().max(Comparator.comparing(Archivo::getTamano)).orElse(null);
    }

    @Override
    public int tamanoTotalOcupado() {
        return 32 + elementos.stream().mapToInt(ElementoFS::tamanoTotalOcupado).sum();
    }

    @Override
    public ElementoFS buscar(String nombre) {
        if (this.getNombre().contains(nombre)) return this;
        System.out.println(this.getNombre());
        return elementos.stream().map(e -> e.buscar(nombre)).filter(Objects::nonNull).findFirst().orElse(null);
    }

    public List<ElementoFS> buscarTodos(String nombre) {
        List<ElementoFS> result = new ArrayList<ElementoFS>();
        System.out.println(this.getNombre());
        if (this.getNombre().contains(nombre)) result.add(this);
        elementos.stream().map(e -> e.buscarTodos(nombre)).forEach(result::addAll);
        return result;
    }

    @Override
    public List<String> listadoDeContenido() {
        List<String> lista = new ArrayList<String>();
        String currentDir = this.getNombre() + "/";
        if (elementos.isEmpty()){
            return List.of(currentDir);
        } else {
            elementos.stream().map(ElementoFS::listadoDeContenido).forEach(lista::addAll);
            return lista.stream().map(e -> currentDir + e).collect(Collectors.toList());
        }
    }
}
