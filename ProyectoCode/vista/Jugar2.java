//importamos todos los paquetes necesarios para el juego
package vista;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.Juego;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.ImageIcon;
public class Jugar2 extends JDialog implements ActionListener 
{

    //----------------------
    // Atributos
    //---------------------
    private JLabel lbJuego2, lbImagen;
    private ImageIcon iImagen;
    private JButton btComprobar;
    private JTextField tfLetra;
    private JLabel lbPalabraInvertida, lbPalabraInvertida1;
    private JLabel lbArreglaPalabra;
    public DialogoJ2 miDialogoJ2 =null;
    public DIalogoJ2Incorrecto miDialogoJ2Incorrecto;
    private String palabraInvertida;
    private String palabraAleatoria;
    //----------------------
    // Metodos
    //----------------------
    
    public Jugar2()
    {
        
        //Caracteristicas de la ventana

        this.setLayout(null);
        Juego j2 = new Juego("invertirPalabra");
        this.setTitle(j2.getNombre());
        this.setSize(j2.getWidth(),j2.getHeight());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        // Tomamos palabra aleatoria y la invertimos
        palabraAleatoria = j2.getPalabraAleatoria();
        palabraInvertida = j2.invertirPalabra();

        //label titulo
        lbJuego2= new JLabel("ARREGLAR LA PALABRA");
        lbJuego2.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        lbJuego2.setBounds(50,28,600,40);
        Color blanco =new Color(255,255,255);
        add(lbJuego2);

        //label Palabra invertida
        lbPalabraInvertida= new JLabel("PALABRA INVERTIDA » ");
        lbPalabraInvertida.setFont(new Font("Gill Sans MT", Font.BOLD, 30));
        lbPalabraInvertida.setBounds(40,190,650,40);
        lbPalabraInvertida.setForeground(blanco);
        add(lbPalabraInvertida);

        //label palabra aleatoria
        lbPalabraInvertida1= new JLabel(palabraInvertida);
        lbPalabraInvertida1.setFont(new Font("Gill Sans MT", Font.BOLD, 30));
        lbPalabraInvertida1.setBounds(460,190,300,40);
        lbPalabraInvertida1.setForeground(blanco);
        add(lbPalabraInvertida1);

        //label arreglar palabra
        lbArreglaPalabra= new JLabel("ARREGLA LA PALABRA »");
        lbArreglaPalabra.setFont(new Font("Gill Sans MT", Font.BOLD, 22));
        lbArreglaPalabra.setBounds(40,290,350,40);
        lbArreglaPalabra.setForeground(blanco);
        add(lbArreglaPalabra);

        //caja de texto palabra arreglada
        tfLetra = new JTextField("");
        tfLetra.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        tfLetra.setBounds(350, 295, 200, 30);
        add(tfLetra);
        
        //Boton comprobar 
        btComprobar = new JButton("COMPROBAR");
        btComprobar.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
        btComprobar.setBounds(365,350,170,40); 
        btComprobar.setActionCommand("comprobarJ2");
        Color morado =new Color(220,51,209);
        btComprobar.setBackground(morado);
        this.add(btComprobar);
        btComprobar.addActionListener(this);


        //creacion y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/img/Juego2.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,506);
        add(lbImagen);


        

    }

    
    //control de acciones para los botones
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btComprobar) 
        {
            String g;
            g= tfLetra.getText();
            
            if(g.equals(palabraAleatoria))
            {
                
                miDialogoJ2 = new DialogoJ2();
                this.dispose();
                
            }
            else
            {
                miDialogoJ2Incorrecto = new DIalogoJ2Incorrecto();
                this.dispose();
            }
            
            
        }
    }
        
        



    
    

    public String getPalabra()
    {
        return (String) tfLetra.getText();
    }
   
    





    
}


    


    

