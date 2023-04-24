import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class Clase 
{
	/*
		public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in); //Con system.in le indico al Scanner Que son valores por consola
			System.out.println("Ingrese el primer numero: "); //\n indica un salto de linea (un enter)
			int numero = sc.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			int numero2 = sc.nextInt();
			System.out.println("Ingrese la operación que desea realizar: \n"
					+          "1. Suma \n"
					+ 		   "2. Resta \n"
					+ 		   "3. Multiplicación \n"
					+ 		   "4. Division");
			int menu = sc.nextInt();	
			if (menu == 1)
			{
				int suma = numero+numero2;
				System.out.println("El resultado de la suma es :" + suma);
			}
			//System.out.println("Ingresa tu nombre: ");
			//String nombre = sc.next();
			sc.close();
		}

//Arrays: Es una estructura de datos que almacena una colección de elementos del
// mismo tipo. Son objetos que contienen un numero fijo de elementos, y cada elemento puede ser accedido
// Mediante un indice numerico.

	public static void main (String [] args)
	{
		int [] numeros = {1,2,3,4,5,6,7,8,9,10}; //Declaro el array y todos sus valores
		System.out.println(numeros[0]);
		int arrayLargo = numeros.length;
		System.out.println("El largo del array es: " + arrayLargo);
		String [] nombres = new String[10]; //Declaro un array y la cantidad de elementos que va a tener
		nombres[0] = "Gustavo";
		nombres[1] = "Juan";
		nombres[2] = "María";
		nombres[3] = "Pablo";
		System.out.println("El nombre en la posición inicial es: "+ nombres[0]);
		//Recorro un array con el for. 
		for(int i =0; i < numeros.length; i++) //(primer elemento: variable tipo contador, segundo elemento variable de corte, tercer elemento: incremental del contador)
		{
			System.out.println("Los numeros del array son: " + numeros[i]);
		}
	}
	
//Fechas en Java: Como declarar fechas, manejo de fechas, entre otros. 
	public static void main(String [] args)
	{
		LocalDateTime fecha_actual_hora = LocalDateTime.now();
		LocalDate fecha_actual = LocalDate.now(); //Muestra la fecha en el formato Yankee: YYYY-MM-DD
		System.out.println(fecha_actual_hora);
		System.out.println(fecha_actual);
		LocalDate fecha_nacimiento = LocalDate.of(1992, 6, 4);		
		int edad = fecha_actual.getYear() - fecha_nacimiento.getYear();
		//int edad_dias_gustavo = fecha_nacimiento.
		System.out.println("La edad de Gustavo es: " + edad);
		//Manejo de metodos con Fechas
		LocalDate fecha_hoy = LocalDate.now();
		LocalDate fecha_ayer = fecha_hoy.minusDays(1);
		LocalDate fecha_mañana = fecha_hoy.plusDays(1);
		System.out.println("La fecha de hoy es: " + fecha_hoy);
		System.out.println("La fecha de ayer es: " + fecha_ayer);
		System.out.println("La fecha de mañana es: " + fecha_mañana);
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY"); //Formatos validos: yyyy-MM-dd, dd/MM/YYYY, dd-MMM/YYYY, yyyy-MMM-dd HH:mm:ss							 
		DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String fechaFormateada = fecha_hoy.format(formatoFecha);
		String fechaHoraFormateada = fecha_actual_hora.format(formatoFechaHora);
		System.out.println("La fecha formateada es: " + fechaFormateada);
		System.out.println("La fechaHora formateada es: " + fechaHoraFormateada);
	}
*/	
//Ficheros: Creación de ficheros
	public static void main (String [] args)
	{
		//String ruta_opcion2 = "C:\\Users\\Gusta\\OneDrive\\Documentos\\Backup\\salida.txt";
		try { 
		String ruta = "C:\\Users\\Gusta\\OneDrive\\Documentos\\Backup\\";
		String nombreArchivo = "salida.txt";
		String ruta_nombreArchivo = ruta + nombreArchivo;
		String contenido_ejemplo = "Hola que tal! Me gusta mucho la paella";
		//Aqui comenzamos la creacion del archivo. 
		
		File archivo = new File(ruta_nombreArchivo);
		if (! archivo.exists())
		{
				archivo.createNewFile();
				System.out.println("Se creo el fichero.");
        } 
		//Aqui comenzamos la escritura
		FileWriter fw = new FileWriter(archivo);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(contenido_ejemplo);
		bw.close();
		}	
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}