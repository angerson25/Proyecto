package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


public class PanelMenu extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btJugar1;

    //----------------------
    // Metodos
    //----------------------
    public PanelMenu()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //creacion boton jugar1
        JButton btJugar1 = new JButton("Jugar");
        btJugar1.setBounds(50,50,170,50);
        this.add(btJugar1);
        btJugar1.setActionCommand("jugar1");

        //Caracteristicas de la ventana
        this.setTitle("Aplicacion para personas con Dislexia");
        this.setSize(900,556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }



    public void agregarOyenteBoton(ActionListener pAL)
    {
        btJugar1.addActionListener(pAL);
    }

    
}