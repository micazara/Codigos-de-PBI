package ar.edu.unlam.pb1.sube.interfaz;
import ar.edu.unlam.pb1.sube.dominio.Encargado;
import ar.edu.unlam.pb1.sube.dominio.Tarjeta;
import java.util.Scanner;

public class LectorDeSube {
	/*
	 * INGRESO DE DATOS -INGRESAR ID (*USUARIO O *CHOFER) USUARIO: -MENU >COBRO
	 * >VER SALDO E ID
	 *
	 * CHOFER: -MENU >"BIENVENIDA" MOSTRAR DATOS CHOFER >VER TOTAL DE
	 * RECAUDACION >REINICIAR CARGAR ("SUBIDA DE DATOS")
	 */

	// constantes del switch
	static Scanner teclado = new Scanner(System.in);
	// -------------------MENU USUARIOS---------------------
	private static final int PASAJERO = 1;
	private static final int ENCARGADO = 2;
	private static final int CERRAR_CONSOLA = 9;
	// -------------------CONSTANTE DEL RECORRIDO-----------
	private static final int TRAMO_MENOR_TRES_KMS = 1;
	private static final int TRAMO_ENTRE_TRES_Y_SEIS_KMS = 2;
	private static final int TRAMO_ENTRE_SEIS_Y_DOCE_KMS = 3;
	private static final int TRAMO_ENTRE_DOCE_Y_VEINTISIETE_KMS = 4;
	private static final int TRAMO_SUP_VEINTISIETE_KMS = 5;
	private static final int SALIR_DEL_MENU = 9;
	// ------------------MENU CARGAR SUBE------------------
	private static final int SI = 1;
	private static final int NO = 2;
	private static final int SALIR = 9;
	// ---------------------ATRIBUTOS----------------------
	private static double boleto = 0;
	private static String idIngresado;

	// --------------------VECTOR MOVIMIENTOS----------------
	static LectorDeSube [] movimientos = new LectorDeSube[100]; // ARRAY 

	public static void main(String[] args) {
		boolean validacionPasajero = false; //CAMBIO
		boolean validacionEncargado = false;
		int opcion = 0;
		Tarjeta sube = new Tarjeta(100d, "12345");
		Encargado encargado = new Encargado("1234M", "Mario");

	//NO FUNCIONO :(
		// we created a card- hardcodeada
		// MENU PRINCIPAL
		// mostrarMensaje("Ingresar Id");
		// do {
		// idIngresado = teclado.next();
		// boolean isNumeric = true;
		// for (int i = 0; i < idIngresado.length(); i++) {
		// if (!Character.isDigit(idIngresado.charAt(i))) {
		// isNumeric = false;
		// }
		// }
		// sePudoValidar = validarID(sube, chofer, isNumeric);
		// } while (sePudoValidar == true);

		// SWITCH INGRESO
		
		mostrarMensaje("< BIENVENIDO >");
		do {
			mostrarMensaje("\nIngrese una opcion. " 
						+ "\n1) Pasajero" 
						+ "\n2) Encargado" 
						+ "\n9) Cerrar");
			opcion = teclado.nextInt();
			switch (opcion) {
				case PASAJERO: //MUESTRA EL MENU DEL PASAJERO
					do { //CAMBIO
						validacionPasajero = validarIdPasajero(sube);
					}while(validacionPasajero == false);
						menuPasajero(sube); //COBRA Y LUEGO (SI SE ELIGE LA OPCION) VUELVE A ESTE MENU
					break;
				case ENCARGADO: //MUESTRA EL MENU DEL ENCARGADO
					do {
						validacionEncargado = validarIdEncargado(encargado);
					}while(validacionEncargado == false);
						menuEncargadoDeLinea();
					break;
				case CERRAR_CONSOLA:
						mostrarMensaje("chauuu");
					break;
				default:
					mostrarMensaje("Opcion incorrecta, intente nuevamente");
					break;
				}
			} while (opcion != 9);
		
		}

//------------------------METODOS--------------------------------
	private static boolean validarIdPasajero(Tarjeta sube) { //VERIFICA LA ID DEL PASAJERO
		mostrarMensaje("Ingresar Id");
		idIngresado = teclado.next();
		if (idIngresado.equals(sube.getId())) {
			mostrarMensaje("Ha ingresado como PASAJERO");
			return true;
		} else {
			mostrarMensaje("Id incorrecto");
		}
		return false;
	}

