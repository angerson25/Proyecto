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


public class PruebaJ1 extends JDialog implements ActionListener
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btJugar1, btComprobar;
    private JLabel lb14;
    private JTextField tfLetra;
    private String palabraAleatoria;

    //----------------------
    // Metodos
    //----------------------
    
    public PruebaJ1()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);



        //Caracteristicas de la ventana
        this.setTitle("Juego1");
        this.setSize(900,556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        

        //crear juego del ahorcado
        //crear arraylist de palabras
        ArrayList<String> palabras = new ArrayList<String>();
        /*palabras.add("ARBOL");
        palabras.add("CASA");
        palabras.add("LAPICERO");
        */palabras.add("MOTO");
        //palabras.add("NAVIDAD");

        //crear random
        Random rand = new Random();
       
        palabraAleatoria = palabras.get(rand.nextInt(palabras.size()));
        //contar letras de la palabra
        int cantidadLetras = palabraAleatoria.length();


        // Crear los labels y agregarlos al panel
        

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
            
            
            if(palabraAleatoria.equals("e"))
            if(g.equals("M")){
                    
                lb14.setVisible(true);
            }
                
            
            

            
            
            
            
        }
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btJugar1.addActionListener(pAL);
    }

        
    public String obtenerTexto()
    {
        return tfLetra.getText();
    }


    


    
}