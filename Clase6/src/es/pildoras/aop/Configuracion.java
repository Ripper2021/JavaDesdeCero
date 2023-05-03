package es.pildoras.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
@Configuration //Indica que este es el archivo de
			   //Configuracion para que luego el BEAN lo utilice.
@ComponentScan("es.pildoras.aop") //Le indica a Java donde debe Escanear
							       // para buscar el Aspecto.
@EnableAspectJAutoProxy //Habilitar la opcion de AOP dentro de mi proyecto.
public class Configuracion 
{

}
