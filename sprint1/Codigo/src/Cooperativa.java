import java.util.ArrayList;

public class Cooperativa {
	
	//ArrayList<>
	
	private ArrayList<SolicitudRetiro> solicitudes; 
	private CarteleraVirtual cartelera ; 
	
	
	String Secretaria, password ; //Referente a usuario y contrase�a de secretaria
	
	public void agregarSolicitud(SolicitudRetiro r) {
		solicitudes.add(r) ; 
	}
	
}
