package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.Juego;
import java.awt.Color;
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
    private JLabel lb14, lbErrores;
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

        // crear el panel de texto
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

        //label con contador de errores
        //crear contador de errores
        contadorErrores = 0;
        lbErrores = new JLabel("Errores: ");
        lbErrores.setBounds(10, 10, 100, 100);
        this.add(lbErrores);


        int p=140;
        for(int k=0;k<palabraAleatoria.length();k++)
        {
        JLabel j= new JLabel(Character.toString( palabraAleatoria.charAt(k)));
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
                lbErrores.setText("Errores: "+contadorErrores);
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