import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo3 
{
	public static void main (String [] args)
	{
	JFrame ventana = new JFrame("Esta es mi ventana");
	JLabel etiqueta = new JLabel ("Esta es mi etiqueta");
	etiqueta.setOpaque(true);
	etiqueta.setForeground(Color.WHITE); //Cambia el color de la fuente
	etiqueta.setBackground(Color.DARK_GRAY); //Le agrega un color de fondo a las etiquetas
	ventana.add(etiqueta);
	ventana.setVisible(true);
	ventana.setSize(250,150);
}
}