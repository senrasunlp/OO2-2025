package ar.edu.unlp.oo2.ocho;

public class Connection4G {

    private final String symb;

    public Connection4G() {
        symb = "4G";
    }
    public String transmit(String data, Integer crc) {
        return "[4G Connection]\nData: " + data + "\nCrc: " + crc;
    }

    public String symb() {
        return symb;
    }
}
