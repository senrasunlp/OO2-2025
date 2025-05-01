package ar.edu.unlp.oo2.quince;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PresupuestadorTest {

    Componente ram8,ram16,ram3232;
    Componente cpuBasico, cpuIntermedio, cpuGamer;
    Componente hdd500,ssd500,ssd500ssd1tb;
    Componente noGpu,gtx1650,rtx4090;
    Componente gabineteEstandar, gabineteIntermedio, gabineteGamer;
    Componente fuente800W, fuente900W;//100+200+300+300 = 900
    Catalogo catalogo = new Catalogo();
    Presupuestador presupuestador;
    @BeforeEach
    void setUp(){
        ram8 = new Componente("RAM","8 GB",20000,50);
        ram16 = new Componente("RAM","16 GB",38000,70);
        ram3232 = new Componente("RAM","32 GB + 32 GB",90000,100);
        cpuBasico = new Componente("CPU","Procesador Básico",60000,100);
        cpuIntermedio = new Componente("CPU","Procesador Intermedio",100000,150);
        cpuGamer = new Componente("CPU","Procesador Gamer",180000,200);
        hdd500 = new Componente("Disco","HDD 500 GB",100000,200);
        ssd500 = new Componente("Disco","SSD 500 GB",150000,250);
        ssd500ssd1tb = new Componente("Disco","SSD 500 GB + SSD 1 TB",200000,300);
        noGpu = new Componente("GPU","No posee (integrada)",0,0);
        gtx1650 = new Componente("GPU","GTX 1650",150000,200);
        rtx4090 = new Componente("GPU","RTX 4090",500000,300);
        gabineteEstandar = new Componente("Gabinete","Gabinete Estándar (ya viene con fuente)",80000,0);
        gabineteIntermedio = new Componente("Gabinete","Gabinete Intermedio",100000,0);
        gabineteGamer = new Componente("Gabinete","Gabinete Gamer",150000,0);
        fuente800W = new Componente("Fuente","Fuente 800W",80000,0);
        fuente900W = new Componente("Fuente","Fuente 900W",90000,0);
        List<Componente> listaCatalogo = List.of(ram8,ram16,ram3232,cpuBasico,cpuIntermedio,cpuGamer,hdd500,ssd500,ssd500ssd1tb,noGpu,gtx1650,rtx4090,gabineteEstandar,gabineteIntermedio,gabineteGamer,fuente800W,fuente900W);
        catalogo.agregarComponentes(listaCatalogo);
        presupuestador = new Presupuestador(catalogo);
    }

    @Test
    public void armarPresupuestoBasicoTest(){
        Presupuesto presupuesto = presupuestador.armarPresupuestoBasico("Cliente 1");
        presupuesto.imprimirPresupuesto();
    }

    @Test
    public void armarPresupuestoIntermedioTest(){
        Presupuesto presupuesto = presupuestador.armarPresupuestoIntermedio("Cliente 2");
        presupuesto.imprimirPresupuesto();
    }

    @Test
    public void armarPresupuestoGamerTest(){
        Presupuesto presupuesto = presupuestador.armarPresupuestoGamer("Cliente 3");
        presupuesto.imprimirPresupuesto();
    }
}