	private static boolean validarIdEncargado(Encargado encargadoDeLinea) { //VERIFICA LA ID DEL ENCARGADO
		mostrarMensaje("Ingresar Id");
		idIngresado = teclado.next();
		if (idIngresado.equals(encargadoDeLinea.getId())) {
			mostrarMensaje("Ha ingresado como ENCARGADO");
			return true;
		} else {
			mostrarMensaje("Id incorrecto");
		}
		return false;
	}
	
//	NO FUNCIONO :( 
	/* private static boolean validarID(Tarjeta sube, Conductor chofer, boolean
	 isNumeric) {
	 String id = sube.getId();
	 if (isNumeric != false && idIngresado.equals(id)) {
	 mostrarMensaje("Ha ingresado como �Pasajero�");
	 }
	 menuUsuario(sube); // SWITCH OPTIONS- YOU'RE THE DRIVER OF THE BUS
	
	 if (isNumeric == false && idIngresado.equals(chofer.getId())) {
	 mostrarMensaje("Ha ingresado como �Chofer� " + "\nBienvendo " +
	 chofer.getNombre());
	 menuChofer();
	 } else {
	 mostrarMensaje("Id invalido, intente nuevamente");
	 }
	 return true;
	}*/

//-----------------------MENU PASAJEROS---------------------------
	private static void menuPasajero(Tarjeta sube) { //MUESTRA EL MENU Y LOS DATOS DE TARJETA
		int kms;
		do {
			mostrarEstadoDeSube(sube);
			mostrarMenuDeTramos();
			kms = teclado.nextInt();
			cobroPorTramo(sube,kms); //IDENTIFICA EL INGRESO DE OPCION PARA CADA TRAMO Y COBRA EL BOLETO CORRESPONDIENTE
		}while(kms != 9); //ERROR
		mostrarMensaje("Gracias por usar nuestro sistema :)"); //LA OPCION 9 EL MENU DE PASAJERO Y VUELVE AL MENU PRINCIPAL	
	}
		
	public static void mostrarMenuDeTramos() {
		mostrarMensaje("\nBuen dia! Hasta donde desea viajar?");
		mostrarMensaje("-Presione 1 si viaja menos de 3km" 
					+ "\n-Presione 2 si viaja entre 3km y 6km"
					+ "\n-Presione 3 si viaja entre 6km y 12km" 
					+ "\n-Presione 4 si viaja menos entre 12km y 27km"
					+ "\n-Presione 5 si viaja  (+27km)" 
					+ "\n-Presione 9 para volver");
		}
	
//------------------------COBRO DEL PASAJE------------------------
	public static void cobroPorTramo(Tarjeta sube, int kms) { //EJECUTA EL COBRO POR TRAMO
			switch (kms) {
				case TRAMO_MENOR_TRES_KMS: 
					mostrarMensaje("\nApoye su Tarjeta");
					boleto = 25.40;
					opcionBeneficios(sube);
					break;
				case TRAMO_ENTRE_TRES_Y_SEIS_KMS:
					mostrarMensaje("\nApoye su Tarjeta");
					boleto = 28;
					opcionBeneficios(sube);
					break;
				case TRAMO_ENTRE_SEIS_Y_DOCE_KMS: 
					mostrarMensaje("\nApoye su Tarjeta");
					boleto = 29.40;
					opcionBeneficios(sube);
					break;
				case TRAMO_ENTRE_DOCE_Y_VEINTISIETE_KMS: 
					mostrarMensaje("\nApoye su Tarjeta");
					boleto = 30.80;
					opcionBeneficios(sube);
					break;
				case TRAMO_SUP_VEINTISIETE_KMS: 
					mostrarMensaje("\nApoye su Tarjeta");
					boleto = 100.00;
					opcionBeneficios(sube);
					break;
				case SALIR_DEL_MENU: // 9
					mostrarMensaje("Saliendo...");
					break;
				default:
					mostrarMensaje("Opcion invalida, intente nuevamente.");
					break;
			}

		}

	private static void opcionBeneficios(Tarjeta sube) {
		mostrarMensaje("\nEl boleto vale: " + boleto + mostrarEstadoDeSube(sube));
		cobrarViaje(boleto, sube); //IDENTIFICA SI TENES BENEFICIOS Y RESTA EL PORCENTAJE CORRESPONDIENTE
		mostrarMensaje(mostrarEstadoDeSaldoActual(sube)); //MUESTRA LOS DATOS ACTUALIZADOS
}		
	
