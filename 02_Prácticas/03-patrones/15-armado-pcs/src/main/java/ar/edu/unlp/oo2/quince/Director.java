package ar.edu.unlp.oo2.quince;

public class Director {

    private PCBuilder builder;

    public Presupuesto armarPresupuesto(PCBuilder builder){
        builder.setCpu();
        builder.setRam();
        builder.setGpu();
        builder.setDisco();
        builder.setGabinete();
        return builder.getPresupuesto();
    }

    public Presupuesto armarPresupuesto(String cliente) {
        builder.setCliente(cliente);
        return this.armarPresupuesto();
    }

    public Presupuesto armarPresupuesto() {
        return this.armarPresupuesto(builder);
    }

    public void setBuilder(PCBuilder builder) {
        this.builder = builder;
    }
}
