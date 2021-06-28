package Cooperativa;
import java.util.ArrayList;
import java.util.HashMap;

public class Cooperativa {

	private ArrayList<SolicitudRetiro> solicitudes;
	private CarteleraVirtual cartelera;
	private HashMap<String, Cartonero> cartoneros ;
	private HashMap<Material,Float> materiales ;
	private CiudadanoBuenaOnda ciudadanoBuenaOnda ; 
	
	
	private String Secretaria, password; // Referente a usuario y contraseÃ±a de secretaria
	private float x, y;
	
	
	public Cooperativa() {
		solicitudes = new ArrayList<SolicitudRetiro>() ; 
		cartelera = new CarteleraVirtual() ; 
		cartoneros = new HashMap<String, Cartonero>() ; 
		materiales = new HashMap<Material, Float>() ;
		ciudadanoBuenaOnda = new CiudadanoBuenaOnda() ; //Creamos el cartonero Default 
	}

	public void menu(int i) {
<<<<<<< HEAD:sprint2/Entrega/Codigo/src/Cooperativa/Cooperativa.java
		switch (i) {  //Por ahora los dejamos todos en null. Nos gustar�a que funcione con paginas prehechas para cargar datos. 
		case 1:  InterfazVisual.agregarCartonero(this);
		case 2:  InterfazVisual.eliminarCartonero(this);
		case 3:  InterfazVisual.agregarMaterial(this);
		case 4:  InterfazVisual.borrarMaterial(this);
=======
		switch (i) {  //Por ahora los dejamos todos en null. Nos gustaría que funcione con paginas prehechas para cargar datos. 
		case 1:  this.agregarCartonero(null, null, null, null, 0);
		case 2:  this.eliminarCartonero(null);
		case 3:  this.agregarMaterial(new Material(null, null), null);
		case 4:  this.borrarMaterial(null);
>>>>>>> c1b46cc65b1f6ac0056d5d6c8ac43590d825a3f5:sprint2/Codigo/src/Cooperativa/Cooperativa.java
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
	public void agregarCartonero(String nombre, String apellido, String direccion, 
			String dni, int capacidadTransporte) {
		cartoneros.put(dni, new Cartonero(nombre,apellido,direccion,dni,capacidadTransporte)) ; 
	}
	
	//Funcion de la secretaria, por ahora es la 2. 
<<<<<<< HEAD:sprint2/Entrega/Codigo/src/Cooperativa/Cooperativa.java
	public void eliminarCartonero(String dni) {
=======
	public void eliminarCartonero( String dni) {
>>>>>>> c1b46cc65b1f6ac0056d5d6c8ac43590d825a3f5:sprint2/Codigo/src/Cooperativa/Cooperativa.java
		cartoneros.remove(dni);
	}
	
	//Funcion 3  
<<<<<<< HEAD:sprint2/Entrega/Codigo/src/Cooperativa/Cooperativa.java
	public void agregarMaterial(Material m, float cantidad) {
=======
	public void agregarMaterial(Material m, Float cantidad) {
>>>>>>> c1b46cc65b1f6ac0056d5d6c8ac43590d825a3f5:sprint2/Codigo/src/Cooperativa/Cooperativa.java
		if (materiales.containsKey(m)) {
			materiales.put(m, materiales.get(m)+ cantidad) ; 
		}else
			materiales.put(m, cantidad) ; 
	}
	//funcion 4 del menu
	public void borrarMaterial(Material m) {
		materiales.remove(m) ; 
	}
	
	//Retorna el porcentaje total del material, sirve para calcular otros porcentajes 
	public float porcentajeMaterial(Material m) {
		if (materiales.containsKey(m)) {
			return materiales.get(m) ; 
		}
		return 1 ; //Este valor no va a causar error en los otros.  
	}
	
	//Retorna puntualmente el porcentaje del cartonero Default, lo usamos para calcular retribuciones.
	public float retribucionBuenaOnda(Material m) {
		return ciudadanoBuenaOnda.porcentaje(m, this) / cartoneros.size() ; 
	}
}
