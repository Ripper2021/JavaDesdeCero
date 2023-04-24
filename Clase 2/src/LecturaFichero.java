import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class LecturaFichero 
{
//Una forma de leer un fichero: usando el Scanner:
	/*
	public static void main(String[] args) 
	{
		//TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new File("C:\\Users\\Gusta\\OneDrive\\Documentos\\Backup\\salida.txt"));
			while(sc.hasNextLine()) //hasNextLine tiene lineas que leer
			{
				System.out.println(sc.nextLine()); //Imprime las lineas que hay para leer
			}
		sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
*/
//Segunda forma de leer un fichero
	public static void main (String [] args)
	{
	try
	{
		File documento = new File("C:\\\\Users\\\\Gusta\\\\OneDrive\\\\Documentos\\\\Backup\\\\salida.txt");
		BufferedReader objeto = new BufferedReader(new FileReader(documento));
		String caracteres = "";
		while((caracteres = objeto.readLine()) != null)
		{
			System.out.println(caracteres);
			
		}
	}
	catch (IOException e)
	{
		e.printStackTrace();
	}
	}
}