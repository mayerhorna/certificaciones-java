package objectives.flow_control.exceptions;

public class SecurityException extends RuntimeException{
	private String mensaje;
	public SecurityException(String code) {
			this.mensaje = "mensaje: " + code;
	}
	
	public String getMessage() {
		return this.mensaje;
	}
}
