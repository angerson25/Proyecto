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
    private JButton btJugar2;
    private JLabel lbImagen, lbAhorcado;
    private ImageIcon iImagen, ahorcado;
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
        lbActividades.setBounds(300,20,250,40);
        Color blanco =new Color(255,255,255);
        lbActividades.setForeground(blanco);
        add(lbActividades);

        //creacion boton jugar1
        btJugar1 = new JButton("Jugar");
        btJugar1.setBounds(50,430,170,50); 
        btJugar1.setActionCommand("jugar1");
        btJugar1.setBackground(blanco);
        this.add(btJugar1);

        //añadir imagen ahorcado
        ahorcado = new ImageIcon(getClass().getResource("/vista/ahorcado.png"));
        lbAhorcado = new JLabel(ahorcado);
        lbAhorcado.setBounds(10,150,170,170);
        add(lbAhorcado);




        //creacion boton jugar2
        btJugar2 = new JButton("Jugar");
        btJugar2.setBounds(250,430,170,50); 
        btJugar2.setActionCommand("jugar2");
        btJugar2.setBackground(blanco);
        this.add(btJugar2);

        //creacion boton jugar3
        JButton btJugar3 = new JButton("Jugar");
        btJugar3.setBounds(450,430,170,50);
        btJugar3.setActionCommand("jugar3");
        btJugar3.setBackground(blanco);
        this.add(btJugar3);

        //creacion boton jugar4
        JButton btJugar4 = new JButton("Jugar");
        btJugar4.setBounds(650,430,170,50);btJugar4.setActionCommand("jugar4");
        btJugar4.setBackground(blanco);
        this.add(btJugar4);







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
        btJugar2.addActionListener(pAL);
    }

    
}