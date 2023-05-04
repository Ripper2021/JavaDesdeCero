package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import calculadora.Calculadora;
import configuracion.Configuracion;

public class Main 
{
	
	public static void main(String [] args)
	{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	context.register(Configuracion.class); //El metodo register REGISTRA la configuracion a implementar
	context.scan("calculadora", "aspecto"); //escane los Paquetes. 
	context.refresh();
	Calculadora calculadora = context.getBean(Calculadora.class); //Elige el componente a implementar con el Bean.
	int resultado1 = calculadora.sumar(10, 10);
	System.out.println("El resultado de la suma es: " + resultado1);
	int resultado2 = calculadora.dividir(10, 10);
	System.out.println("El resultado de la division es: " + resultado2);
	int resultado3 = calculadora.multiplicacion(10, 10);
	System.out.println("El resultado de la multiplicacion es: " + resultado3);
	int resultado4 = calculadora.restar(100, 50);
	System.out.println("El resultado de la resta es: " + resultado4);
	int resultado5 = calculadora.factorizar(10, 10, 10);
	System.out.println("El numero factorizado es: " + resultado5);
	
	context.close();
	}
	
	
	
}
