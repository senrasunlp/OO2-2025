package ar.edu.unlp.oo2.ocho;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DispositivoTest {

    Dispositivo dispositivo = new Dispositivo();

    @Test
    public void testSend(){
        String data = "Hello World";
        assertTrue(dispositivo.getConnection() instanceof WifiConn);
        assertTrue(dispositivo.getCrcCalculator() instanceof CRC16_Calculator);
        System.out.println(dispositivo.send(data));
    }

    @Test
    public void testConectarCon(){
        assertTrue(dispositivo.getConnection() instanceof WifiConn);
        dispositivo.setConnection(new Connection4GAdapter());
        assertTrue(dispositivo.getConnection() instanceof Connection4GAdapter);
    }

    @Test
    public void testConfigurarCRC(){
        assertTrue(dispositivo.getCrcCalculator() instanceof CRC16_Calculator);
        dispositivo.setCrcCalculator(new CRC32_Calculator());
        assertTrue(dispositivo.getCrcCalculator() instanceof CRC32_Calculator);
    }
}
