package ar.edu.unlp.oo2.quince;

public class Director {

    private PCBuilder builder;

    public Equipo armarPc(PCBuilder builder){
        builder.setCpu();
        builder.setRam();
        builder.setGpu();
        builder.setGabinete();
        return builder.getEquipo();
    }


}
