import java.util.ArrayList;

public class CarteleraVirtual {

	private String info;
	private ArrayList<Material> materialesAceptados ; 
	//private ArrayList<Post> postulaciones ; 
	
	
	public CarteleraVirtual() {
		//postulaciones = new ArrayList<>() ; 
		materialesAceptados = new ArrayList<Material>() ; 
	}


	public String getInfo() {
		String aux = " " ; 
		
		for (Material e : materialesAceptados)
			aux = aux + e.getNombre() + " \n " ; //chequear que \n separe la linea
		
		return info + " || Materiales aceptados : " + aux ;
		
	}

	public void ModificarInformacion(String info) {
		this.info = info;
	}

	public void AppendInformacion(String info) {
		this.info = this.info + " " + info ; 
	}

	//Materiales aceptados
	
	public void setMaterialesAceptados(ArrayList<Material> materialesAceptados) {
		this.materialesAceptados = materialesAceptados;
	}
	
	public void addMaterialAceptado(ArrayList<Material> materialesAceptados) {
		for (Material e : materialesAceptados) {
			if (!this.materialesAceptados.contains(e))
				this.materialesAceptados.add(e) ;
		}
	}
	
	public void rmvMaterialAceptado(Material m) {
		this.materialesAceptados.remove(m) ; 
	}
	
	
}
