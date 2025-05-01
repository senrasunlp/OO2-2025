import ar.info.juego.Encriptador.FeistelCipher;

public class FeistelCipherAdapter implements CypherAlgorithm {
    private final FeistelCipher feistelCipher;

    public FeistelCipherAdapter() {
        feistelCipher = new FeistelCipher("key");
    }
    @Override
    public void enviar(String mensaje) {
        feistelCipher.encode(mensaje);
    }

    @Override
    public void recibir(String mensaje) {
        feistelCipher.encode(mensaje);
    }
}
