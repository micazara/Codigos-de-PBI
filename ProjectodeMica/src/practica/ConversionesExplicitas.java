package practica;

public class ConversionesExplicitas {

	public static void main(String[] args) {
		
		char c;
		byte k;
		int p=400;
		double d=34.6;
		System.out.println(c=(char)d); // De char a double. Se elimina la parte decimal (truncado)
		System.out.println(k=(byte)p); // De byte a int. se produce una pérdida de datos, pero la conversión es posible; 

		
		
	}

}
