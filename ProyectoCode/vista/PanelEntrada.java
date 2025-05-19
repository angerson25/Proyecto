package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelEntrada extends JPanel
{
    //---------------------
    //Atributos
    //----------------------
    private JLabel lbImagen, lbAyuda, lbAyuda2;
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
        btEntrar = new JButton("ENTRAR");
        btEntrar.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        btEntrar.setBounds(50,430,170,50); 
        btEntrar.setActionCommand("entrar");
        Color morado =new Color(220,51,209);
        btEntrar.setBackground(morado);
        this.add(btEntrar);


        //crear label 
        lbAyuda= new JLabel("AYUDA PARA PERSONAS CON DISLEXIA");
        lbAyuda.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        lbAyuda.setBounds(60,280,470,50);
        Color blanco =new Color(255,255,255);
        lbAyuda.setForeground(blanco);
        add(lbAyuda);
       
        //crear label titulo
        lbAyuda2= new JLabel("DISLEXY");
        lbAyuda2.setFont(new Font("Gill Sans MT", Font.BOLD, 89));
        lbAyuda2.setBounds(54,190,470,80);
        lbAyuda2.setForeground(blanco);
        add(lbAyuda2);

        

        //creacion y adicion de la imagen de fondo
        iImagen = new ImageIcon(getClass().getResource("/vista/img/PantallaPrincipal.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,506);
        add(lbImagen);



        
    }
    public void agregarOyentesBotones(ActionListener pAL)
    {
       btEntrar.addActionListener(pAL);
    }

    
}