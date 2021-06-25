import java.util.HashMap;

public class Cartonero {

	private HashMap<Material,Float> materiales ;
	private String nombre, apellido, direccion, dni ; 
	private int capacidadTransporte;
	
	public Cartonero(String nombre, String apellido, String direccion, String dni, int capacidadTransporte) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.dni = dni;
		this.capacidadTransporte = capacidadTransporte;
		materiales = new HashMap<Material,Float>() ; 
	}

	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCapacidadTransporte() {
		return capacidadTransporte;
	}

	public void setCapacidadTransporte(int capacidadTransporte) {
		this.capacidadTransporte = capacidadTransporte;
	} 
}
