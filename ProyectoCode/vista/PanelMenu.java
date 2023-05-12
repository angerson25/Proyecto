package vista;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.lang.ProcessBuilder.Redirect;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Transparency;


public class PanelMenu extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btJugar1;
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JLabel lbActividades;
    //----------------------
    // Metodos
    //----------------------
    public PanelMenu()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //creacion de los labels
        lbActividades= new JLabel("ACTIVIDADES",JLabel.RIGHT);
        lbActividades.setFont(new Font("Arial", Font.BOLD, 35));
        lbActividades.setBounds(300,90,250,40);
        Color blanco =new Color(255,255,255);
        lbActividades.setForeground(blanco);
        add(lbActividades);

        //creacion boton jugar1
        btJugar1 = new JButton("Jugar");
        btJugar1.setBounds(50,430,170,50); 
        btJugar1.setActionCommand("jugar");
        btJugar1.setBackground(blanco);
        this.add(btJugar1);

        //creacion y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/panelMenu.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,506);
        add(lbImagen);

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