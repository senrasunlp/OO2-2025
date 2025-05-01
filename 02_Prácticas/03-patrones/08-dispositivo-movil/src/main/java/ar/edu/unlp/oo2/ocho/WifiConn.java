package ar.edu.unlp.oo2.ocho;

public class WifiConn implements Connection {
    private String pict;

    public WifiConn() {
        pict = "WiFi";
    }
    @Override
    public String sendData(String data, Integer crc) {
        return "[Wifi Connection]\nData: " + data + "\nCrc: " + crc;
    }

    @Override
    public String pict() {
        return pict;
    }
}
