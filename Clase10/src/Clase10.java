import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Clase10 {
	public static void main(String[] args) throws IOException 
	{
		String nombreProyecto = "Mi proyecto";
		int buildNumero = 1;
		String contenidoJenkinsFile = 
				"pipeline {\n" +
                        "    agent any\n" +
                        "    stages {\n" +
                        "        stage('Build') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    echo 'Building " + nombreProyecto + " (Build #" + buildNumero + ")'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "        stage('Test') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    echo 'Probando...'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "        stage('Deploy') {\n" +
                        "            steps {\n" +
                        "                script {\n" +
                        "                    echo 'Deployment activo...'\n" +
                        "                }\n" +
                        "            }\n" +
                        "        }\n" +
                        "    }\n" +
                        "}";
										  	

		try (
			PrintWriter writer = new PrintWriter(new FileWriter("Jenkinsfile")))
		{
			writer.write(contenidoJenkinsFile);
			System.out.println("Se genero el Jenkinsfile");
		} 
		
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}