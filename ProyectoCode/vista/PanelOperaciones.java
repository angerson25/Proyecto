package vista;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    private JLabel lbImagen;
    private ImageIcon iImagen;
    private JButton btEntrar;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelOperaciones()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);

        //creacion y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/PantallaPrincipal.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,506);
        add(lbImagen);
        //Boton Entrar 
        btEntrar = new JButton("Entrar");
        btEntrar.setBounds(50,430,170,50); 
        btEntrar.setActionCommand("Entrar");
        Color purpura =new Color(155,175,175);
        btEntrar.setBackground(purpura);
        this.add(btEntrar);

        
    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
       btEntrar.addActionListener(pAL);
    }

    
}