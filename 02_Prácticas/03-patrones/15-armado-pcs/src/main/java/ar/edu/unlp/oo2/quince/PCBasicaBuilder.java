package ar.edu.unlp.oo2.quince;

public class PCBasicaBuilder extends PCBuilder {

    public PCBasicaBuilder(Catalogo catalogo) {
        super(catalogo);
    }

    @Override
    void setCpu() {
        this.addComponente(this.getCatalogo().getComponente("Procesador Básico"));
    }

    @Override
    void setRam() {
        this.addComponente(this.getCatalogo().getComponente("8 GB"));
    }

    @Override
    void setDisco() {
        this.addComponente(this.getCatalogo().getComponente("HDD 500 GB"));
    }

    @Override
    void setGpu() {
        this.addComponente(this.getCatalogo().getComponente("No posee (integrada)"));
    }

    @Override
    void setGabinete() {
        this.addComponente(this.getCatalogo().getComponente("Gabinete Estándar (ya viene con fuente)"));
    }
}
