package vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Juego;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Jugar4 extends JDialog implements ActionListener
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btJugar1, btComprobar;
    private JLabel lbErrores;
    private JLabel lbImagen, lbInstrucciones, lbJuego1;
    private ImageIcon iImagen;
    private int contadorErrores;
    private JTextField tfLetra;
    private String palabraAleatoria;
    ArrayList<JLabel> cajas = new ArrayList<JLabel>();
    
    //----------------------
    // Metodos
    //----------------------
    public Jugar4()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Caracteristicas de la ventana
        this.setTitle("Juego4");
        this.setSize(900,556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        

        //creacion y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/Juego1.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,506);
        add(lbImagen);
    }

    //metodo para el boton jugar
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("Jugar1"))
        {
            //creacion y adicion de la imagen
            iImagen = new ImageIcon(getClass().getResource("/vista/Juego1.png"));
            lbImagen= new JLabel(iImagen);
            lbImagen.setBounds(0,0,900,506);
            add(lbImagen);
        }
    }

    
    
}