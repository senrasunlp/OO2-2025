package ar.edu.unlp.oo2.nueve;

public class PoliticaEstricta  implements PoliticaCancelacion {
    @Override
    public Double montoAReembolsar(Reserva reserva) {
        return 0.0;
    }
}
