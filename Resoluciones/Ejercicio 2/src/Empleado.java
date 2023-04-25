/*
	EJERCICIO NUMERO 2:
		ESTRUCTURA DEL PROGRAMA:
		- Implementar clases: Clase de Persona y Clase de Empleado. Donde cada clase debe tener atributos propios de la misma.
		Persona: Nombre, Apellido, Ciudad, Edad
		- Aplicar herencia entre clases
		- Implementar Interfaces
		- Ficheros
		- Manejo de fechas
		ENUNCIADO:
		Nos contrataron de una empresa para desarrollar un sistema de recursos humanos, donde por consola se debe ingresar
		la siguiente información de los empleados:
		- Posición: El cargo que tiene actualmente
		- Salario: El salario que tiene actualmente
		- Fecha de ingreso: La fecha en la que ingreso (AÑO, MES, DIA)
		En base a esta información, se debe implementar una interfaz que calcule lo siguiente:
		- Salario_neto: Salario * 0.80
		El programa debe generar un archivo de salida que se llame "informacion_empleados_fechaDeHoy") Donde la fecha de hoy
		esta almacenada en una variable. Y entregar toda la información generada por el sistema, lo que se coloco por consola
		y lo que genera el sistema tambien. 
		(!) Hacer para al menos 3 empleados (!)
		ENTREGABLES:
		- Codigo del proyecto. 
*/
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Empleado extends Persona implements iSalario
{
	String posicion;
	int salario;
	LocalDate fechaIngreso;

	public Empleado(String nombre, String apellido, String Ciudad, int edad) {
		// TODO Auto-generated constructor stub
	this.Nombre = nombre;
	this.Apellido = apellido;
	this.Ciudad = Ciudad;
	this.Edad = edad;
	}

	public double calcularSalarioNeto(int salario)
	{
		return salario * 0.8;
	}
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Empleado[] empleados = new Empleado[3];
		empleados[0] = new Empleado("Gustavo", "Vargas", "Barcelona", 30);
		empleados[1] = new Empleado("Maria", "Gonzalez", "Madrid", 25);
		empleados[2] = new Empleado("Pablo", "Gonzalez", "Sevilla", 29);
			for (int j = 0; j<3; j++)
			{
				System.out.println("Ingrese la posición en la empresa: ");
				empleados[j].posicion = sc.next();
				System.out.println("Ingrese el salario en la empresa: ");
				empleados[j].salario = sc.nextInt();
				System.out.println("Ingrese la fecha de ingreso en la empresa: ");
				System.out.println("Año: ");
				int anio = sc.nextInt();
				System.out.println("Mes: ");
				int mes = sc.nextInt();
				System.out.println("Día");
				int dia = sc.nextInt();
				empleados[j].fechaIngreso = LocalDate.of(anio, mes, dia);
			}
		LocalDate fechaDeHoy = LocalDate.now();
		String ruta = "C:\\Users\\Gusta\\OneDrive\\Documentos\\informacion_empleados_" + fechaDeHoy + ".txt";
		String contenido = "";
		int i = 0;
		while(i < empleados.length)
		{
			double salarioNeto = empleados[i].calcularSalarioNeto(empleados[i].salario);
			contenido += "Empleado" + i
					     + "\n\tNombre completo: " + empleados[i].Nombre + " "
					     + "\n\tEdad: " + empleados[i].Edad 
					     + "\n\tCiudad: " + empleados[i].Ciudad
					     + "\n\tPosicion: "+ empleados[i].posicion
					     + "\n\tFecha ingreso: " + empleados[i].fechaIngreso
					     + "\n\tSalario Bruto: " + empleados[i].salario
					     + "\n\tSalario Neto: " + salarioNeto +"\n";
			i++;
		}
		
		File archivo = new File(ruta);
		try {
				if (!archivo.exists())
				{	
				archivo.createNewFile();
				System.out.println("El archivo fue creado!");
				}
		FileWriter fw = new FileWriter(archivo);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(contenido);
		bw.close();
		}
		 catch (IOException e) {
			 e.printStackTrace();
		}
		sc.close();
		}
	}	