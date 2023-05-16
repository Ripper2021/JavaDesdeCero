
public class Controlador 
{

	private Vista vista;
	
	public Controlador(Vista vista)
	{
		this.vista = vista;
		// es una palabra clave que se utiliza para hacer referencia
		// al objeto actual en el que se encuentra el codigo. 
		// Representa una referencia al objeto en si mismo, permitiendo
		//Acceder a sus variables de instancia, metodos y constructores.
	}
	public void generarIndex()
	{
		Usuario usuario = new Usuario();
		usuario.setNombre("Gustavo Vargas");
		usuario.setCorreo("gavargas@grupoloyal.com");
		vista.mostrarIndex(usuario);
	}
}
