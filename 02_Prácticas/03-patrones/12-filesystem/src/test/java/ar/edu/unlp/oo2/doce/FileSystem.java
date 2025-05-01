package ar.edu.unlp.oo2.doce;

import java.util.List;
import java.util.stream.Collectors;

public class FileSystem {

    private Directorio raiz;

    public FileSystem() {raiz = new Directorio("dirA");}

    public void add(ElementoFS... elementos) {raiz.add(elementos);}

    public Archivo archivoMasNuevo() {
        return raiz.archivoMasNuevo();
    }

    public Archivo archivoMasGrande() {
        return raiz.archivoMasGrande();
    }

    public int tamanoTotalOcupado() {return raiz.tamanoTotalOcupado();}

    public ElementoFS buscar(String nombre) { return raiz.buscar(nombre);
    }

    public List<ElementoFS> buscarTodos(String nombre) {
        return raiz.buscarTodos(nombre);
    }

    public String listadoDeContenido() {
        return raiz.listadoDeContenido().stream().collect(Collectors.joining("\n"));
    }
}
