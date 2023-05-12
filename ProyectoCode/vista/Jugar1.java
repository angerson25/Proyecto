package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Jugar1 extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btJugar1;
    private JTextField tfLetra;

    //----------------------
    // Metodos
    //----------------------
    public Jugar1()
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
        palabras.add("ARBOL");
        palabras.add("CASA");
        palabras.add("LAPICERO");
        palabras.add("MOTO");
        palabras.add("NAVIDAD");

        //crear random
        Random rand = new Random();
        String palabraAleatoria = palabras.get(rand.nextInt(palabras.size()));
        //contar letras de la palabra
        int cantidadLetras = palabraAleatoria.length();


        // Crear los labels y agregarlos al panel
        if (palabraAleatoria.equals("ARBOL")){
            JLabel lbA = new JLabel("A");
            lbA.setBounds(100, 100, 100, 100);
            Color lbAColor =new Color(255, 0, 0, 128);
            this.add(lbA);

            JLabel lbR = new JLabel("R");
            lbR.setBounds(200, 100, 100, 100);
            Color lbRColor =new Color(255, 0, 0, 128);
            this.add(lbR);

            JLabel lbB = new JLabel("B");
            lbB.setBounds(300, 100, 100, 100);
            Color lbBColor =new Color(255, 0, 0, 128);
            this.add(lbB);

            JLabel lbO = new JLabel("O");
            lbO.setBounds(400, 100, 100, 100);
            Color lbOColor =new Color(255, 0, 0, 128);
            this.add(lbO);

            JLabel lbL = new JLabel("L");
            lbL.setBounds(500, 100, 100, 100);
            Color lbLColor =new Color(255, 0, 0, 128);
            this.add(lbL);






        }
        tfLetra = new JTextField();
        tfLetra.setBounds(150,110,100, 25);
        this.add(tfLetra);
        



    }



    


    
}