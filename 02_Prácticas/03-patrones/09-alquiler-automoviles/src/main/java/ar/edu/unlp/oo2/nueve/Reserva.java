package ar.edu.unlp.oo2.nueve;

import java.time.LocalDate;

public class Reserva {
    private Integer cantidadDias;
    private LocalDate fecha;
    private Usuario conductor;
    private AutoEnAlquiler auto;

    public Reserva(Integer cantidadDias, LocalDate fecha, Usuario conductor, AutoEnAlquiler auto) {
        this.cantidadDias = cantidadDias;
        this.fecha = fecha;
        this.conductor = conductor;
        this.auto = auto;
    }

    public Double montoAPagar(){
        return this.cantidadDias * this.auto.getPrecioPorDia();
    }

    public Double montoAReembolsar(){
        if (fecha.isBefore(LocalDate.now()))
            throw new RuntimeException("La reserva ya está en curso, no se puede cancelar.");
        return this.auto.montoAReembolsar(this);
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
