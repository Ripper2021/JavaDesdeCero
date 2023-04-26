import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial")

//Declaro la clase calculadora que extiende de JFrame e implementa ActionListener
public class Calculadora extends JFrame implements ActionListener
//Que hace ActionListener? ActionListener se encarga de capturar
//los eventos que ocurren en los botones de la calculadora. 

{
	private JLabel pantalla; //Declaramos los atributos
	private double resultado = 0; //Declaramos el resultado
	private String operacion = ""; //Declaramos nueva operacion vacia
	private boolean nuevaOperacion = true;
	
	
	public Calculadora() //Declaramos el constructor de Calculadora
	//Donde Configuramos la ventana
	{
		setTitle("Mi calculadora"); //Configuro el titulo
		setSize(300,200); //Configuro la ventana
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Configuro la operación de Default
		setResizable(false); //Para que se pueda ajustar o no el tamaño
		//Creo la pantalla
		pantalla = new JLabel("0"); //esto es lo que se ve por default
		pantalla.setHorizontalAlignment(JLabel.RIGHT);//Decimos que la etiqueta que declaramos se situe a la derecha
		pantalla.setPreferredSize(new Dimension (300, 30)); //Declaramos la dimension de la pantalla
		add(pantalla, BorderLayout.NORTH); //Establecemos la distribución en el Norte
		
		//Creo los botones a asignar
		String[] nombreBotones = {"0","1", "2", "3", "4", "5", "6", "7", "8", "9", "-", "+", "*", "/", "=", "."};
		JPanel panelBotones = new JPanel();
		panelBotones.setLayout(new GridLayout(4, 4)); //El GridLayout indica como se distribue cada elemento
								//Del Panel en su display.
		for(int i =0 ; i< nombreBotones.length; i++)
		{
			JButton boton = new JButton(nombreBotones[i]);
			boton.addActionListener(this);
			panelBotones.add(boton);
		}
		add(panelBotones, BorderLayout.CENTER); //Agrego los botones.
		setVisible(true); //Establezco que la pantalla este visible.
	}
	
//ActionListener > ActionEvent > getActionCommand()	
	
	
	//Este metodo es el encargado de realizar la accion asociada a cada boton.
	//el metodo getText() obtiene el texto contenido dentro del Label.
    public void actionPerformed(ActionEvent e) {
        String textoBoton = e.getActionCommand();//El metodo getActionCommando() obtiene la accion especifica
        if (textoBoton.equals("0") || textoBoton.equals("1") || textoBoton.equals("2") ||
            textoBoton.equals("3") || textoBoton.equals("4") || textoBoton.equals("5") ||
            textoBoton.equals("6") || textoBoton.equals("7") || textoBoton.equals("8") ||
            textoBoton.equals("9") || textoBoton.equals(".")) {

            if (nuevaOperacion) {
                pantalla.setText(textoBoton);
                nuevaOperacion = false;
            } else {
                pantalla.setText(pantalla.getText() + textoBoton);
            }
        } else if (textoBoton.equals("/") || textoBoton.equals("*") ||
                   textoBoton.equals("-") || textoBoton.equals("+")) {

            if (!operacion.equals("")) {
                calcular();
            } //realiza el calculo correspondiente al boton. 

            operacion = textoBoton;
            resultado = Double.parseDouble(pantalla.getText());
            nuevaOperacion = true;
        } else if (textoBoton.equals("=")) {
            calcular();
            operacion = "";
            nuevaOperacion = true;
        }
    }
    //Realiza los calculos estipulados por el usuario.
	public void calcular()
	{
		if(operacion.equals("+"))
		{
			resultado += Double.parseDouble(pantalla.getText());
			
		}
		else if(operacion.equals("-"))
		{
			resultado -= Double.parseDouble(pantalla.getText());
		}
		else if(operacion.equals("*"))
		{
			resultado *= Double.parseDouble(pantalla.getText());
		}
		else if(operacion.equals("/"))
		{
			resultado /= Double.parseDouble(pantalla.getText());
		}
		pantalla.setText("" + resultado); //Muestra por pantalla el resultado de la operación
	}

	public static void main (String[] args)
	{
		Calculadora calc = new Calculadora();
	}

}
