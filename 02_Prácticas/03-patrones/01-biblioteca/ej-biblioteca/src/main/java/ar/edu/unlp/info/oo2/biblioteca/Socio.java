package ar.edu.unlp.info.oo2.biblioteca;
import org.json.simple.JSONObject;

public class Socio {
	private String nombre;
	private String legajo;
	private String email;


	public Socio(String nombre, String email, String legajo) {
		this.nombre = nombre;
		this.email = email;
		this.legajo = legajo;
	}

	public JSONObject toJSON() {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("nombre", nombre);
		jsonObject.put("email", email);
		jsonObject.put("legajo", legajo);
		return jsonObject;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
}
