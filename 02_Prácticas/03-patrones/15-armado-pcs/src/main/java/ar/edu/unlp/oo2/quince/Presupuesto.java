package ar.edu.unlp.oo2.quince;

import java.time.LocalDate;

public class Presupuesto {
    private Equipo equipo;
    private String nombre;
    private LocalDate fechaSolicitado;

    public Presupuesto(Equipo equipo, String nombre, LocalDate fechaSolicitado) {
        this.equipo = equipo;
        this.nombre = nombre;
        this.fechaSolicitado = fechaSolicitado;
    }
    public double getPrecioTotal(){
        return equipo.precioTotal();
    }

    public double getConsumoTotal(){
        return equipo.consumoTotal();
    }

    public void imprimirPresupuesto(){
        System.out.println("Cliente: " + nombre);
        System.out.println("Fecha: " + fechaSolicitado);
        System.out.println("Componentes:");
        for (Componente c : equipo.getComponentes()) {
            System.out.println(c.getNombre()+": "+c.getDescripcion()+" - "+c.getPrecio()+"$");
        }
        System.out.println("Consumo total: " + getConsumoTotal() + "W");
        System.out.println("Precio final: $" + getPrecioTotal());
    }
}
