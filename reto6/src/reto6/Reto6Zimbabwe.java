package reto6;
import java.time.LocalTime;
import java.util.Scanner;
/**
 * Esta clase implementa un programa que ofrece una variedad de funcionalidades relacionadas con Zimbabwe.
 * Las opciones incluyen información general, cambio de moneda, test cultural, reserva de vuelos,
 * ciudades importantes, media de alturas, un juego de palabras (Wordle) y una sopa de letras.
 */
public class Reto6Zimbabwe {
	/**
	 *  Metodo principal que controla todo el programa.
	 * Permite al usuario seleccionar diversas opciones para interactuar con el programa.
	 * Las opciones incluyen información general, cambio de moneda, test cultural, reservar vuelo,
	 * ciudades importantes, media de alturas, Wordle, fauna de Zimbabwe, sopa de letras y cambio de hora.
	 * El programa se ejecuta hasta que el usuario decida cerrarlo
	 * @param args Argumentos pasados por consola
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int eleccion=1;
		boolean error;
		do {
			// Mostrar el menú de opciones
			System.out.println();
			System.out.println("Bienvenid@ a Zimbabwe!");
			System.out.println("Inserte el número de lo que quiera ver.");
			System.out.println("(1) Información general");
			System.out.println("(2) Cambio de moneda");
			System.out.println("(3) Test cultural");
			System.out.println("(4) Reservar vuelo");
			System.out.println("(5) Ciudades más importantes");
			System.out.println("(6) Media de alturas en Zimbabwe");
			System.out.println("(7) Wordle");
			System.out.println("(8) Fauna de Zimbabwe");
			System.out.println("(9) Sopa de letras");
			System.out.println("(10) Cambio de hora");
			System.out.println("(0) Cerrar el programa");

			do {
				// Solicitar y validar la selección del usuario
				try {
					error=false;
					eleccion = sc.nextInt();
				} catch (Exception e) {
					error=true;
					System.out.println("Introduzca un valor válido!");
					sc.nextLine();
				}
				
				if (eleccion < 0 || eleccion > 10) {
					System.out.println("Inserte un número válido");
				}
			} while (eleccion < 0 || eleccion > 10 || error==true);

			// Realizar la acción correspondiente según la selección del usuario
			switch (eleccion) {
			case 1:
				informacionGeneral();
				break;
			case 2:
				cambioMoneda(sc);
				break;
			case 3:
				testCultural(sc);
				break;
			case 4:
				reservarVuelo(sc);
				break;
			case 5:
				ciudadesImportantes();
				break;
			case 6:
				mediaAlturas();
				break;
			case 7:
				wordle(sc);
				break;
			case 8:
				fauna(sc);
				break;
			case 9:
				sopaDeLetras(sc);
				break;
			case 10:
				convertirHora();
				break;
			}

		} while (eleccion != 0);
		sc.close();
		System.out.println("Fin del programa");
	}

	
	/**
	 * Metodo para explorar la fauna de Zimbabwe.
	 * Permite al usuario seleccionar un animal para obtener informacion sobre el.
	 * El usuario puede seleccionar entre león, elefante, rinoceronte, cocodrilo o salir del programa.
	 * La informacion se muestra por consola.
	 * @param sc Scanner para la lectura de teclado
	 */
	private static void fauna(Scanner sc) {
		int opcion =0;
		boolean error;
		do {
			System.out.println("¡Bienvenido al explorador de fauna de Zimbabwe!");
			System.out.println();
			System.out.println("Seleccione el animal que desea explorar:");
			System.out.println();
			System.out.println("1. León");
			System.out.println("2. Elefante");
			System.out.println("3. Rinoceronte");
			System.out.println("4. Cocodrilo");
			System.out.println("5. Salir");
		try {
			error=false;
			opcion=sc.nextInt();
		} catch (Exception e) {
			System.out.println("Inserte un numero válido!");
			error=true;
			sc.nextLine();
		}
		
		
		switch (opcion) {
		case 1:
			System.out.println("Información sobre el león:\n" +
					"En Zimbabwe, la población de leones ha disminuido a alrededor de 1.500 individuos, desde una estimación previa de cerca de 2.000. Esta disminución se debe a la caza furtiva, la pérdida de hábitat y los conflictos con humanos.\n" +
					"Aunque el país cuenta con parques nacionales y reservas naturales donde los leones están protegidos, como el Parque Nacional Hwange y el Parque Nacional Mana Pools, la gestión adecuada y la protección efectiva de estos espacios son fundamentales para la conservación a largo plazo de los leones.\n" +
					"Además de su importancia ecológica, los leones también tienen un valor cultural y turístico significativo en Zimbabwe, atrayendo a visitantes de todo el mundo y generando ingresos para las comunidades locales a través del turismo de vida silvestre.");
			break;
		case 2:
			System.out.println("Información sobre el elefante:\n" +
					"En Zimbabwe, la población de elefantes ha disminuido debido a la caza furtiva y la pérdida de hábitat, aunque se estima que aún hay alrededor de 20,000 individuos en el país.\n" +
					"Principalmente se encuentran en parques nacionales y reservas naturales, donde se implementan medidas de conservación para protegerlos.\n" +
					"Además de su importancia ecológica, los elefantes son una atracción turística importante que genera ingresos para la economía local.\n" +
					"Los esfuerzos de conservación se centran en combatir la caza furtiva y promover el turismo sostenible para garantizar la supervivencia a largo plazo de estos animales icónicos.");
			break;
		case 3:
			System.out.println("Información sobre el rinoceronte:\n" +
					"En Zimbabwe, la población de rinocerontes ha experimentado una disminución debido a la caza furtiva y la pérdida de hábitat.\n" +
					"Se estima que actualmente hay alrededor de 600 rinocerontes en el país, con una distribución principalmente en parques nacionales y reservas naturales.\n" +
					"Estos majestuosos animales son una parte importante del ecosistema y atraen a turistas de todo el mundo.\n" +
					"Sin embargo, enfrentan amenazas significativas, incluida la caza furtiva por sus cuernos, que son altamente valorados en algunos mercados.\n" +
					"Las autoridades y organizaciones de conservación están trabajando arduamente para proteger a los rinocerontes y garantizar su supervivencia a largo plazo en Zimbabwe.");
			break;
		case 4:
			System.out.println("Información sobre el cocodrilo:\n" +
					"En Zimbabwe, la población de cocodrilos ha enfrentado desafíos debido a la alteración del hábitat y la competencia con humanos.\n" +
					"Se estima que hay alrededor de 10,000 cocodrilos en el país, con una presencia notable en ríos y lagos.\n" +
					"Estos reptiles son cruciales para el equilibrio ecológico de los ecosistemas acuáticos en Zimbabwe.\n" +
					"Sin embargo, también pueden representar un riesgo para las comunidades locales que viven cerca de áreas acuáticas.\n" +
					"La coexistencia pacífica entre los cocodrilos y los humanos es fundamental para mantener el equilibrio natural y proteger la biodiversidad de Zimbabwe.");
			break;
		case 5:
			break;
		default:
			System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
		}
		// Bucle para permitir al usuario explorar múltiples animales hasta que decida salir.
		}while (opcion != 5|| error);

		System.out.println("Saliendo del programa. ¡Gracias por explorar la fauna de Zimbabwe!");      
	}



