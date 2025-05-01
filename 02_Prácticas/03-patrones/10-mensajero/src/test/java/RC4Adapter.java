import ar.info.juego.Encriptador.RC4;

public class RC4Adapter implements CypherAlgorithm {
    private RC4 rc4;

    public RC4Adapter() {
        rc4 = new RC4();
    }

    @Override
    public void enviar(String mensaje) {
        rc4.encriptar(mensaje, "key");
    }

    @Override
    public void recibir(String mensaje) {
        rc4.desencriptar(mensaje, "key");
    }
}
