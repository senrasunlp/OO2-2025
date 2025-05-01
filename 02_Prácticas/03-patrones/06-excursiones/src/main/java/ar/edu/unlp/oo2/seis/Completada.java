package ar.edu.unlp.oo2.seis;

public class Completada implements Estado {

    @Override
    public void inscribir(Excursion excursion, Usuario usuario) {
        excursion.agregarListaEspera(usuario);
    }

    //Si la excursión alcanzó el cupo máximo, la información solamente incluye:
    // nombre, costo, fechas y punto de encuentro.
    @Override
    public String obtenerInformacion(Excursion excursion) {
        return "Excursión: " + excursion.getNombre()
                + "\nCosto: " + excursion.getCosto()
                + "\nFecha Inicio: " + excursion.getFechaInicio()
                + "\nFecha Fin: " + excursion.getFechaFin()
                + "\nPunto de Encuentro: " + excursion.getPuntoEncuentro();
    }
}
