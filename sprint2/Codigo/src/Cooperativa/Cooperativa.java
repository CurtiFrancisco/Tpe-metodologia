package Cooperativa;
import java.util.ArrayList;
import java.util.HashMap;

public class Cooperativa {

	

	private ArrayList<SolicitudRetiro> solicitudes;
	private CarteleraVirtual cartelera;
	private HashMap<String, Cartonero> cartoneros ;
	private HashMap<Material,Float> materiales ;
	private String Secretaria, password; // Referente a usuario y contraseña de secretaria
	private float x, y;
	
	public Cooperativa() {
		solicitudes = new ArrayList<SolicitudRetiro>() ; 
		cartelera = new CarteleraVirtual() ; 
		cartoneros = new HashMap<String, Cartonero>() ; 
		materiales = new HashMap<Material, Float>() ; 
	}

	public void menu(int i) {
		switch (i) {
		case 1: 
		case 2:
		case 3: 
		}
		
	}
	
	
	
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
	
	//TENEMOS QUE REPENZAR ESTO PORQUE COMO HACEMOS PARA TENER LOS PORCENTAJES DE LOS CARTONEROS.
	// Opcion: El cartonero Default se distribuye entre todos los demas. (La mejor que encontramos)  
	public void AgregarMaterial(Material m, Float cantidad) {
		if (materiales.containsKey(m)) {
			materiales.put(m, materiales.get(m)+ cantidad) ; 
		}else
			materiales.put(m, cantidad) ; 
	}
	
	public void BorrarMaterial(Material m) {
		materiales.remove(m) ; 
	}

	
}
