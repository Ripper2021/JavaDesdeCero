package es.pildoras.aop;
import org.springframework.stereotype.Component;

@Component //Le indica que es un Componente a Java
		   //El cual es el que se va a usar
		   //Como funcionalidad a implementar. 
public class ClienteDAO 
{
	public void saludar ()
	{
		System.out.println("Hola que tal, te estoy saludando!");
	}
}
