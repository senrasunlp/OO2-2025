public class Mensajero {
    private CypherAlgorithm cipher;

    public void setCipher(CypherAlgorithm cipher) {
        this.cipher = cipher;
    }

    public void enviar (String mensaje){
        cipher.enviar(mensaje);
    }

    public void recibir (String mensaje){
        cipher.recibir(mensaje);
    }

}
