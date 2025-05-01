package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonSimpleExporter implements ExporterBehaviour {

    private JSONObject jsonObjectSocio(Socio socio) {
        JSONObject socioJson = new JSONObject();
        socioJson.put("nombre", socio.getNombre());
        socioJson.put("email", socio.getEmail());
        socioJson.put("legajo", socio.getLegajo());
        return socioJson;
    }

    public String exportar(List<Socio> socios) {
        if (socios.isEmpty()) {
            return "[]";
        }
        JSONArray jsonSocios = new JSONArray();
        for (Socio socio : socios) {
            jsonSocios.add(this.jsonObjectSocio(socio));
        }
        return jsonSocios.toJSONString();
    }
}
