package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


public class Jugar1 extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btJugar1;

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
        
    }



    public void agregarOyentesBotones(ActionListener pAL)
    {
        btJugar1.addActionListener(pAL);
    }

    
}