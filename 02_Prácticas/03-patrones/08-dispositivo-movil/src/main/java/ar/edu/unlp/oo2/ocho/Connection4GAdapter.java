package ar.edu.unlp.oo2.ocho;

public class Connection4GAdapter implements Connection{
    private Connection4G connection;

    public Connection4GAdapter(){
        connection = new Connection4G();
    }
    @Override
    public String sendData(String data, Integer crc) {
        return connection.transmit(data,crc);
    }

    @Override
    public String pict() {
        return connection.symb();
    }
}
