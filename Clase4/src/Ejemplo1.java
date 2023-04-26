import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo1 {
	public static void main (String [] args)
	{
		JFrame ventana = new JFrame("Este es mi ejemplo de HolaMundo");
		JLabel etiqueta = new JLabel("Hola mundo!");
		//Inserto la etiqueta dentro de la ventana
		ventana.add(etiqueta); //Inserto la etiqueta dentro de la ventana.
		ventana.setSize(800,600); //Ajusto el tamaño de la ventana con las medidas que yo considere
		ventana.setVisible(true); //Le indico que se pueda visualizar.
		//ventana.pack(); //Ajusta la ventana al contenido del mismo.
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
