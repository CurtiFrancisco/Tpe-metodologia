package Cooperativa;
import java.util.ArrayList;
import java.util.HashMap;

public class Cooperativa {

	private ArrayList<SolicitudRetiro> solicitudes;
	private CarteleraVirtual cartelera;
	private HashMap<String, Cartonero> cartoneros ;
	private HashMap<Material,Float> materiales ;
	private Cartonero ciudadanoBuenaOnda ; 
	
	private String Secretaria, password; // Referente a usuario y contraseÃ±a de secretaria
	private float x, y;
	
	
	public Cooperativa() {
		solicitudes = new ArrayList<SolicitudRetiro>() ; 
		cartelera = new CarteleraVirtual() ; 
		cartoneros = new HashMap<String, Cartonero>() ; 
		materiales = new HashMap<Material, Float>() ;
		ciudadanoBuenaOnda = new Cartonero("Ciudadano","BuenaOnda"," ","0",0 ) ; //Creamos el cartonero Default 
	}

	public void menu(int i) {
		switch (i) {  //Por ahora los dejamos todos en null. Nos gustaría que funcione con paginas prehechas para cargar datos. 
		case 1:  this.AgregarCartonero(null, null, null, null, 0);
		case 2:  this.EliminarCartonero(null);
		case 3:  this.AgregarMaterial(new Material(null, null), null);
		case 4:  this.BorrarMaterial(null);
		break ; 
		}
		
	}
	
	
	//No pertenece a un menu, pues lo hace el ciudadano, a menos que creemos el rol ciudadano
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
	
	//Funcion de la secretaria, por ahora es la unica. Funcion 1. 
	public void AgregarCartonero(String nombre, String apellido, String direccion, 
			String dni, int capacidadTransporte) {
		cartoneros.put(dni, new Cartonero(nombre,apellido,direccion,dni,capacidadTransporte)) ; 
	}
	
	//Funcion de la secretaria, por ahora es la 2. 
	public void EliminarCartonero( String dni) {
		cartoneros.remove(dni);
	}
	
	//Funcion 3  
	public void AgregarMaterial(Material m, Float cantidad) {
		if (materiales.containsKey(m)) {
			materiales.put(m, materiales.get(m)+ cantidad) ; 
		}else
			materiales.put(m, cantidad) ; 
	}
	//funcion 4 del menu
	public void BorrarMaterial(Material m) {
		materiales.remove(m) ; 
	}
	
	//Retorna el porcentaje total del material, sirve para calcular otros porcentajes 
	public float PorcentajeMaterial(Material m) {
		if (materiales.containsKey(m)) {
			return materiales.get(m) ; 
		}
		return 1 ; //Este valor no va a causar error en los otros.  
	}
	
	//Retorna puntualmente el porcentaje del cartonero Default, lo usamos para calcular retribuciones.
	public float retribucionBuenaOnda(Material m) {
		return ciudadanoBuenaOnda.Porcentaje(m, this) / cartoneros.size() ; 
	}
}