	/**
	 * Calcula la media de las alturas de las personas de Zimbabwe, divididas por genero (100 hombres y 100 mujeres).
	 * Utiliza un array bidimensional para almacenar las alturas de hombres y mujeres por separado.
	 * Luego, calcula la altura media para cada género y muestra los resultados por consola.
	 */
	private static void mediaAlturas() {
		int[][] alturas = {
				// Alturas de hombres
				{168, 182, 175, 180, 186, 193, 179, 181, 178, 194, 168, 175, 182, 165, 170, 178, 172, 180, 176, 169, 174, 185, 163, 177, 183, 167, 179, 171, 187, 164, 181, 173, 186, 160, 168, 176, 182, 170, 178, 175, 149, 165, 171, 179, 167, 173, 181, 163, 169, 177, 186, 161, 174, 172, 180, 198, 175, 183, 167, 169, 177, 181, 203, 172, 170, 178, 176, 182, 174, 179, 165, 171, 163, 169, 195, 173, 181, 167, 184, 170, 176, 168, 182, 174, 180, 172, 178, 220, 172, 174, 180, 176, 182, 168, 170, 175, 177, 179, 181},
				// Alturas de mujeres
				{158, 162, 160, 155, 177, 163, 159, 171, 156, 164, 158, 165, 172, 155, 160, 168, 162, 170, 166, 159, 164, 173, 153, 167, 175, 157, 169, 161, 177, 154, 171, 163, 180, 150, 158, 166, 172, 160, 168, 165, 174, 155, 161, 169, 157, 163, 171, 153, 159, 167, 176, 151, 164, 162, 170, 158, 165, 173, 157, 159, 167, 171, 156, 162, 160, 168, 166, 172, 164, 169, 155, 161, 153, 159, 165, 163, 171, 157, 174, 160, 166, 158, 172, 164, 170, 162, 168, 156, 162, 164, 170, 166, 172, 158, 160, 165, 167, 169, 171}
		};

		// Calcular la altura media de hombres y mujeres
		double alturaMediaHombres = calcularAlturaMedia(alturas[0]);
		double alturaMediaMujeres = calcularAlturaMedia(alturas[1]);

		// Redondear los resultados a dos decimales
		double numeroRedondeadoH = Math.round(alturaMediaHombres * 100.0) / 100.0;
		double numeroRedondeadoM = Math.round(alturaMediaMujeres * 100.0) / 100.0;

		// Mostrar los resultados por consola
		System.out.println("Se han elegido 200 personas aleatorias de Zimbabwe, 100 hombres y 100 mujeres, de esta forma sacaremos la altura media de cada sexo en el país: ");
		System.out.println();
		System.out.println("La altura media de los hombres en Zimbabwe es: " + numeroRedondeadoH + " cm");
		System.out.println("La altura media de las mujeres en Zimbabwe es: " + numeroRedondeadoM + " cm");
	}

