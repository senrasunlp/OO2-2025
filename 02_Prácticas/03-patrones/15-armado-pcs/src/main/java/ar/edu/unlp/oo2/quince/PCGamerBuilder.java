package ar.edu.unlp.oo2.quince;

public class PCGamerBuilder extends PCBuilder {

    public PCGamerBuilder(Catalogo catalogo) {
        super(catalogo);
    }

    @Override
    void setCpu() {
        this.addComponente(this.getCatalogo().getComponente("Procesador Gamer"));
    }
    @Override
    void setRam() {
        this.addComponente(this.getCatalogo().getComponente("32 GB + 32 GB"));
    }

    @Override
    void setDisco() {
        this.addComponente(this.getCatalogo().getComponente("SSD 500 GB + SSD 1 TB"));
    }

    @Override
    void setGpu() {
        this.addComponente(this.getCatalogo().getComponente("RTX 4090"));
    }

    double getConsumoTotal(){
        return this.getEquipo().consumoTotal()*1.50;
    }
    @Override
    void setGabinete() {
        this.addComponente(this.getCatalogo().getComponente("Gabinete Gamer"));
        this.addComponente(this.getCatalogo().getComponente("Fuente "+(int)getConsumoTotal()+"W"));

    }
}
