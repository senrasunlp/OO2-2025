package ar.edu.unlp.oo2.nueve;

import java.time.LocalDate;

public class PoliticaFlexible implements PoliticaCancelacion {

    @Override
    public Double montoAReembolsar(Reserva reserva) {
        return reserva.montoAPagar();
    }
}
