//AOP: Aspect Oriented Programming
// Programación orientada a Aspectos.
/*
La programación orientada a aspectos aplica
Modularidad en aspectos TRANSVERSALES.
¿Que es la transversalidad en Java?
Son situaciones que involucran al codigo
como un TODO. Como por ejemplo:
- Registro de auditoria
- Seguridad de la aplicación
- Gestion de excepciones
A la hora de trabajar con AOP se modulan
las clases y el codigo en distintos archivos. 
Aspectos:
Un aspecto es un modulo que encapsula una funcionalidad
TRANSVERSAL que afecta a multiples puntos de la aplicación,
como la seguridad, registraciones, validaciones, control
de transacciones, etcetera.
- Un aspecto puede definir un PUNTO DE CORTE.
¿Que es un punto de corte?
Son los lugares de la aplicación donde se va a aplicar
la nueva funcionalidad encapsulada.
- Los aspectos FACILITAN la implementación de requisitos
no funcionales en una aplicacion. 
Los aspectos se identifican con la siguiente notación:
@Aspect
Anotaciones (metodos):
Las anotaciones en AOP son etiquetas que se colocan
sobre elementos de codigo, como por ejemplo, clases, metodos,
atributos, parametros, etcetera. Y que proporcionan
informacion adicional sobre los aspectos, como por ejemplo,
su alcance, su orden de ejecucion, entre otros. 
Las anotaciones se utilizan para definir los aspectos de manera mas
declarativa y legible, en lugar de utilizar sintaxis especializada
como en AspectJ.
Algunas de las anotaciones mas utilizadas son las siguientes:
@After: Se va a ejecutar luego del aspecto
@Before: Se va a ejecutar ANTES del aspecto.
@Around: Se va a ejecutar a posterior si se da una situación especifica
Servicios:
En el contexto de AOP un servicio es una clase
que provee ciertas funcionalidades a la aplicación.
Un servicio puede ser CUALQUIER objecto que tenga una responsabilidad
especifica dentro de la aplicación, como acceder a la base de datos,
procesar datos, enviar correos electronicos, y mucho mas.
En general los servicios son una parte importante de la arquitectura
de la aplicación, ya que son los responsables de implementar la logica
de negocio y proporcionar las funcionalidades requeridas por los clientes
de la aplicación.
BEAN (frijol): 
Es un objeto instanciado, configurado y manejado
por el colntenedor de Spring. Los beans son las unidades
basicas de la aplicación de Spring y son responsables de realizar
una tarea especifica en la aplicación. 
En terminos mas tecnicos, un bean es una instancia de una clase
que ha sido definida en el archivo de Configuración de Spring
o mediante ANOTACIONES.





*/
package es.pildoras.aop.dao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.ClienteDAO;
import es.pildoras.aop.Configuracion;

public class main {

	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		//Con la linea 73 declaramos el contexto para poder hacer uso del Bean que acceda
		// a la funcionalidad declarada e integre los aspectos a nuestra clase principal.
		ClienteDAO elCliente = contexto.getBean("clienteDAO", ClienteDAO.class);
		//Con la linea 78 instanciamos a elCliente y accedemos a traves
		// del BEAN a las funcionalidades que tenga almacenada ClienteDAO.
		elCliente.saludar();
		contexto.close();
	}
}
