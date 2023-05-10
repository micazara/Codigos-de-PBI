package ar.edu.unlam.pb1.tp4.dominio;

public class Letra {

	private char letra;
	private boolean vocal;

	public Letra() {

		
	}

	public boolean esVocal(char letraIngresada) {

		switch (letraIngresada) {
		case 'a':
			this.vocal = true;
			break;
		case 'e':
			this.vocal = true;
			break;
		case 'i':
			this.vocal = true;
			break;
		case 'o':
			this.vocal = true;
			break;
		case 'u':
			this.vocal = true;
			break;
		default:
			this.vocal = false;
		}

		return this.vocal;
	}

}
