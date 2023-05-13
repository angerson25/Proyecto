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

public class DialogoJ2 extends JDialog
{
    //atributos
    private VentanaPrincipal venPrin;
    public DialogoJ2()
    {
        this.setLayout(null);

        //Caracteristicas de la ventana
        this.setTitle("Dialogo");
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        String palabra = venPrin.miJugar2.getPalabra();

        
        
        


        
    }
}
