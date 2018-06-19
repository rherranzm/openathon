package deors.demos.microservices.velocitytestservice;

import java.util.HashMap;
import java.util.Map;

public class VelocityTestRequest {
	private final String template;
	private Map<String, Object> datos;
	public Map<String, Object> getDatos() {
		return datos;
	}
	public void setDatos(Map<String, Object> datos) {
		this.datos = datos;
	}
	public String getTemplate() {
		return template;
	}
	public VelocityTestRequest(String template, Map<String, Object> datos) {
		super();
		this.template = template;
		this.datos = datos;
	}
	public VelocityTestRequest() {
		super();
		this.template = null;
		this.datos = new HashMap<String, Object>();
	}

}
