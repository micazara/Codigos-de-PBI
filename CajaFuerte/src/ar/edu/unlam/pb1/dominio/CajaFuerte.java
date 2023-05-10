package ar.edu.unlam.pb1.dominio;

public class CajaFuerte {
	
	private String contrasenia;
	private boolean laCajaEstaAbierta = false;
	
	public CajaFuerte() {
		
	}

	public boolean crearContrasenia(String contrasenia) {
		
		if (contrasenia.length()==4) {
			return true;
		} else {
			return false;
		}
	
	}
	
	public String mostrarContraseniaCreada(String contrasenia) {
		return contrasenia;
	}

	public boolean abrirCajaFuerte() {
		
		return laCajaEstaAbierta=true;
		
	}
	
	public boolean cerrarCajaFuerte() {
		return laCajaEstaAbierta=false;
	}

//	public boolean laContraseniaSeCreo() {
//		
//	}
		

}
