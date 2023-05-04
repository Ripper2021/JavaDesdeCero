package aspecto;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TimeLoggerAspect 
{
	@Around("execution (* funcion.Funcion.sumar(int, int))")
	public Object logTime(ProceedingJoinPoint joinPoint) throws Throwable
	{
		long startTime = System.currentTimeMillis();
		Object result = joinPoint.proceed();
		long endTime = System.currentTimeMillis();
		System.out.println("Tiempo de ejecución de la funcion: " + (endTime - startTime));
		return result;
	}	
}