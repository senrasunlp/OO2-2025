package ar.edu.unlp.oo2.seis;

public class Definitiva implements Estado {

    @Override
    public void inscribir(Excursion excursion, Usuario usuario) {
        excursion.agregarListaInscriptos(usuario);
        if (excursion.getListaInscriptosSize() == excursion.getCupoMaximo()) {
            excursion.setEstado(new Completada());
        }
    }

    //Si la excursión alcanzó el cupo mínimo pero aún no el máximo, la información es la siguiente:
    // nombre, costo, fechas, punto de encuentro,
    // los mails de los usuarios inscriptos y cantidad de usuarios faltantes para alcanzar el cupo máximo.
    @Override
    public String obtenerInformacion(Excursion excursion) {
        return "Excursión: " + excursion.getNombre()
                + "\nCosto: " + excursion.getCosto()
                + "\nFecha Inicio: " + excursion.getFechaInicio()
                + "\nFecha Fin: " + excursion.getFechaFin()
                + "\nPunto de Encuentro: " + excursion.getPuntoEncuentro()
                + "\nMails inscriptos: " + excursion.mailsInscriptos()
                + "\nCantidad Inscriptos faltantes para cupo mínimo: " + excursion.cantidadFaltantesMaximo();
    }

}
