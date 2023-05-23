package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicHTML;

public class PanelEntrada extends JPanel
{
    //----------------------
    //Atributos
    //----------------------
    private JLabel lbImagen, lbAyuda, lbAyuda2, lbAyuda3;
    private ImageIcon iImagen;
    private JButton btEntrar;
    
    //----------------------
    //Metodos
    //----------------------
    
    //Constructor
    public PanelEntrada()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);





        
        //Boton Entrar 
        btEntrar = new JButton("Entrar");
        btEntrar.setBounds(50,430,170,50); 
        btEntrar.setActionCommand("entrar");
        Color morado =new Color(220,51,209);
        btEntrar.setBackground(morado);
        this.add(btEntrar);


        //crear label
        lbAyuda= new JLabel("A Y U D A    P A R A");
        lbAyuda.setFont(new Font("Arial", Font.BOLD, 40));
        lbAyuda.setBounds(60,150,470,50);
        Color blanco =new Color(255,255,255);
        lbAyuda.setForeground(blanco);
        add(lbAyuda);

        //crear label
        lbAyuda2= new JLabel("P E R S O N A S   C O N");
        lbAyuda2.setFont(new Font("Arial", Font.BOLD, 40));
        lbAyuda2.setBounds(54,190,470,50);
        lbAyuda2.setForeground(blanco);
        add(lbAyuda2);

        //crear label
        lbAyuda3= new JLabel("DISLEXIA");
        lbAyuda3.setFont(new Font("Arial", Font.BOLD, 100));
        lbAyuda3.setBounds(44,170,770,250);
        lbAyuda3.setForeground(blanco);
        add(lbAyuda3);

        //creacion y adicion de la imagen de fondo
        iImagen = new ImageIcon(getClass().getResource("/vista/PantallaPrincipal.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,506);
        add(lbImagen);



        
    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
       btEntrar.addActionListener(pAL);
    }

    
}