package deors.demos.microservices.velocitytestservice;

public class VelocityTestResponse {
	private String status;
	private String datos;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDatos() {
		return datos;
	}
	public void setDatos(String datos) {
		this.datos = datos;
	}
	public VelocityTestResponse(String status, String datos) {
		super();
		this.status = status;
		this.datos = datos;
	}
	public VelocityTestResponse() {
		super();
		this.status = "EMPTY";
		this.datos = "";
	}
}
