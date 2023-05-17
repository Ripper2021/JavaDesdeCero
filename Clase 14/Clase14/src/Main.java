public class Main 
{
	public static void main (String [] args)
	{
		EmpleadoModelo modelo = new EmpleadoModelo();
		Vista vista = new Vista();
		EmpleadoControlador controlador = new EmpleadoControlador(modelo, vista);
		modelo.setNombre("Gustavo");
		modelo.setApellido("Vargas");
		modelo.setSalario(10000);
		controlador.mostrarEmpleado();
	}
}
