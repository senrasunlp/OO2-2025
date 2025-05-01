package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.util.List;

public class JacksonExporter implements ExporterBehaviour {

  public String exportar(List<Socio> socios) {
    ObjectMapper mapper = new ObjectMapper();
    mapper.enable(SerializationFeature.INDENT_OUTPUT);
    try {
        return mapper.writeValueAsString(socios);
    } catch (JsonProcessingException e) {
        e.printStackTrace();
    }
    return "[]";
  }
}
