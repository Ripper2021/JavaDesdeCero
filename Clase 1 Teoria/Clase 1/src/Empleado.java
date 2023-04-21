// Clase publica:
// Las clases publicas son aquellas que pueden ser reutilizadas
// en otras clases, y que por tanto, son accesibles desde distintas
// partes del codigo. 
// Clase privada:
// En contraposición de la clase publica, las clases privadas son aquellas que SOLO
// pueden utilizarse dentro del paquete correspondiente a su cuerpo. Esto significa
// que NO son accesibles desde otras partes del codigo, y que al ser definidas como tales, tampoco
// pueden ser empleadas por otras clases. 
// Beneficios de las clases privadas:
// Encapsulación de funcionalidad: Las clase privadas utilizan el concepto
// de encapsulación de funcionalidades dentro de una clase, lo que permite que se mantenga
// oculta y protegida del acceso EXTERNO. Esto ayuda a prevenir cambios accidentales
// en el estado interno de la clase y garantiza que la clase funcione correctamente.
// Abstracción: Las clases privadas se utilizan para proporcionar una capa de abstracción.
// lo que permiteque los detalles de implementación se mantengan ocultos.
// Trazabilidad del codigo: La trazalabilidad del codigo es lo que nos permite
// identificar de forma rapida y sencilla que hace cada elemento del proyecto y nos permite
// facilmente identificarlo y modificarlo. 
// Clase Final:
// Las clases finales son aquellas que designan la FINALIZACIÓN de una cadena de herencia.
// Es decir, se utilizan para cerrar un conjunto de clases interconectadas.
// La clase final no permite que se herede o se acceda a comandos de ella.
// Sintaxis: public class final Main
// Clase Persona (Clase Padre) -> Clase Empleado (Clase Hija)-> Clase Main (Clase Final)
// Clase Abstracta: Las clases abstractas, son todas aquellas que sirven
// para integrar metodos abstractos. Cuando una clase tiene un elemento, atributo o metodo,
// abstracto es imposible instanciarla. Por el contrario, se hace simplemente la declaración.
// public abstract class MiClaseAbstracta
// {
//  public abstract void calculoEdad();
// }
//Herencia: En Java, la herencia es un mecanismo mediante el cual una clase
// puede HEREDAR atributos y metodos de otra clase. La clase que hereda los atributos
// y metodos se conoce como "subclase" o "clase hija", mientras que la clase
// de la que se heredan los atributos y metodos se conoce como "superclase" o "clase padre"
//Interfaces en Java: El objetivo de una interfaz es declarar una serie
// de metodos y/o atributos sin su IMPLEMENTACIÓN. Luego una clase o varias clases pueden
// IMPLEMENTAR la interfaz. 
// Una vez que una CLASE IMPLEMENTA una Interfaz SE DEBEN IMPLEMENTAR
// TODOS SUS METODOS, asi estos esten vacios o no.
public class Empleado extends Persona implements iSaludos
{
	public void saludar()
	{
		System.out.println("Hola que tal!");
	}
	
	public void despedirse()
	{
		System.out.println("Chau chau");
	}
	String cargo;
	int sueldo;
	public static void main(String [] args)
	{
		Empleado gustavo = new Empleado();
		gustavo.nombre = "Gustavo";
		gustavo.apellido = "Vargas";
		gustavo.edad = 30;
		gustavo.altura = 170;
		gustavo.ciudad = "Barcelona";
		gustavo.cargo = "Ingeniero";
		gustavo.sueldo = 30000;		
		gustavo.saludar();
		gustavo.despedirse();
		System.out.println("El empleado es: "+ gustavo.nombre + " su apellido es: " + gustavo.apellido + " su cargo es: "+ gustavo.cargo);
		//System.out.println("Hola mundo!");
	}
}