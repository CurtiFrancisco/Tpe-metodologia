import java.util.ArrayList;
import java.util.HashMap;

public class Cooperativa {

	// ArrayList<>

	private ArrayList<SolicitudRetiro> solicitudes;
	private CarteleraVirtual cartelera;
	private HashMap<String, Cartonero> cartoneros ; 
	private String Secretaria, password; // Referente a usuario y contraseña de secretaria
	private float x, y;

	public void agregarSolicitud(SolicitudRetiro r) {
		solicitudes.add(r);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}
	
	public void AgregarCartonero(String nombre, String apellido, String direccion, 
			String dni, int capacidadTransporte) {
		cartoneros.put(dni, new Cartonero(nombre,apellido,direccion,dni,capacidadTransporte)) ; 
	}
	
	public void EliminarCartonero( String dni) {
		cartoneros.remove(dni);
	}
	
}
