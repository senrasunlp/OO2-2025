import ar.info.juego.Encriptador.FeistelCipher;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MensajeroTest {

    Mensajero mensajero;

    @BeforeEach
    public void setUp() {
        mensajero = new Mensajero();
    }

    @Test
    public void testEnviar() {
        mensajero.setCipher(new RC4Adapter());
        mensajero.enviar("Hola mundo!");
        mensajero.setCipher(new FeistelCipherAdapter());
        mensajero.enviar("Hola mundo!");
    }
}
