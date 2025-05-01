package ar.edu.unlp.oo2.once;

import java.util.List;

public class Mixta implements Topografia {
    private List<Topografia> topografias;

    public Mixta(List<Topografia> topografias) {
        this.topografias = topografias;
    }
    public Mixta(Topografia... topografias) {
        this.topografias = List.of(topografias);
    }

    @Override
    public double proporcionAgua() {
        return topografias.stream().mapToDouble(Topografia::proporcionAgua).average().orElse(0);
    }

    @Override
    public double proporcionTierra() {
        return topografias.stream().mapToDouble(Topografia::proporcionTierra).average().orElse(0);
    }
}