	/**
	 * El calculo de la media de un array de alturas
	 * @param alturas El array unidimensional donde guardamos las alturas
	 * @return Devuelve la media de las alturas
	 */
	private static double calcularAlturaMedia(int[] alturas) {
		int totalAlturas = 0;
		// Sumar todas las alturas
		for (int i = 0; i < alturas.length; i++) {
			totalAlturas += alturas[i];
		}
		// Calcular y devolver la media de las alturas
		return (double) totalAlturas / alturas.length;
	}

	/**
	 * Muestra las ciudades importantes de Zimbabwe y su poblacion, primero sin ordenarlas y luego ordenadas alfabeticamente.
	 */
	private static void ciudadesImportantes() {
		String[][] ciudades = {
				{"Harare", "1.5 millones"},
				{"Bulawayo", "700 mil"},
				{"Chitungwiza", "400 mil"},
				{"Mutare", "250 mil"},
				{"Gweru", "150 mil"}
		};

		System.out.println("Ciudades de Zimbabwe (sin ordenar):");
		mostrarCiudades(ciudades);
		ordenarCiudades(ciudades);
		System.out.println("\nCiudades de Zimbabwe (ordenadas alfabéticamente):");
		mostrarCiudades(ciudades);
	}

	/**
	 * Escribe en consola las ciudades del array que recibe
	 * @param ciudades Array bidimensional con la informacion de las ciudades
	 */
	private static void mostrarCiudades(String[][] ciudades) {
		for (String[] ciudad : ciudades) {
			System.out.println("Ciudad: " + ciudad[0] + ", Población: " + ciudad[1]);
		}
	}

