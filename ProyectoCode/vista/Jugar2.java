package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Juego;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Font;
import javax.swing.ImageIcon;
import modelo.Juego;

public class Jugar2 extends JDialog implements ActionListener 
{

    //----------------------
    // Atributos
    //----------------------
    private JLabel lbJuego2, lbImagen;
    private ImageIcon iImagen;
    private JButton btComprobar;
    private JTextField tfLetra;
    private JLabel lbPalabraInvertida;
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
        //Definición del layout del Dialogo
        this.setLayout(null);
        //array list
        Juego j2 = new Juego();
        palabraAleatoria = j2.getPalabraAleatoria();
        palabraInvertida = j2.invertirPalabra();

        //Caracteristicas de la ventana
        this.setTitle("Juego2");
        this.setSize(900,556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

        //label titulo
        lbJuego2= new JLabel("ARREGLAR LA PALABRA");
        lbJuego2.setFont(new Font("Arial", Font.BOLD, 35));
        lbJuego2.setBounds(210,50,600,40);
        Color blanco =new Color(255,255,255);
        lbJuego2.setForeground(blanco);
        add(lbJuego2);

        //label Palabra invertida
        lbPalabraInvertida= new JLabel("Palabra invertida : "+palabraInvertida);
        lbPalabraInvertida.setFont(new Font("Arial", Font.BOLD, 35));
        lbPalabraInvertida.setBounds(40,190,650,40);
        lbPalabraInvertida.setForeground(blanco);
        add(lbPalabraInvertida);

        //label arreglar palabra
        lbArreglaPalabra= new JLabel("Arregla la palabra  : ");
        lbArreglaPalabra.setFont(new Font("Arial", Font.BOLD, 35));
        lbArreglaPalabra.setBounds(40,290,350,40);
        lbArreglaPalabra.setForeground(blanco);
        add(lbArreglaPalabra);

        //caja de texto palabra arreglada
        tfLetra = new JTextField("");
        tfLetra.setFont(new Font("Arial", Font.BOLD, 20));
        tfLetra.setBounds(380, 290, 200, 40);
        add(tfLetra);
        
        //Boton comprobar 
        btComprobar = new JButton("Comprobar");
        btComprobar.setBounds(630,290,170,40); 
        btComprobar.setActionCommand("comprobarJ2");
        Color morado =new Color(220,51,209);
        btComprobar.setBackground(morado);
        this.add(btComprobar);
        btComprobar.addActionListener(this);

        //creacion y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/panelMenu.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,506);
        add(lbImagen);


        

    }

    

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


    


    

