import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

import org.json.*;
import com.google.gson.*;
/*
Maven es una herramienta de gestion de proyectos de Software de Java
y otros lenguajes de programación.A traves del archivo POM se encarga
del manejo. 
POM: Project Object Model. Es el encargado de manejar las 
dependencias, plugins, tareas de construcción, etcetera.
Genero una nueva version donde la actualización tiene nuevas
funcionalidades. Estas nuevas funcionalidades se pueden generar
a traves de un archivo de tipo .jar o un archivo de tipo .war 
GroupID: Es el ID que identifica quien genero la dependencia.
Ya sea la empresa, la persona, o el nombre del proyecto. 
ArtefactID: Es el artefacto que contiene las funcionalidades asociadas
al programa. Probablemente dentro de un .jar o un .war contenido.
JSON: Es un formato de texto sencillo para el intercambio de DATOS.
JSON se usa mucho en el desarrollo de APIS. 
*/
public class Clase5 
{

	public static void main(String[] args) 
	{
	//Declaración de un objeto de tipo JSON y un Array de tipo JSON
	JSONObject  objeto = new JSONObject();
	JSONArray   arrayJson = new JSONArray();
	objeto.put("nombre", "Gustavo");
	objeto.put("Apellido", "Vargas");
	objeto.put("Edad", 30);
	arrayJson.put(objeto);
	String stringJson = objeto.toString();
	System.out.println(objeto);
	System.out.println(stringJson);
	System.out.println(arrayJson);
	//Formato de salida de un archivo de tipo JSON:
	//{"Edad":30,"Apellido":"Vargas","nombre":"Gustavo"}
	System.out.println("---------------------- SALTO DE LINEA ---------------\n");
	//LeerJSON
	String cadenaDeCaracteres = "{\"nombre\":\"Gustavo\",\"apellido\":\"Vargas\",\"edad\":30}";
	JSONObject json_objecto = new JSONObject(cadenaDeCaracteres);
	String nombre = json_objecto.getString("nombre");
	String apellido = json_objecto.getString("apellido");
	int edad = json_objecto.getInt("edad");
	System.out.println("El nombre es: " + nombre + " " + "El apellido es: " + apellido + " " + "y la edad es: " + edad);
	System.out.println("---------------------- SALTO DE LINEA ---------------\n");
	
	//Crear un JSON Anidado
	JSONObject persona = new JSONObject();
	persona.put("nombre", "Gustavo");
	persona.put("Apellido", "Vargas");
	persona.put("Edad", 30);
	persona.put("Correo electronico", "gavargas@grupoloyal.com");
	
	JSONObject direccion = new JSONObject();
	direccion.put("Calle", "Calle falsa 1234");
	direccion.put("Ciudad", "Barcelona");
	direccion.put("Pais", "España");
	persona.put("direccion", direccion);
	//String calle = persona.getJSONObject("direccion").getString("Calle"); //Ejemplo para obtener la calle.	
	System.out.println("La información de la persona es: " + persona);
	System.out.println("---------------------- SALTO DE LINEA ---------------\n");
	//Ejemplo de Array
	JSONObject persona1 = new JSONObject();
	persona1.put("Nombre", "Pablo");
	persona1.put("Edad", 25);
	JSONObject persona2 = new JSONObject();
	persona2.put("Nombre", "Gustavo");
	persona2.put("Edad", 30);
	JSONArray personas = new JSONArray();
	personas.put(persona1);
	personas.put(persona2);
	System.out.println("Las personas registradas hasta el momento son: " + personas);
	
	/*
	//Ordenar un Objecto de tipo JSON
	String jsonString = "{\"a\": 1, \"b\": 2,\"c\": 3}";
	JSONObject jsonObj = new JSONObject(jsonString);
	List<String> llaves = new ArrayList<>(jsonObj.keySet());
	Collections.sort(llaves); //Ordenamos los elementos.
	JSONObject elementosOrdenados = new JSONObject();
	for (String llave: llaves)
	{
		elementosOrdenados.put(llave, llaves.get(llave));
		
	}
	*/
	//Ordeno Array de JSON
	System.out.println("---------------------- Ordenar Array de JSON ---------------\n");
	String jsonString = "[3,2,1,0]";
	JSONArray jsonArray = new JSONArray (jsonString);
	List<Integer> lista = new ArrayList<>();
	for(int i = 0; i < jsonArray.length(); i++)
	{
		lista.add(jsonArray.getInt(i));
	}
	Collections.sort(lista); //Utilizamos la coleccion nativa de java
							 //para ordenar el Array de tipo JSON.
	System.out.println("Mi array ordenado es el siguiente: " + lista);
	System.out.println("---------------------- GSON ---------------\n");
	String json_a= "{\"nombre\":\"Gustavo\",\"apellido\":\"Vargas\",\"edad\":30}";  
	Gson gson = new GsonBuilder().create(); //Instancia a GSON y utiliza el metodo .create() que es el encargado de la conversion del JSON a un objeto de Java 
	@SuppressWarnings("unchecked")
	TreeMap<String, Object> treeMap = gson.fromJson(json_a, TreeMap.class);
	//gson.fromJson Es el metodo encargado de convertir el JSON Object en un objeto
	//TreeMap de Java. Ya que TreeMap es la encargada de mantener
	//sus claves ordenadas. 
	System.out.println("El objecto de JSON ordenado tiene esta apariencia: "+ treeMap);
}
}