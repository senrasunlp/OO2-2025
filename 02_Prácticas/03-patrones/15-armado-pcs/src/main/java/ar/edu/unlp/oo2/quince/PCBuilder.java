package ar.edu.unlp.oo2.quince;

import java.time.LocalDate;

public abstract class PCBuilder {
    private Equipo equipo;
    private Catalogo catalogo;
    private String cliente;

    public PCBuilder (Catalogo catalogo){
        this.reset();
        this.catalogo = catalogo;
    }

    public void reset() {
        equipo = new Equipo();
    }
    protected Catalogo getCatalogo() {
        return catalogo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public Presupuesto getPresupuesto() {
        return new Presupuesto(equipo,cliente, LocalDate.now());
    }

    abstract void setCpu();

    abstract void setRam();

    abstract void setDisco();

    abstract void setGpu();

    abstract void setGabinete();

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    protected void addComponente(Componente componente) {
        equipo.addComponente(componente);
    }
}
