import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo2 {

	public static void main(String[] args) 
	{
		JFrame ventana = new JFrame ("Otro ejemplo"); //Declaro mi ventana
		ImageIcon icono = new ImageIcon("C:\\Users\\Gusta\\OneDrive\\Documentos\\icono.png"); //Declaro un icono
		ImageIcon icono_arreglado = new ImageIcon(icono.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH));
		//Con icono_arreglado puedo dejar mas bonito el icono y darle
		// un formato preestablecido.
		//icono.getImage() obtiene la imagen asociada al icono
		//.getScaledInstance necesita 2 parametros como minimo:
		// - el tamaño del icono
		// - Que accion se va a realizar sobre la imagen: en este caso fue java.awt.Image.SCALE_SMOOTH
		// java.awt.Image.SCALE_SMOOTH suaviza la imagen. 
		JLabel etiqueta = new JLabel("Este es mi programa!", icono_arreglado, JLabel.CENTER);
		ventana.add(etiqueta); //Inserta la etiqueta en la ventana
		ventana.setSize(700,800); //ancho x alto.
		ventana.setVisible(true); //Por defaul esta seteado en FALSE. 
								  //Ustedes tienen que setearlo en TRUE.
	}

}
