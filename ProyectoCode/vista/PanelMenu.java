package vista;
import java.awt.Color;
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
        btJugar1 = new JButton("Jugar");
        btJugar1.setBounds(50,430,170,50); 
        btJugar1.setActionCommand("jugar");
        Color blanco =new Color(255,255,255);
        btJugar1.setBackground(blanco);
        this.add(btJugar1);

        //Caracteristicas de la ventana
        this.setTitle("menu");
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