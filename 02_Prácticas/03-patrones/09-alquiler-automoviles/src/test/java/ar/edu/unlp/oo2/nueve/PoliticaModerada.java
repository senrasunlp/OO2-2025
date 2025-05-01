package ar.edu.unlp.oo2.nueve;

import java.time.LocalDate;

public class PoliticaModerada implements PoliticaCancelacion {
    @Override
    public Double montoAReembolsar(Reserva reserva) {
        //30-04-2025 isBefore 21-04-2025
        if (LocalDate.now().isBefore(reserva.getFecha().minusDays(6)))
            return reserva.montoAPagar();
        else
            return reserva.montoAPagar()*0.5;

    }
}