	/**
	 * Ordena las ciudades alfabeticamente por su nombre.
	 * @param ciudades Array bidimensional con la informacion de las ciudades
	 */
	private static void ordenarCiudades(String[][] ciudades) {
		int n = ciudades.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				if (ciudades[j][0].compareTo(ciudades[i][0]) < 0) {
					String[] temp = ciudades[i];
					ciudades[i] = ciudades[j];
					ciudades[j] = temp;
				}
			}
		}
	}


	/**
	 * Permite al usuario reservar vuelos dentro de Zimbabwe.
	 * Muestra los vuelos disponibles, permite al usuario seleccionar uno y proporcionar informacion del 
	 * pasajero para la reserva.
	 * @param sc Scanner para la lectura de teclado
	 */
	private static void reservarVuelo(Scanner scanner) {
		// Definir los vuelos disponibles
		int opcionVuelo = 1;
		boolean error;
		int edadPasajero = 0;
		String[][] vuelosDisponibles = {
				{"Harare", "Bulawayo", "100"},
				{"Harare", "Victoria Falls", "200"},
				{"Bulawayo", "Harare", "100"},
				{"Victoria Falls", "Harare", "200"}
		};


		System.out.println("Bienvenido al sistema de reserva de vuelos en Zimbabwe");
		mostrarVuelosDisponibles(vuelosDisponibles);

		// Solicitar al usuario que seleccione un vuelo
		System.out.print("Seleccione el número del vuelo que desea reservar: ");
		do {
			try {
				error = false;
				opcionVuelo = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Inserte un numero valido!!");
				error = true;
				scanner.nextLine();
			}
			}while(error);
		
		scanner.nextLine(); // Consumir la nueva línea después de nextInt()

		// Verificar si la opción de vuelo es válida
		if (opcionVuelo >= 1 && opcionVuelo <= vuelosDisponibles.length) {
			String[] vueloSeleccionado = vuelosDisponibles[opcionVuelo - 1];
			System.out.println("Ha seleccionado el vuelo de " + vueloSeleccionado[0] + " a " + vueloSeleccionado[1]);
			System.out.println("El precio del vuelo es $" + vueloSeleccionado[2]);

			// Solicitar información del pasajero
			System.out.println("\nPor favor, ingrese la información del pasajero:");
			System.out.print("Nombre: ");
			String nombrePasajero = scanner.nextLine();
			System.out.print("Apellido: ");
			String apellidoPasajero = scanner.nextLine();
			
			do {
			try {
				error = false;
				System.out.print("Edad: ");
				edadPasajero = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("Inserte un numero valido!!");
				error = true;
				scanner.nextLine();
			}
			}while(error);

			// Muestra detalles de la reserva
			System.out.println("\nReserva realizada con éxito para:");
			System.out.println("Nombre: " + nombrePasajero);
			System.out.println("Apellido: " + apellidoPasajero);
			System.out.println("Edad: " + edadPasajero);
			System.out.println("Destino: " + vueloSeleccionado[0] + " - " + vueloSeleccionado[1]);
			System.out.println("Precio: $" + vueloSeleccionado[2]);
		} else {
			System.out.println("Opción de vuelo no válida. Por favor, seleccione un número de vuelo válido.");
		}
	}

	/**
	 * Muestra los vuelos disponibles junto con sus destinos y precios.
	 * @param vuelosDisponibles Array bidimensional con la informacion de los vuelos
	 */
	private static void mostrarVuelosDisponibles(String[][] vuelosDisponibles) {
		System.out.println("Vuelos disponibles:");
		for (int i = 0; i < vuelosDisponibles.length; i++) {
			String[] vuelo = vuelosDisponibles[i];
			System.out.println((i + 1) + ". De " + vuelo[0] + " a " + vuelo[1] + " - $" + vuelo[2]);
		}
	}


	/**
	 * Realiza un test cultural sobre Zimbabwe.
	 * El test consta de 10 preguntas sobre diversos aspectos culturales del país.
	 * Muestra cada pregunta, solicita al usuario una respuesta y evalua la respuesta correcta.
	 * Al finalizar, muestra la puntuacion obtenida en el test.
	 * @param sc Scanner para la lectura de teclado
	 */
	private static void testCultural(Scanner sc) {
		final int CANTIDADPREGUNTAS = 10;
		int puntos = 0;
		String[][] preguntas = new String[CANTIDADPREGUNTAS][4];
		int[] respuestasCorrectas = new int[CANTIDADPREGUNTAS];

		crearPreguntas(preguntas, respuestasCorrectas);
		System.out.println("¡Bienvenido al test de cultura sobre Zimbabwe!");
		System.out.println("Responde a las siguientes preguntas:");
		for(int i=0;i<preguntas.length;i++) {
			puntos = hacerPregunta(preguntas, respuestasCorrectas, puntos, i, sc);
		}
		mostrarResultado(puntos, CANTIDADPREGUNTAS);        
	}

	/**
	 * Muestra los resultados del usuario en el test
	 * @param puntos Puntos que ha sacado el usuario
	 * @param cantidad Puntos totales que se pueden conseguir
	 */
	private static void mostrarResultado(int puntos, int cantidad) {
		System.out.println("\n¡Test completado!");
		System.out.println("Tu puntuación es: " + puntos + " de "+cantidad);

	}

	/**
	 * *
	 * Realiza una pregunta del test cultural.
	 * Muestra la pregunta y sus opciones, solicita al usuario una respuesta y evalúa si es correcta.
	 * @param preguntas Array bidimensional con las preguntas y las posibles respuestas
	 * @param respuestasCorrectas Array unidimensional que guarda las respuestas correctas en el mismo indice que la pregunta
	 * @param puntos Variable entero para guardar los puntos que ha conseguido el usuario
	 * @param i El indice de la pregunta
	 * @param sc Scanner para la lectura de teclado
	 * @return Devuelve los puntos recibidos sumando uno si el usuario ha acertado
	 */
	public static int hacerPregunta(String[][] preguntas, int[] respuestasCorrectas, int puntos, int i, Scanner sc) {
		int respuesta;
		boolean error;
		respuesta = 1;

		System.out.println(preguntas[i][0]);
		System.out.println(preguntas[i][1]);
		System.out.println(preguntas[i][2]);
		System.out.println(preguntas[i][3]);
		do{
			System.out.println("Responda con el número de la respuesta");
			
			
				// Solicitar y validar la selección del usuario
				try {
					error=false;
					respuesta=sc.nextInt();
					
				} catch (Exception e) {
					error=true;
					System.out.println("Introduzca un valor válido!");
					sc.nextLine();
				}
		
			
			if(respuesta!=1&&respuesta!=2&&respuesta!=3){
				System.out.println("Responda solo con los números 1, 2 o 3.");
				sc.nextLine();
			}
		}while(respuesta!=1&&respuesta!=2&&respuesta!=3 || error==true);

		if(respuesta==respuestasCorrectas[i]) {
			puntos++;
		}
		return puntos;
	}

	/**
	 * Crea las preguntas para el test cultural y sus respuestas correctas.
	 * @param preguntas El array bidimensional para guardar las preguntas
	 * @param respuestas El array unidimensional para guardar las respuestas
	 */
	public static void crearPreguntas(String[][] preguntas, int[]respuestas) {

		preguntas[0][0]="¿Cuál es la capital de Zimbabwe?";
		preguntas[0][1]="1. Bulawayo";
		preguntas[0][2]="2. Victoria Falls";
		preguntas[0][3]="3. Harare";
		respuestas[0]=3;

		preguntas[1][0]="¿Cuál es la moneda oficial de Zimbabwe?";
		preguntas[1][1]="1. Euro";
		preguntas[1][2]="2. Dólar de Zimbabwe";
		preguntas[1][3]="3. Dólar estadounidense";
		respuestas[1] = 2;

		preguntas[2][0]="¿Cuál es la lengua oficial de Zimbabwe?";
		preguntas[2][1]="1. Inglés";
		preguntas[2][2]="2. Shona y ndebele";
		preguntas[2][3]="3. Francés";
		respuestas[2] = 2;

		preguntas[3][0]="¿Cuál es la montaña más alta de Zimbabwe?";
		preguntas[3][1]="1. Monte Nyangani";
		preguntas[3][2]="2. Monte Inyangani";
		preguntas[3][3]="3. Monte Kilimanjaro";
		respuestas[3] = 2;

		preguntas[4][0]="¿En qué año obtuvo Zimbabwe su independencia?";
		preguntas[4][1]="1. 1965";
		preguntas[4][2]="2. 1980";
		preguntas[4][3]="3. 1970";
		respuestas[4]=2;

		preguntas[5][0]="¿Cuál es el plato nacional de Zimbabwe?";
		preguntas[5][1]="1. Sadza";
		preguntas[5][2]="2. Pap";
		preguntas[5][3]="3. Ugali";
		respuestas[5]=1;

		preguntas[6][0]="¿Cuál es el principal deporte de Zimbabwe?";
		preguntas[6][1]="1. Futbol";
		preguntas[6][2]="2. Rugby";
		preguntas[6][3]="3. Cricket";
		respuestas[6]=3;

		preguntas[7][0]="¿Qué significa 'Zimbabwe' en shona?";
		preguntas[7][1]="1. Gran río";
		preguntas[7][2]="2. Casa de piedras";
		preguntas[7][3]="3. Tierra de leones";
		respuestas[7]=2;

		preguntas[8][0]="¿Cuál es el parque nacional más grande de Zimbabwe?";
		preguntas[8][1]="1. Parque Nacional Hwange";
		preguntas[8][2]="2. Parque Nacional Matobo";
		preguntas[8][3]="3. Parque Nacional Mana Pools";
		respuestas[8] = 1;

		preguntas[9][0]="¿Qué río forma la frontera entre Zimbabwe y Zambia?\"";
		preguntas[9][1]="1. Río Zambezi;";
		preguntas[9][2]="2. Río Limpopo";
		preguntas[9][3]="3. Río Congo";
		respuestas[9]=1;

	}



	/**
	 * Realiza conversiones entre la moneda ZWL (Dolar de Zimbabwe) y EUR (Euro).
	 * El usuario puede seleccionar entre convertir de ZWL a EUR o de EUR a ZWL.
	 * Se utiliza un factor de conversión fijo para realizar los calculos.
	 * @param scanner Scanner para la lectura del teclado
	 */
	private static void cambioMoneda(Scanner scanner) {
		double factorConversion = 0.0025;
		double cantidad, euros, zimbabweDollar;
		int opcion=1;
		boolean error;
		cantidad=0;
		System.out.println("Bienvenido al conversor de moneda ZWL a EUR y viceversa.");
		System.out.println("Por favor, seleccione la operación que desea realizar:");
		System.out.println("1. Convertir de ZWL a EUR");
		System.out.println("2. Convertir de EUR a ZWL");
		

		do {
			// Solicitar y validar la selección del usuario
			try {
				error=false;
				opcion = scanner.nextInt();
				
			} catch (Exception e) {
				error=true;
				System.out.println("Introduzca un valor válido!");
				scanner.nextLine();
			}
			
			
		} while (error==true);
		switch (opcion) {
		case 1:
			System.out.println("Ingrese la cantidad en ZWL que desea convertir a EUR:");
			
			do {
				// Solicitar y validar la selección del usuario
				try {
					error=false;
					cantidad = scanner.nextDouble();
					
				} catch (Exception e) {
					error=true;
					System.out.println("Introduzca un valor válido!");
					scanner.nextLine();
				}
				
				
			} while (error==true);
			euros = cantidad * factorConversion;
			System.out.println(cantidad + " ZWL equivalen a " + euros + " EUR.");
			break;
		case 2:
			System.out.println("Ingrese la cantidad en EUR que desea convertir a ZWL:");
			
			do {
				// Solicitar y validar la selección del usuario
				try {
					error=false;
					cantidad = scanner.nextDouble();
					
				} catch (Exception e) {
					error=true;
					System.out.println("Introduzca un valor válido!");
					scanner.nextLine();
				}
		
			} while (error==true);
			zimbabweDollar = cantidad / factorConversion;
			System.out.println(cantidad + " EUR equivalen a " + zimbabweDollar + " ZWL.");
			break;
		default:
			System.out.println("Opción no válida. Por favor, seleccione 1 o 2.");
		}

	}


	/**
	 * Muestra informacion general sobre Zimbabwe.
	 * Muestra detalles como la capital, idioma oficial, poblacion, moneda, continente, gobierno y gentilicio del pais.
	 */
	private static void informacionGeneral() {
		System.out.println("Información sobre Zimbabwe:");
		System.out.println();
		System.out.println("Capital: Harare");
		System.out.println("Idioma oficial: Inglés, shona, ndebele");
		System.out.println("Población: Aproximadamente 15 millones");
		System.out.println("Moneda: Dólar de Zimbabwe (ZWL)");
		System.out.println("Continente: Africa");
		System.out.println("Gobierno: República presidencial");
		System.out.println("Gentilicio: Zimbabuense");

	}


	/**
	 * Implementa el juego Wordle, donde el jugador intenta adivinar una palabra oculta.
	 * El juego muestra una palabra oculta con guiones bajos representando cada letra.
	 * El jugador tiene un número limitado de intentos para adivinar la palabra.
	 * Después de cada intento, se muestra una representacion visual de las letras adivinadas correctamente,
	 * las letras correctas en posiciones incorrectas y las letras incorrectas.
	 * @param sc Scanner para la lectura del teclado
	 */
	 
	private static void wordle(Scanner sc) {
		final String ANSI_RED = "\u001B[31m";
		final String ANSI_GREEN = "\u001B[32m";
		final String ANSI_YELLOW = "\u001B[33m";
		final String ANSI_RESET = "\u001B[0m";

		// Lista de palabras para adivinar
		String[] palabras = {
				"Independencia",
				"Revolución",
				"Libertad",
				"Safari",
				"Marimba",
				"Cultura",
				"Tradición",
				"Turismo",
				"Agricultura",
				"Safari",
				"Kariba",
				"Elefantes",
				"Rinocerontes",
				"Leones",
				"Girafas",
				"Baobabs",
				"Minas",
				"Diamantes",
				"Cataratas",
				"Desarrollo",
				"Política",
				"Paz",
				"Inclusión",
				"Esperanza",
				"Unidad",
				"Ndebele",
				"Nación",
				"Patrimonio",
				"Conservación",
				"Reserva",
				"Parques",
				"Ríos",
				"Lagunas",
				"Desiertos",
				"Aventura",
				"Montañas",
				"Zimbabweanización",
				"Educación",
				"Ambiente",
				"Energía",
				"Innovación",
				"Emprendimiento",
				"Industria",
				"Comercio",
				"Exportación",
				"Importación",
				"Diversidad",
				"Democracia",
				"Valores",
				"Futuro"
		};
		int num;
		int fallos = 0;
		boolean acertado = false;
		String intento, palabra;

		// Seleccionar una palabra aleatoria de la lista
		num = (int)(Math.random() * (50));
		palabra = palabras[num].toUpperCase();

		// Bucle principal del juego
		while(fallos<=5 && !acertado) {
			// Mostrar la palabra oculta con guiones bajos representando las letras no adivinadas
			for(int i = 0;i<palabra.length();i++) {
				System.out.print("_ ");
			}
			System.out.println("(" + palabra.length() + ")");

			// Solicitar al jugador que escriba una palabra con la misma cantidad de letras que la palabra oculta
			do {
				System.out.println("Escribe una palabra con la misma cantidad de letras. Intentos: " + fallos);
				intento = sc.nextLine().toUpperCase();
			} while(intento.length() != palabras[num].length());

			// Comparar el intento del jugador con la palabra oculta
			for(int i = 0;i<palabra.length();i++) {
				if(palabra.charAt(i) == intento.charAt(i)) {
					System.out.print(ANSI_GREEN + intento.charAt(i) + ANSI_RESET);
				} else if(letraEnPalabra(palabra, intento.charAt(i))) {
					System.out.print(ANSI_YELLOW + intento.charAt(i) + ANSI_RESET);
				} else {
					System.out.print(ANSI_RED + intento.charAt(i) + ANSI_RESET);
				}
			}

			// Verificar si el jugador ha adivinado la palabra
			if(palabra.equalsIgnoreCase(intento)) {
				acertado = true;
			}
			System.out.println(" ");
			fallos ++;
		}

		// Mostrar el resultado del juego
		if(acertado) {
			System.out.println("¡Enhorabuena, has ganado!");
		} else {
			System.out.println("¡Has perdido!");
		}
	}

	/**
	 * Verifica si una letra está presente en una palabra.
	 * @param p La palabra donde comprobar
	 * @param c La letra a comprobar
	 * @return True en caso de que la letra esté en la palabra, false en caso de que no esté
	 */
	private static boolean letraEnPalabra(String p, char c) {
		boolean aparece = false;
		for(int i = 0; i<p.length();i++) {
			if(p.charAt(i)==c) {
				aparece = true;
			}
		}
		return aparece;
	}

	/**
	 * Implementa el juego de sopa de letras, donde el jugador busca palabras en una cuadrícula de letras.
	 * El jugador puede encontrar palabras en horizontal o vertical.
	 * El juego termina cuando el jugador encuentra todas las palabras o decide salir.
	 * @param sc Scanner para la lectura del teclado
	 */
	public static void sopaDeLetras(Scanner sc) {
		char[][] sopa = {
				{'C', 'Z', 'Y', 'A', 'X', 'B', 'N', 'M', 'H', 'L', 'K', 'R', 'Q', 'P', 'S', 'J', 'G', 'V', 'F', 'U', 'I', 'O', 'T', 'W', 'E'},
				{'F', 'O', 'D', 'I', 'H', 'R', 'Y', 'X', 'G', 'J', 'U', 'Q', 'M', 'N', 'A', 'S', 'E', 'L', 'P', 'V', 'C', 'W', 'T', 'B', 'K'},
				{'P', 'X', 'G', 'A', 'R', 'K', 'C', 'H', 'N', 'Y', 'M', 'F', 'U', 'J', 'E', 'U', 'I', 'B', 'T', 'S', 'V', 'O', 'W', 'D', 'Q'},
				{'H', 'W', 'K', 'D', 'M', 'Z', 'G', 'P', 'N', 'Y', 'S', 'U', 'G', 'F', 'V', 'A', 'R', 'O', 'L', 'I', 'T', 'Q', 'X', 'B', 'C'},
				{'A', 'I', 'J', 'V', 'L', 'S', 'D', 'X', 'A', 'R', 'W', 'G', 'A', 'B', 'N', 'K', 'E', 'U', 'M', 'T', 'F', 'Q', 'C', 'H', 'P'},
				{'R', 'B', 'V', 'E', 'U', 'P', 'L', 'S', 'A', 'J', 'F', 'Y', 'B', 'D', 'M', 'X', 'N', 'G', 'I', 'T', 'H', 'C', 'O', 'Z', 'K'},
				{'A', 'K', 'T', 'R', 'J', 'Y', 'I', 'B', 'H', 'A', 'U', 'S', 'E', 'P', 'X', 'D', 'O', 'L', 'A', 'R', 'C', 'W', 'L', 'Q', 'M'},
				{'R', 'J', 'Y', 'H', 'X', 'S', 'V', 'I', 'C', 'T', 'O', 'R', 'I', 'A', 'L', 'P', 'B', 'M', 'R', 'A', 'D', 'T', 'K', 'Q', 'W'},
				{'E', 'L', 'W', 'D', 'B', 'P', 'K', 'X', 'Y', 'Q', 'V', 'I', 'O', 'F', 'G', 'A', 'J', 'R', 'S', 'C', 'T', 'E', 'N', 'U', 'Z'},
				{'A', 'U', 'G', 'C', 'H', 'M', 'T', 'L', 'Q', 'O', 'E', 'D', 'S', 'W', 'I', 'V', 'X', 'R', 'K', 'P', 'Z', 'N', 'J', 'B', 'F'},
				{'S', 'F', 'O', 'T', 'G', 'J', 'K', 'Q', 'R', 'V', 'U', 'B', 'H', 'E', 'D', 'W', 'N', 'X', 'M', 'A', 'I', 'Z', 'Y', 'L', 'C'},
				{'X', 'R', 'M', 'I', 'Y', 'K', 'W', 'Z', 'D', 'H', 'F', 'V', 'L', 'A', 'U', 'C', 'N', 'S', 'B', 'P', 'E', 'G', 'J', 'T', 'O'},
				{'K', 'T', 'D', 'V', 'G', 'W', 'N', 'O', 'R', 'H', 'A', 'X', 'C', 'P', 'Y', 'L', 'Z', 'J', 'U', 'B', 'E', 'I', 'F', 'Q', 'S'},
				{'J', 'Q', 'Z', 'N', 'F', 'L', 'U', 'X', 'C', 'G', 'O', 'I', 'V', 'B', 'S', 'K', 'H', 'M', 'T', 'Y', 'R', 'D', 'E', 'P', 'A'},
				{'N', 'G', 'U', 'H', 'O', 'E', 'R', 'C', 'K', 'A', 'T', 'J', 'D', 'X', 'I', 'V', 'Y', 'Q', 'P', 'F', 'L', 'S', 'H', 'B', 'Z'},
				{'V', 'H', 'X', 'M', 'A', 'J', 'K', 'C', 'G', 'O', 'S', 'R', 'U', 'L', 'T', 'P', 'Y', 'I', 'B', 'N', 'F', 'E', 'W', 'D', 'Q'},
				{'D', 'P', 'B', 'F', 'Y', 'E', 'K', 'U', 'N', 'J', 'S', 'Z', 'R', 'M', 'X', 'A', 'V', 'T', 'I', 'O', 'G', 'H', 'A', 'Q', 'C'},
				{'Y', 'M', 'Z', 'X', 'L', 'T', 'J', 'R', 'G', 'B', 'E', 'P', 'S', 'U', 'N', 'D', 'O', 'A', 'V', 'K', 'H', 'C', 'N', 'W', 'Q'},
				{'L', 'V', 'P', 'Y', 'G', 'S', 'I', 'W', 'Q', 'B', 'O', 'K', 'J', 'F', 'X', 'C', 'D', 'E', 'R', 'M', 'T', 'A', 'G', 'H', 'Z'},
				{'R', 'K', 'Z', 'H', 'X', 'B', 'A', 'F', 'U', 'D', 'Y', 'O', 'T', 'P', 'E', 'L', 'E', 'F', 'A', 'N', 'T', 'E', 'E', 'Q', 'V'},
				{'I', 'Z', 'F', 'O', 'D', 'U', 'N', 'J', 'B', 'G', 'Q', 'T', 'E', 'A', 'R', 'V', 'L', 'K', 'W', 'P', 'S', 'H', 'Y', 'X', 'C'},
				{'W', 'A', 'J', 'C', 'M', 'K', 'O', 'R', 'E', 'I', 'V', 'L', 'B', 'T', 'S', 'Z', 'Y', 'X', 'F', 'G', 'N', 'P', 'U', 'H', 'D'},
				{'B', 'N', 'Y', 'V', 'T', 'F', 'P', 'J', 'U', 'R', 'O', 'S', 'G', 'I', 'A', 'X', 'H', 'L', 'C', 'Q', 'M', 'K', 'W', 'Z', 'E'},
				{'T', 'Y', 'U', 'A', 'L', 'V', 'B', 'K', 'F', 'G', 'H', 'J', 'W', 'X', 'Q', 'Z', 'I', 'R', 'M', 'O', 'N', 'C', 'P', 'S', 'D'},
				{'U', 'E', 'N', 'J', 'O', 'Z', 'A', 'M', 'B', 'E', 'Z', 'I', 'W', 'A', 'I', 'M', 'N', 'Y', 'A', 'N', 'G', 'A', 'K', 'L', 'V'},
				{'G', 'C', 'R', 'L', 'X', 'N', 'V', 'Y', 'K', 'F', 'H', 'O', 'Q', 'T', 'P', 'Z', 'A', 'B', 'S', 'W', 'J', 'M', 'U', 'D', 'I'},
		};
		// Declaración de la cuadrícula de letras y las palabras a encontrar

		String[] palabras = {"Harare", "Victoria", "Dolar", "Zambezi", "Elefante", "Mugabe", "Hwange", "Nyanga"};
		int pos, faltan = palabras.length;
		boolean salir = false;
		String palabra;

		// Imprimir la sopa de letras
		imprimirSopa(sopa);
		// Bucle principal del juego
		do {
			// Solicitar al jugador que escriba una palabra que haya encontrado
			System.out.println("Escriba una palabra que haya encontrado. Si escribe 'Salir', el programa terminará (Faltan: " + faltan + " palabras)");
			palabra  = sc.nextLine();

			// Verificar si el jugador quiere salir del juego
			if(palabra.equalsIgnoreCase("salir")) {
				salir = true;
			} else {
				// Comprobar si la palabra escrita por el jugador está en la lista de palabras
				pos = comprobarPalabra(palabra, palabras);
				if (pos != -1) {
					faltan--;
					System.out.println("¡Correcto!");
					palabras[pos] = "X"; // Marcar la palabra encontrada
				} else {
					System.out.println("¡Incorrecto!");
				}
			}
		} while (faltan > 0 && !salir);

		// Mostrar el resultado del juego
		if (faltan == 0) {
			System.out.println("¡Felicidades, has encontrado todas las palabras!");
		}
	}
	/**
	 * Imprime la cuadrícula de letras en la consola.
	 * @param sopa Array bidimensional donde guardamos la sopa de letras
	 */
	 
	public static void imprimirSopa(char[][] sopa) {
		for(int i=0;i<sopa.length;i++) {
			for(int j=0;j<sopa[i].length;j++) {
				System.out.print(sopa[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

	/**
	 * Comprueba si una palabra dada está presente en un array de palabras.
	 * @param palabra La palabra a comprobar
	 * @param array El array donde comprobar
	 * @return Devuelve la posicion de la palabra en caso de que esté, -1 en caso de que no esté
	 */
	public static int comprobarPalabra(String palabra, String[] array) {
		boolean encontrado = false;
		int pos = -1;
		for(int i=0;i<array.length&&encontrado==false;i++) {
			if(palabra.equalsIgnoreCase(array[i])) {
				encontrado=true;
				pos=i;
			}
		}
		return pos;
	}

	

	//CAMBIO HORA
	/**
	 * Convierte la hora actual de la zona horaria local a la hora en Zimbabwe
	 * añadiendo una hora a la hora local.
	 */
	public static void convertirHora() {
		LocalTime horaActual = LocalTime.now();
		int horas = horaActual.getHour();
        int minutos = horaActual.getMinute();
        
		System.out.println("Hora local: "+horas+":"+minutos);
		System.out.println("Hora local en Zimbabwe: "+(horas+1)+":"+minutos);
		
	}

	
}