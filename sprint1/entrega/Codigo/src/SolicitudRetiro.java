
public class SolicitudRetiro {
	
	private int fHorariaInicio, fHorariaFinal ; 
	private Ciudadano ciudadano ; 
	private int opcionRetiro ;
	
	
	public SolicitudRetiro(int fHorariaInicio, int fHorariaFinal, Ciudadano c, int opcionRetiro) {
		this.fHorariaInicio = fHorariaInicio;
		this.fHorariaFinal = fHorariaFinal;
		this.ciudadano = c;
		this.opcionRetiro = opcionRetiro;
	} 
	
	public int getFHorariaInicio(){
		return this.fHorariaInicio;
	}
	
	public int getFHorariaFinal(){
		return this.fHorariaFinal;
	}
	
	public int getOpcionRetiro(){
		return this.OpcionRetiro;
	}
	
	public void setFHorariaInicio(int fHorarioInicio){
		this.fHorariaInicio = fHorariaInicio;
	}
	
	public void setFHorariaFinal(int fHorarioFinal){
		this.fHorariaFinal = fHorariaFinal;
	}
	
	public void setOpcionRetiro(int opcionRetiro){
		this.opcionRetiro = opcionRetiro;
	}
	
	public int getCiudadano(){
		return new Ciudadano(c.getNombre().c.getApellido(),c.getTelofono(),c.getDireccion_x(),c.getDireccion_y(),c.getCapacidad_Transporte());
	}
	
	
}
