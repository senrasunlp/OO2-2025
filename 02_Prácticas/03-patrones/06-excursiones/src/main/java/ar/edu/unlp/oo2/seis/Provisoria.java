package ar.edu.unlp.oo2.seis;

public class Provisoria implements Estado {
    @Override
    public void inscribir(Excursion excursion, Usuario usuario) {
        excursion.agregarListaInscriptos(usuario);
        if (excursion.getListaInscriptosSize() == excursion.getCupoMinimo()) {
            excursion.setEstado(new Definitiva());
        }
    }
    //Si la excursión no alcanza el cupo mínimo, la información es la siguiente:
    // nombre, costo, fechas, punto de encuentro, cantidad de usuarios faltantes para alcanzar el cupo mínimo.
    @Override
    public String obtenerInformacion(Excursion excursion) {
        return "Excursión: " + excursion.getNombre()
                + "\nCosto: " + excursion.getCosto()
                + "\nFecha Inicio:" + excursion.getFechaInicio()
                + "\nFecha Fin:" + excursion.getFechaFin()
                + "\nPunto de Encuentro:" + excursion.getPuntoEncuentro()
                + "\nCantidad Inscriptos faltantes para cupo mínimo:" + excursion.cantidadFaltantesMinimo();
    }
}
