import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos
{
	public static void main (String [] args)
	{
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		//Desde la linea 19 hasta la 21 inclusive, nos lo tiene que pasar el area de Sistemas o de Datos.
		String url = "jdbc:sqlserver://localhost:1433;dataBaseName=master";
		String usuario = "ripper";
		String password = "Gustavo";
		try  (Connection conn = DriverManager.getConnection(url, usuario, password);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery ("SELECT DISTINCT * FROM Usuarios"))
		{
			System.out.println("Te conectaste de forma satisfactoria");
			while (rs.next())
			{
				String nombre = rs.getString("Nombre");
				String apellido = rs.getString("Apellido");
				String ciudad = rs.getString("Ciudad");
				String NOMBRE_USUARIO = rs.getString("NOMBRE_USUARIO");
				String Email = rs.getString("Email");
				System.out.println(nombre + " " + apellido + ciudad );
				System.out.println("El usuario es: " + NOMBRE_USUARIO);
				System.out.println("El email es: " + Email);	
			}
		}		
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
/*
 * Paso a paso de como conectarse a una base de datos:
 * 1ro) Identificar que motor de base de datos es, por ejemplo:
 * Oracle, SQL Server, Teradata, DB2, Bigquery, Azure, RedShift, Snowflake
 * 2do) Bajar los drivers (JDBC) correspondientes al motor de base de datos
 * 3ro) Una vez descargado los drivers, integrar el JAR file que contenga la descarga
 * a nuestro proyecto. 
 * 4to) ¿Como se agrega? En Eclipse: 
Click derecho sobre el proyecto > Propiedades > Java Build Path > Libraries > ADD External JAR 
   5to) Declaran la conexion con el JDBC:
   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   6to) Declaro el codigo del programa. 
   
   Crear credenciales en SQL Server:
   1) Base de Datos General > Security > New Login > Crear new login > Dar permisos de Sysadmin y ademas Poner acceso a la base de datos.
   2) Habilitar el login para Windows Credentials y Usuarios
   3) Reiniciar el servidor
   
 */


