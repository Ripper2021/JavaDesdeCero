
public class EmpleadoControlador 
{
	private EmpleadoModelo modelo;
	private Vista vista;
	public EmpleadoControlador(EmpleadoModelo modelo, Vista vista)
	{
		this.modelo= modelo;
		this.vista= vista;
	}
	public void mostrarEmpleado()
	{
		vista.mostrarEmpleado(modelo.getNombre(), modelo.getApellido(), modelo.getSalario());
	}
}