package vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.Juego;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Jugar1 extends JDialog implements ActionListener
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btJugar1, btComprobar;
    private JLabel lbErrores;
    private JLabel lbImagen, lbInstrucciones, lbJuego1;
    private ImageIcon iImagen;
    private int contadorErrores;
    private JTextField tfLetra;
    private String palabraAleatoria;
    ArrayList<JLabel> cajas = new ArrayList<JLabel>();
    
    //----------------------
    // Metodos
    //----------------------
    public Jugar1()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Caracteristicas de la ventana
        this.setTitle("Juego1");
        this.setSize(900,556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        //palabra aleatoria
        Juego j1 = new Juego();
        palabraAleatoria = j1.getPalabraAleatoria();

        //LABEL INSTRUCCIONES
        lbInstrucciones = new JLabel("INGRESE UNA LETRA", JLabel.CENTER);
        lbInstrucciones.setFont(new Font("Gill Sans MT", Font.BOLD, 18));
        lbInstrucciones.setBounds(250, 219, 400, 40);
        this.add(lbInstrucciones);

        JLabel lbv = new JLabel("vvv", JLabel.CENTER);
        lbv.setFont(new Font("Gill Sans MT", Font.BOLD, 18));
        lbv.setBounds(400, 212, 100, 100);
        this.add(lbv);



        // crear el panel de texto
        tfLetra = new JTextField("", JLabel.CENTER);
        tfLetra.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        tfLetra.setBounds(400, 290, 100, 30);
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

        //label titulo
        lbJuego1= new JLabel("ADIVINA LA PALABRA");
        lbJuego1.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        lbJuego1.setBounds(90,10,400,100);
        this.add(lbJuego1);

        //label con contador de errores
        contadorErrores = 0;
        lbErrores = new JLabel("ERRORES: ");
        lbErrores.setFont(new Font("Gill Sans MT", Font.BOLD, 18));
        lbErrores.setBounds(40, 110, 150, 100);
        this.add(lbErrores);


        int p=140;
        for(int k=0;k<palabraAleatoria.length();k++)
        {
        JLabel j= new JLabel(Character.toString( palabraAleatoria.charAt(k)));
        j.setFont(new Font("Gill Sans MT", Font.BOLD, 18));
        j.setBounds(p, 90, 40, 40);
        j.setVisible(false);
        cajas.add(j);
        p=p+50;
        add(cajas.get(k));
        }

        int q=140;
        for(int k=0;k<palabraAleatoria.length();k++)
        {
        JLabel j= new JLabel("__");
        j.setBounds(q, 100, 40, 40);
        j.setVisible(true);
        q=q+50;
        add(j);
            
        }

        //creacion y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/Juego1.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,506);
        add(lbImagen);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btComprobar) 
        {
            


            for (int i = 0; i < palabraAleatoria.length(); i++)
            {
                if(tfLetra.getText().equals(cajas.get(i).getText()))
                {
                    cajas.get(i).setVisible(true);
                }

               

            }

            //SI LA PALABRA ESTA COMPLETA
            for (int j = 0;j<palabraAleatoria.length();j=j+1)
            {
                if(cajas.get(j).isVisible()==false)
                {
                    break;
                }
                if(j==palabraAleatoria.length()-1)
                {
                    DialogoJ1 dialogoJ1 = new DialogoJ1();
                    dialogoJ1.setVisible(true);
                    this.dispose();
                }
            }	

            //SI LA LETRA NO ESTA EN LA PALABRA
            if(palabraAleatoria.contains(tfLetra.getText())==false)
            {
                contadorErrores++;
                lbErrores.setText("ERRORES: "+contadorErrores);
            }
            tfLetra.setText("");

            if(contadorErrores>10)
            {
                
                DialogoJ1Incorrecto dialogoJ1Incorrecto = new DialogoJ1Incorrecto();
                dialogoJ1Incorrecto.setVisible(true);
                this.dispose();
            }
        }
    }
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btJugar1.addActionListener(pAL);
    }
}