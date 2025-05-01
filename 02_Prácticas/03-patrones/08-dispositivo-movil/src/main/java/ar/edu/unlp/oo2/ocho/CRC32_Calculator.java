package ar.edu.unlp.oo2.ocho;

import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Algorithm {

    @Override
    public Integer crcFor(String datos) {
        CRC32 crc = new CRC32();
        crc.update(datos.getBytes());
        long result = crc.getValue();
        return Math.toIntExact(result);
    }
}
