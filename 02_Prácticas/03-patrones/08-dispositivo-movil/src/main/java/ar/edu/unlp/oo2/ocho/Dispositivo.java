package ar.edu.unlp.oo2.ocho;

public class Dispositivo {

    private CRC_Algorithm crcCalculator;
    private Display display;
    private Ringer ringer;
    private Connection connection;

    public Dispositivo(){
        display = new Display();
        ringer = new Ringer();
        crcCalculator = new CRC16_Calculator();
        connection = new WifiConn();
    }

    public String send(String data){
        long crc = this.crcCalculator.crcFor(data);
        return this.connection.sendData(data, (int) crc);
    }

    public void setCrcCalculator(CRC_Algorithm crcCalculator) {
        this.crcCalculator = crcCalculator;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
        System.out.println(this.connection.pict());
        this.ringer.ring();
    }

    public Connection getConnection() {
        return connection;
    }


    public CRC_Algorithm getCrcCalculator() {
        return crcCalculator;
    }
}
