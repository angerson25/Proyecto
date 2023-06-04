package vista;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.Font;


public class PanelMenu extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btJugar1;
    private JButton btJugar2,btJugar3, btJugar4;
    private JLabel lbImagen, lbAhorcado, lbArreglar, lbCaracteres, lbIdentificar;
    private ImageIcon iImagen, ahorcado, iArreglar, iCaracteres, iIdentificar;
    private JLabel lbActividades;
    //----------------------
    // Metodos
    //----------------------
    public PanelMenu()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //creacion de los labels
        lbActividades= new JLabel("ACTIVIDADES",JLabel.CENTER);
        lbActividades.setFont(new Font("Gill Sans MT", Font.BOLD, 35));
        lbActividades.setBounds(300,20,300,40);
        Color blanco =new Color(255,255,255);
        lbActividades.setForeground(blanco);
        add(lbActividades);

        //creacion boton jugar1
        btJugar1 = new JButton("JUGAR");
        btJugar1.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
        btJugar1.setBounds(50,430,170,50); 
        btJugar1.setActionCommand("jugar1");
        btJugar1.setBackground(blanco);
        this.add(btJugar1);

        //añadir imagen ahorcado
        ahorcado = new ImageIcon(getClass().getResource("/vista/img/ahorcado.png"));
        lbAhorcado = new JLabel(ahorcado);
        lbAhorcado.setBounds(50,150,170,170);
        add(lbAhorcado);




        //creacion boton jugar2
        btJugar2 = new JButton("JUGAR");
        btJugar2.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
        btJugar2.setBounds(250,430,170,50); 
        btJugar2.setActionCommand("jugar2");
        btJugar2.setBackground(blanco);
        this.add(btJugar2);

        //añadir imagen segundo juego
        iArreglar = new ImageIcon(getClass().getResource("/vista/img/arreglar.png"));
        lbArreglar = new JLabel(iArreglar);
        lbArreglar.setBounds(250,150,170,170);
        add(lbArreglar);

        //creacion boton jugar3
        btJugar3 = new JButton("JUGAR");
        btJugar3.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
        btJugar3.setBounds(450,430,170,50);
        btJugar3.setActionCommand("jugar3");
        btJugar3.setBackground(blanco);
        this.add(btJugar3);

        //añadir imagen caracteres
        iCaracteres = new ImageIcon(getClass().getResource("/vista/img/caracteres.png"));
        lbCaracteres = new JLabel(iCaracteres);
        lbCaracteres.setBounds(450,150,170,170);
        add(lbCaracteres);

        //creacion boton jugar4
        btJugar4 = new JButton("JUGAR");
        btJugar4.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
        btJugar4.setBounds(650,430,170,50);
        btJugar4.setActionCommand("jugar4");
        btJugar4.setBackground(blanco);
        this.add(btJugar4);

        //añadir imagen identificar
        iIdentificar = new ImageIcon(getClass().getResource("/vista/img/identificar.png"));
        lbIdentificar = new JLabel(iIdentificar);
        lbIdentificar.setBounds(650,150,170,170);
        add(lbIdentificar);





        //creacion y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/img/panelMenu.png"));
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
        btJugar3.addActionListener(pAL);
        btJugar4.addActionListener(pAL);
    }

    
}