package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import vista.VentanaPrincipal;

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
    public DialogoJ2 miDialogoJ2 =null;
    public DIalogoJ2Incorrecto miDialogoJ2Incorrecto;
    private String palabraInvertida;
    private String palabraAleatoria;
    //----------------------
    // Metodos
    //----------------------
    
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
        palabras.add("BIGOTE");
        palabras.add("MUÑECA");
        palabras.add("CEREBRO");
        palabras.add("ABDOMEN");
        palabras.add("ESPALDA");
        palabras.add("DIARREA");
        palabras.add("REPRODUCCION");
        palabras.add("ELEFANTE");
        palabras.add("CARACOL");
        palabras.add("VEGETAL");
        palabras.add("PATATA");
        palabras.add("MANZANA");
        palabras.add("GASEOSA");
        palabras.add("CALENDARIO");
        palabras.add("ANOCHECER");
        palabras.add("UNIVERSO");
        palabras.add("TORMENTA");
        palabras.add("HABITACION");
        palabras.add("VENTANA");


        //crear random
        Random rand = new Random();
        palabraAleatoria = palabras.get(rand.nextInt(palabras.size()));
        palabraInvertida = "";

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
        lbJuego2= new JLabel("ARREGLAR LA PALABRA");
        lbJuego2.setFont(new Font("Arial", Font.BOLD, 35));
        lbJuego2.setBounds(210,50,600,40);
        Color blanco =new Color(255,255,255);
        lbJuego2.setForeground(blanco);
        add(lbJuego2);

        //label Palabra invertida
        lbPalabraInvertida= new JLabel("Palabra invertida : "+palabraInvertida);
        lbPalabraInvertida.setFont(new Font("Arial", Font.BOLD, 35));
        lbPalabraInvertida.setBounds(40,190,650,40);
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
        btComprobar.addActionListener(this);

        

    }

    

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btComprobar) 
        {
            String g;
            g= tfLetra.getText();
            
            if(g.equals(palabraAleatoria))
            {
                
                miDialogoJ2 = new DialogoJ2();
                this.dispose();
                
            }
            else
            {
                miDialogoJ2Incorrecto = new DIalogoJ2Incorrecto();
                this.dispose();
            }
            
            
        }
    }
        
        



    
    

    public String getPalabra()
    {
        return (String) tfLetra.getText();
    }
   
    





    
}


    


    

