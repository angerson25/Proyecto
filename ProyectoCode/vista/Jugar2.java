package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;

public class Jugar2 extends JDialog implements ActionListener
{

    //----------------------
    // Atributos
    //----------------------
    private JLabel lbJuego2;
    private JButton btComprobar;
    private JTextField tfLetra;
    private JLabel lbPalabraInvertida;
    private JLabel lbArreglaPalabra;

    //----------------------
    // Metodos
    //----------------------
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();
        

        if(comando.equals("entrar"))
        {
            
        }
    }
    public Jugar2()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);
        //array list
        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("ARBOL");
        palabras.add("CASA");
        palabras.add("LAPICERO");
        palabras.add("MOTO");
        palabras.add("NAVIDAD");

        //crear random
        Random rand = new Random();
        String palabraAleatoria = palabras.get(rand.nextInt(palabras.size()));
        String palabraInvertida = "";

        for (int x = palabraAleatoria.length() - 1; x >= 0; x--)
        {
            palabraInvertida = palabraInvertida + palabraAleatoria.charAt(x);
        }
        


        //Caracteristicas de la ventana
        this.setTitle("Juego2");
        this.setSize(900,556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        //label titulo
        lbJuego2= new JLabel("ARREGLAR LA PALABRA",JLabel.RIGHT);
        lbJuego2.setFont(new Font("Arial", Font.BOLD, 35));
        lbJuego2.setBounds(150,50,500,40);
        Color blanco =new Color(255,255,255);
        lbJuego2.setForeground(blanco);
        add(lbJuego2);

        //label Palabra invertida
        lbPalabraInvertida= new JLabel("Palabra invertida : "+palabraInvertida);
        lbPalabraInvertida.setFont(new Font("Arial", Font.BOLD, 35));
        lbPalabraInvertida.setBounds(40,190,500,40);
        lbPalabraInvertida.setForeground(blanco);
        add(lbPalabraInvertida);

        //label arreglar palabra
        lbArreglaPalabra= new JLabel("Arregla la palabra  : ");
        lbArreglaPalabra.setFont(new Font("Arial", Font.BOLD, 35));
        lbArreglaPalabra.setBounds(40,290,350,40);
        lbArreglaPalabra.setForeground(blanco);
        add(lbArreglaPalabra);

        //caja de texto palabra arreglada
        tfLetra = new JTextField("");
        tfLetra.setFont(new Font("Arial", Font.BOLD, 20));
        tfLetra.setBounds(380, 290, 200, 40);
        add(tfLetra);
        
        //Boton comprobar 
        btComprobar = new JButton("Comprobar");
        btComprobar.setBounds(630,290,170,40); 
        btComprobar.setActionCommand("comprobarJ2");
        Color morado =new Color(220,51,209);
        btComprobar.setBackground(morado);
        this.add(btComprobar);




        }
        
        



    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btComprobar.addActionListener(pAL);
    }

    public String getPalabra()
    {
        return (String) tfLetra.getText();
    }






    
}


    


    

