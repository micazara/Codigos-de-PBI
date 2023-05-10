package ar.edu.unlam.pb1.crush.dominio;

public class Calculadora {

	public int calcularCompatibilidad() {
		int compatibilidad = (int)(Math.round(Math.random()*100));
		return compatibilidad;
		
	}
	
	public String mostrarGradoCompatibilidad(int compatibilidad) {
		String mensaje = " ";
		if (compatibilidad<30) {
			mensaje = "compatibilidad baja :( ... ";
			
		} if(compatibilidad>=30 && compatibilidad<60) {
			mensaje = "compatibilidad media";
			
		} if (compatibilidad>=60 && compatibilidad<=100) {
			mensaje = "compatibilidad alta!! felicidades :D";
		}
	return mensaje;
	}

}
