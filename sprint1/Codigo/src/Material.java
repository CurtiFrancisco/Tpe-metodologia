
public class Material {
	
	private String nombre ; 
	private float peso ;
	
		public Material(String nombre, float peso) {
		super();
		this.nombre = nombre;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public boolean equals(Object obj) {
		try {
			
			Material o1 = (Material) obj ; 
			return o1.getNombre().equals(nombre) ; 
			
		}
		catch (Exception e) {
			return false ; 
		}
	} 
	
	
}
