package ar.edu.unlp.oo2.seis;

public interface Estado {
    void inscribir(Excursion excursion, Usuario usuario);

    String obtenerInformacion(Excursion excursion);
}
