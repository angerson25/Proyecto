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
            JLabel lb1 = new JLabel("A");
            lb1.setBounds(250, 100, 100, 100); 
            this.add(lb1);
            JLabel linea1 = new JLabel("__");
            linea1.setBounds(243, 101, 100, 100);
            this.add(linea1);


            JLabel lb2 = new JLabel("R");
            lb2.setBounds(350, 100, 100, 100);
            this.add(lb2);
            JLabel linea2 = new JLabel("__");
            linea2.setBounds(343, 101, 100, 100);
            this.add(linea2);

            JLabel lb3 = new JLabel("B");
            lb3.setBounds(450, 100, 100, 100);
            this.add(lb3);
            JLabel linea3 = new JLabel("__");
            linea3.setBounds(443, 101, 100, 100);
            this.add(linea3);

            JLabel lb4 = new JLabel("O");
            lb4.setBounds(550, 100, 100, 100);
            this.add(lb4);
            JLabel linea4 = new JLabel("__");
            linea4.setBounds(543, 101, 100, 100);
            this.add(linea4);

            JLabel lb5 = new JLabel("L");
            lb5.setBounds(650, 100, 100, 100);
            this.add(lb5);
            JLabel linea5 = new JLabel("__");
            linea5.setBounds(643, 101, 100, 100);
            this.add(linea5);

        }

        // Crear los labels y agregarlos al panel
        if (palabraAleatoria.equals("CASA")){
            JLabel lb6 = new JLabel("C");
            lb6.setBounds(300, 100, 100, 100);
            this.add(lb6);
            JLabel linea6 = new JLabel("__");
            linea6.setBounds(293, 101, 100, 100);
            this.add(linea6);

            JLabel lb7 = new JLabel("A");
            lb7.setBounds(400, 100, 100, 100);
            this.add(lb7);
            JLabel linea7 = new JLabel("__");
            linea7.setBounds(393, 101, 100, 100);
            this.add(linea7);

            JLabel lb8 = new JLabel("S");
            lb8.setBounds(500, 100, 100, 100);
            this.add(lb8);
            JLabel linea8 = new JLabel("__");
            linea8.setBounds(493, 101, 100, 100);
            this.add(linea8);

            JLabel lbA9 = new JLabel("A");
            lbA9.setBounds(600, 100, 100, 100);
            this.add(lbA9);
            JLabel linea9 = new JLabel("__");
            linea9.setBounds(593, 101, 100, 100);
            this.add(linea9);

        }
        
        // Crear los labels y agregarlos al panel
        if (palabraAleatoria.equals("LAPICERO")){
            JLabel lb6 = new JLabel("L");
            lb6.setBounds(56, 100, 100, 75);
            this.add(lb6);
            JLabel linea6 = new JLabel("__");
            linea6.setBounds(49, 101, 100, 100);
            this.add(linea6);

            JLabel lb7 = new JLabel("A");
            lb7.setBounds(168, 100, 100, 75);
            this.add(lb7);
            JLabel linea7 = new JLabel("__");
            linea7.setBounds(161, 101, 100, 100);
            this.add(linea7);

            JLabel lb8 = new JLabel("P");
            lb8.setBounds(280, 100, 100, 75);
            this.add(lb8);
            JLabel linea8 = new JLabel("__");
            linea8.setBounds(273, 101, 100, 100);
            this.add(linea8);

            JLabel lb9 = new JLabel("I");
            lb9.setBounds(392, 100, 100, 75);
            this.add(lb9);
            JLabel linea9 = new JLabel("__");
            linea9.setBounds(385, 101, 100, 100);
            this.add(linea9);

            JLabel lb10 = new JLabel("C");
            lb10.setBounds(504, 100, 100, 75);
            this.add(lb10);
            JLabel linea10 = new JLabel("__");
            linea10.setBounds(497, 101, 100, 100);
            this.add(linea10);

            JLabel lb11 = new JLabel("E");
            lb11.setBounds(616, 100, 100, 75);
            this.add(lb11);
            JLabel linea11 = new JLabel("__");
            linea11.setBounds(609, 101, 100, 100);
            this.add(linea11);

            JLabel lb12 = new JLabel("R");
            lb12.setBounds(728, 100, 100, 75);
            this.add(lb12);
            JLabel linea12 = new JLabel("__");
            linea12.setBounds(721, 101, 100, 100);
            this.add(linea12);

            JLabel lb13 = new JLabel("O");
            lb13.setBounds(840, 100, 100, 75);
            this.add(lb13);
            JLabel linea13 = new JLabel("__");
            linea13.setBounds(833, 101, 100, 100);
            this.add(linea13);

            }

            // Crear los labels y agregarlos al panel
        if (palabraAleatoria.equals("MOTO")){
            JLabel lb14 = new JLabel("M");
            lb14.setBounds(300, 100, 100, 100);
            this.add(lb14);
            JLabel linea14 = new JLabel("__");
            linea14.setBounds(293, 101, 100, 100);
            this.add(linea14);

            JLabel lb15 = new JLabel("O");
            lb15.setBounds(400, 100, 100, 100);
            this.add(lb15);
            JLabel linea15 = new JLabel("__");
            linea15.setBounds(393, 101, 100, 100);
            this.add(linea15);

            JLabel lb16 = new JLabel("T");
            lb16.setBounds(500, 100, 100, 100);
            this.add(lb16);
            JLabel linea16 = new JLabel("__");
            linea16.setBounds(493, 101, 100, 100);
            this.add(linea16);

            JLabel lb17 = new JLabel("O"); 
            lb17.setBounds(600, 100, 100, 100);
            this.add(lb17);
            JLabel linea17 = new JLabel("__");
            linea17.setBounds(593, 101, 100, 100);
            this.add(linea17);

        }

        if (palabraAleatoria.equals("NAVIDAD"))
        {
            JLabel lb18 = new JLabel("N");
            lb18.setBounds(150, 100, 100, 100);
            this.add(lb18);
            JLabel linea18 = new JLabel("__");
            linea18.setBounds(143, 101, 100, 100);
            this.add(linea18);

            JLabel lb19 = new JLabel("A");
            lb19.setBounds(250, 100, 100, 100);
            this.add(lb19);
            JLabel linea19 = new JLabel("__");
            linea19.setBounds(243, 101, 100, 100);
            this.add(linea19);

            JLabel lb20 = new JLabel("V");
            lb20.setBounds(350, 100, 100, 100);
            this.add(lb20);
            JLabel linea20 = new JLabel("__");
            linea20.setBounds(343, 101, 100, 100);
            this.add(linea20);

            JLabel lb21 = new JLabel("I");
            lb21.setBounds(450, 100, 100, 100);
            this.add(lb21);
            JLabel linea21 = new JLabel("__");
            linea21.setBounds(443, 101, 100, 100);
            this.add(linea21);
            
            JLabel lb22 = new JLabel("D");
            lb22.setBounds(550, 100, 100, 100);
            this.add(lb22);
            JLabel linea22 = new JLabel("__");
            linea22.setBounds(543, 101, 100, 100);
            this.add(linea22);

            JLabel lb23 = new JLabel("A");
            lb23.setBounds(650, 100, 100, 100);
            this.add(lb23);
            JLabel linea23 = new JLabel("__");
            linea23.setBounds(643, 101, 100, 100);
            this.add(linea23);

            JLabel lb24 = new JLabel("D");
            lb24.setBounds(750, 100, 100, 100);
            this.add(lb24);
            JLabel linea24 = new JLabel("__");
            linea24.setBounds(743, 101, 100, 100);
            this.add(linea24);


        }

        
        tfLetra = new JTextField();
        tfLetra.setBounds(400,300,100, 25);
        this.add(tfLetra);
        



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