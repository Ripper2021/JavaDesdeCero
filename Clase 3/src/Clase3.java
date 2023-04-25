import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Listas:
// Es una estructura de datos que puede contener una serie de elementos
// en una secuencia ordenada. 
// - la lista se representa por consola con []
// - La lista admite valores duplicados
// - La lista ordenada los elementos en base a su ingreso. 
public class Clase3 {
	public static void main(String[] args) {
	List<String> nombres = new ArrayList<String>();
	//agregar elementos a una lista
	nombres.add("Gustavo");
	nombres.add("Maria");
	nombres.add("Pablo");
	nombres.add("Carlos");
	nombres.add("Emilio");
	nombres.add("Gustavo");
	System.out.println(nombres);
	//Obtener el tamaño de la lista
	int tamanio = nombres.size();
	System.out.println("El tamaño de la lista es: "+ tamanio);
	//Obtener el elemento en la posicion 2
	String nombre_pos_2 = nombres.get(2);
	System.out.println("El nombre de la posicion 2 es: "+ nombre_pos_2);
	//Borrar un elemento de la lista. Elimino a Gustavo en la pos 5
	nombres.remove(5);
	System.out.println("Los nombres actualizados son: " + nombres);
	//Actualizar elementos en una lista
	nombres.set(0, "Alberto");
	System.out.println("Los nombres actualizados son: " + nombres);
	//Comprobar si la lista contiene un elemento
	boolean contiene = nombres.contains("Emilio");
	System.out.println("La lista de nombres contiene a Emilio? " + contiene);
	//Eliminar todos los elementos de la lista
	nombres.clear();
	System.out.println("Elimine todos los elementos de la lista: " +nombres);
	//Listas con varios tipos de datos 
	List<Integer> listaDeEnteros = new ArrayList<>();
	listaDeEnteros.add(1);
	listaDeEnteros.add(2);
	listaDeEnteros.add(3);
	List<String> colores = new ArrayList<>();
	colores.add("Azul");
	colores.add("Rojo");
	colores.add("Verde");
	 List<Object> objetoLista = new ArrayList<>(); 
	 objetoLista.add(listaDeEnteros);
	 objetoLista.add(colores);
	 System.out.println("Mi lista nueva es: " + objetoLista);
	//Set: es una interfaz que extiende de la colección de Colecction
    // que representa valores unicos.
	// - No esta ordenado.
	// - No admite valores duplicados
	Set<String> lenguajesDeprogramacion = new HashSet<String>();
	lenguajesDeprogramacion.add("Python");
	lenguajesDeprogramacion.add("Python");
	lenguajesDeprogramacion.add("Java");
	lenguajesDeprogramacion.add("SQL");
	lenguajesDeprogramacion.add("C#");
	lenguajesDeprogramacion.add("C++");
	lenguajesDeprogramacion.add("Cobol");
	lenguajesDeprogramacion.add("GO");
	lenguajesDeprogramacion.add("Dart");
	lenguajesDeprogramacion.add("Visual Basic");
	lenguajesDeprogramacion.add("Javascript");
	lenguajesDeprogramacion.add("Matlab");
	System.out.println("La lista de lenguajes de programacion es: "+ lenguajesDeprogramacion);
	//Elimino un elemento. 
	lenguajesDeprogramacion.remove("GO");
	//Obtener el tamaño del conjunto
	int tamanio_set = lenguajesDeprogramacion.size();
	System.out.println("El tamaño es: " + tamanio_set);
	//Limpio el conjunto.
	//lenguajesDeprogramacion.clear();
	Set<Integer> numeros = new HashSet<Integer>();
	numeros.add(1);
	numeros.add(2);
	numeros.add(3);
	Set<Object> objeto = new HashSet<>();
	objeto.add(lenguajesDeprogramacion);
	objeto.add(numeros);
	System.out.println("Los elementos del objeto son: " + objeto);
	//Cuando usar SET:
	// Necesitas almacenar elementos unicos
	// No te interesa el orden que tengan
	// No te importa el rendimiento del programa respecto
	// al acceso de los elementos de Set. 
	//Cuando usar Lista:
	// Necesitas almacenar elementos duplicados
	// Necesitas almacenar elementos en un orden especifico
	// Que se puedan acceder a traves del indice.	
/////////////////////////////////////////////////////////////////////	
	//Map: En Java es una estructura de datos que se utiliza para
	//	almacenar una colección de pares clave-valor. Cada Elemento
	//  contiene dos partes: Una clave unica que se utiliza para identificar
	//  el valor asociado. Y el valor de dicha clave.
	//  Tipos de Maps:
	// 	TreeMap
	// 	HashMap
	// 	LinkedHashMap
	//HashMap: Es una implementación de Map que utiliza una tabla HASH.
	// Para almacenar sus elementos. Es una de las implementaciones mas rapidas
	// y eficientes, pero no garantiza el orden de los elementos.	
	HashMap<String, Integer> usuarios = new HashMap<>();
	usuarios.put("Gustavo", 30);
	usuarios.put("Maria", 25);
	usuarios.put("Pablo", 26);
	usuarios.put("Hernan", 39);
	usuarios.put("Ignacio", 22);
	//Imprimo el par clave-valor:
	System.out.println(usuarios);
	//Accedemos a un elemento especifico:
	int edadGustavo = usuarios.get("Gustavo");
	System.out.println("La edad de gustavo es: " + edadGustavo);
	//Modificar un elemento en clave-valor
	usuarios.put("Gustavo", 50);
	System.out.println("Los usuarios modificados son: " + usuarios);
	
	//Eliminar un elemento del HashMap
	usuarios.remove("Gustavo");
	System.out.println("Los usuarios fueron modificados: " + usuarios);
	//Recorrer los elementos del HashMap
	for (String nombre: usuarios.keySet()) //El metodo keySet nos permite recorrer todos los elementos del Map
	{
		int edad = usuarios.get(nombre);
		System.out.println("El nombre es: " + nombre + " y su edad es: " + edad);
	}
	
	}
	
}
