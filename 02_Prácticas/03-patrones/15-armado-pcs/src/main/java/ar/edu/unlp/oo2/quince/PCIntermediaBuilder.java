package ar.edu.unlp.oo2.quince;

public class PCIntermediaBuilder extends PCBuilder {

    public PCIntermediaBuilder(Catalogo catalogo) {
        super(catalogo);
    }

    @Override
    void setCpu() {
        this.addComponente(this.getCatalogo().getComponente("Procesador Intermedio"));
    }

    @Override
    void setRam() {
        this.addComponente(this.getCatalogo().getComponente("16 GB"));
    }

    @Override
    void setDisco() {
        this.addComponente(this.getCatalogo().getComponente("SSD 500 GB"));
    }

    @Override
    void setGpu() {
        this.addComponente(this.getCatalogo().getComponente("GTX 1650"));
    }

    @Override
    void setGabinete() {
        this.addComponente(this.getCatalogo().getComponente("Gabinete Intermedio"));
        this.addComponente(this.getCatalogo().getComponente("Fuente 800W"));
    }
}
