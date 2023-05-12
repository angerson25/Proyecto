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


public class Jugar2 extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btJugar2;
    private JTextField tfLetra;

    //----------------------
    // Metodos
    //----------------------
    public Jugar2()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);



        //Caracteristicas de la ventana
        this.setTitle("Juego2");
        this.setSize(900,556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        

        

        }
        
        



    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btJugar2.addActionListener(pAL);
    }


    


    
}