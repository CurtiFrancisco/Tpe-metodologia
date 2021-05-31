
public class Ciudadano {

	private String nombre, apellido, telefono, direccion ; 
	private int capacidad_transporte ;
	private float distancia;
	
	private static final int LIMITETRANSPORTE = 3 ; 
	private static final float LIMITEDISTANCIA = 6 ; 
	
	
	public Ciudadano(String nombre, String apellido, String telefono, String direccion, int capacidad_transporte) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.capacidad_transporte = capacidad_transporte;
		this.distancia = calcularDistancia(this.direccion) ; 
	}
	
	//Devuelve la distancia entre la cooperativa y la direccion 
	private float calcularDistancia(String direccion) {
		return 0;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getCapacidad_transporte() {
		return capacidad_transporte;
	}
	public void setCapacidad_transporte(int capacidad_transporte) {
		if (capacidad_transporte >= 0 && capacidad_transporte <= LIMITETRANSPORTE)
		this.capacidad_transporte = capacidad_transporte;
		
	} 
	
	public boolean distanciaRequerida() {
		return (distancia < LIMITEDISTANCIA) ;
	}
	
	
	//Se crea una clase solicitud de retiro que contiene los datos y se agrega a la lista
	//Solamente en los casos donde la distancia se cumple
	public boolean solicitarRetiro(Cooperativa c, int franjaInicio, int franjaFin) {
		
		if (this.distanciaRequerida()) {
			SolicitudRetiro r = new SolicitudRetiro(franjaInicio, franjaFin, this, this.getCapacidad_transporte());
			c.agregarSolicitud(r);
			return true ; 
		}
		
		return false ; 
	}
	
	
	
	
}