	private static void cobrarViaje(double boleto, Tarjeta sube) {
		String respuesta = "";
		mostrarMensaje("\nTenes tarifa social o boleto estudiantil?" 
					+ "\nPresione 'T' para tarifa "
					+ "\nPresione 'B' para boleto estudiantil" 
					+ "\nPresione 'S' si no posee ningun beneficio");
		respuesta = teclado.next().toUpperCase();
			switch (respuesta) {
				case "T":
					sube.setTarifaSocial(true);
					sube.setBoletoEstudiantil(false);
					break;
				case "B":
					sube.setTarifaSocial(false);
					sube.setBoletoEstudiantil(true);
					break;
				case "S": 
					sube.setTarifaSocial(false);
					sube.setBoletoEstudiantil(false);
					break;
				default: //S
					mostrarMensaje("Opcion incorrecta");
					break;
			}
		
			boolean sePudoCobrar;
		if (sube.isTarifaSocial())
			boleto -= boleto * 0.55;
		if (sube.isBoletoEstudiantil())
			boleto -= boleto * 0.20;
		sePudoCobrar = sube.cobrarBoleto(boleto);
		if (sePudoCobrar) {
			mostrarMensaje("\nPago realizado con exito! " + "\nBUEN VIAJE!");
		} else {
			mostrarMensaje("-SALDO INSUFICIENTE- :(");
			cargarSube(sube);
		}
	}
	
//------------------------------CARGA DE SALDO------------------------------
	private static void cargarSube(Tarjeta sube) {
		boolean sePudoCobrar;
		boolean sePudoCargar;
		double newSaldo;
		int opcion;
			do {
				mostrarMensaje("\nDesea cargar saldo?-" + "\n1)Si " + "\n2)No" + "\n9)Salir"); //revisar
				opcion = teclado.nextInt();
				switch (opcion) {
					case SI:
						mostrarMensaje("Indique el monto deseado");
						newSaldo = teclado.nextDouble();
						sePudoCargar = sube.cargarSaldo(newSaldo);
						if (sePudoCargar) {
							sePudoCobrar = sube.cobrarBoleto(boleto);
							mostrarMensaje("Nuevo saldo: $" + sube.getSaldo());
						}
						break;
					case NO:
						mostrarMensaje("Por favor,pidale a alguien que le pague o bajese del colectivo :)");
						break;
					case SALIR:
						mostrarMensaje("Saliendo...");
						break;
					default:
						mostrarMensaje("Opcion invalida, intente nuevamente");
						break;
				}
			} while (opcion != 9);
		}

//---------------------------MENU ENCARGADO---------------------------
	private static void menuEncargadoDeLinea() {
		int opcion = 0;
		int kms = 0;
		double nuevoValor;
		mostrarMensaje("Seleccione una opcion" 
					+ "\n1) Ver movimientos." 
					+ "\n2) Carga de datos." 
					+ "\n9) Volver");
		opcion = teclado.nextInt();
		do {
			switch (opcion) {
		// VER MOVIMIENTOS (MAX 25) MONTO/TRAMO
			case 1:
				mostrarMensaje("Ultimos movimientos");
				for (int i = 0; i < movimientos.length; i++) {
					System.out.println(movimientos[i]);
				}
				break;
		// VACIAR EL ARRAY (CARGA DE DATOS) --ARRAYLIST.REMOVE
			case 2: // carga de datos: cambiar moonto de boleto
				
				break;
			case 9: // volver
				mostrarMensaje("Gracias por usar nuestro sistema :)"); // CAMBIO
				break;
			}
		} while (opcion != 9);
	}

//------------------------METODOS GENERALES------------------------
	private static void mostrarMensaje(String mensajito) {
		System.out.println(mensajito);
	}

	private static String mostrarEstadoDeSube(Tarjeta sube) {
		return sube.toString();
	}

	private static String mostrarEstadoDeSaldoActual(Tarjeta sube) {
		String saldoActual = "Saldo Actual: " + sube.getSaldo();
		return saldoActual;
	}

	public String toString() {
		return "Tramo  \nPrecio boleto" + boleto;
	}
}

