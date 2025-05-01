package ar.edu.unlp.oo2.seis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {

    private String nombre;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String puntoEncuentro;
    private double costo;
    private int cupoMinimo;
    private int cupoMaximo;
    private List<Usuario> listaInscriptos;
    private List<Usuario> listaEspera;
    private Estado estado;

    public Excursion(String nombre, LocalDate fechaInicio, LocalDate fechaFin, String puntoEncuentro, double costo, int cupoMinimo, int cupoMaximo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.puntoEncuentro = puntoEncuentro;
        this.costo = costo;
        this.cupoMinimo = cupoMinimo;
        this.cupoMaximo = cupoMaximo;
        this.listaInscriptos = new ArrayList<Usuario>();
        this.listaEspera = new ArrayList<Usuario>();
        this.estado = new Provisoria();
    }

    public void inscribir(Usuario usuario) {
        this.estado.inscribir(this,usuario);
    }

    public String obtenerInformacion(){
        return this.estado.obtenerInformacion(this);
    }

    public int getListaInscriptosSize() {
        return this.listaInscriptos.size();
    }

    public int getListaEsperaSize() {
        return this.listaEspera.size();
    }

    public int getCupoMinimo() {
        return this.cupoMinimo;
    }

    public int getCupoMaximo() {
        return this.cupoMaximo;
    }

    public void agregarListaInscriptos(Usuario usuario) {
        this.listaInscriptos.add(usuario);
    }

    public void agregarListaEspera(Usuario usuario) {
        this.listaEspera.add(usuario);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }
    public double getCosto() {
        return costo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }
    public String getPuntoEncuentro() {
        return puntoEncuentro;
    }
    public int cantidadFaltantesMinimo() {
        return this.cupoMinimo - this.listaInscriptos.size();
    }

    public int cantidadFaltantesMaximo() {
        return this.cupoMaximo - this.listaInscriptos.size();
    }

    public String mailsInscriptos() {
        List<String> mails = this.listaInscriptos.stream().map(Usuario::getEmail).collect(Collectors.toList());
        return mails.toString();
    }

    public Estado getEstado() {
        return estado;
    }
}
