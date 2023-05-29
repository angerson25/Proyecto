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
import java.util.Collections;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Jugar4 extends JDialog implements ActionListener
{
    //----------------------
    // Atributos
    //----------------------
    private JButton btJugar1, btComprobar;
    private JLabel lbErrores;
    private JLabel lbImagen,lbImagenAleatoria, lbInstrucciones, lbJuego1;
    private ImageIcon iImagen,iImagenAleatoria;
    private int contadorErrores;
    private JTextField tfLetra;
    private String palabraAleatoria;
    private JButton bt1,btRta;
    private String imagenAleatoria;
    private JButton lista[] = new JButton[5];
    ArrayList<String> imagen = new ArrayList<>();
    
    //----------------------
    // Metodos
    //----------------------
    public Jugar4()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Caracteristicas de la ventana
        this.setTitle("Juego4");
        this.setSize(900,556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        imagen.add("CARRO");
        imagen.add("LAPIZ");
        imagen.add("FRUTA");
        imagen.add("BOTELLA");
        imagen.add("MOTO");
      
        Collections.shuffle(imagen);
        Random rand = new Random();
        palabraAleatoria = imagen.get(rand.nextInt(imagen.size()));
       


        iImagenAleatoria = new ImageIcon(getClass().getResource("/vista/"+palabraAleatoria+".png"));
        lbImagenAleatoria= new JLabel(iImagenAleatoria);
        lbImagenAleatoria.setBounds(386,170,128,128);
        add(lbImagenAleatoria);
        
        for(int k=0 ,p=50;k<imagen.size();k++)
        {
        String palabraAleatoriabt = imagen.get(k);
        bt1 = new JButton(palabraAleatoriabt);
        bt1.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
        bt1.setBounds(p,430,150,50); 
        lista[k]=bt1;
        lista[k].addActionListener(this);
        add(lista[k]);
        p=p+160;
        }

        

        //creacion y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/Juego1.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,506);
        add(lbImagen);



        

    }

    //metodo para el boton jugar
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == lista[0]) 
        {
            if(lista[0].getText()==palabraAleatoria)
            {
            DialogoJ4 dialogoJ4 = new DialogoJ4();
            dialogoJ4.setVisible(true);

            this.dispose();
            }
            else
            {
                DialogoJ4Incorrecto dialogoJ1Incorrecto = new DialogoJ4Incorrecto();
                dialogoJ1Incorrecto.setVisible(true);
                this.dispose();
            }  
        }
        if (e.getSource() == lista[1]) 
        {
            if(lista[1].getText()==palabraAleatoria)
            {
            DialogoJ4 dialogoJ4 = new DialogoJ4();
            dialogoJ4.setVisible(true);

            this.dispose();
            }
            else
            {
                DialogoJ4Incorrecto dialogoJ1Incorrecto = new DialogoJ4Incorrecto();
                dialogoJ1Incorrecto.setVisible(true);
                this.dispose();
            }  
        }
        if (e.getSource() == lista[2]) 
        {
            if(lista[2].getText()==palabraAleatoria)
            {
                DialogoJ4 dialogoJ4 = new DialogoJ4();
                dialogoJ4.setVisible(true);
    
                this.dispose();
                }
                else
                {
                    DialogoJ4Incorrecto dialogoJ1Incorrecto = new DialogoJ4Incorrecto();
                    dialogoJ1Incorrecto.setVisible(true);
                    this.dispose();
                }  
        }
        if (e.getSource() == lista[3]) 
        {
            if(lista[3].getText()==palabraAleatoria)
            {
                DialogoJ4 dialogoJ4 = new DialogoJ4();
                dialogoJ4.setVisible(true);
    
                this.dispose();
                }
                else
                {
                    DialogoJ4Incorrecto dialogoJ1Incorrecto = new DialogoJ4Incorrecto();
                    dialogoJ1Incorrecto.setVisible(true);
                    this.dispose();
                }  
        }
        if (e.getSource() == lista[4]) 
        {
            if(lista[4].getText()==palabraAleatoria)
            {
                DialogoJ4 dialogoJ4 = new DialogoJ4();
                dialogoJ4.setVisible(true);
    
                this.dispose();
                }
                else
                {
                    DialogoJ4Incorrecto dialogoJ1Incorrecto = new DialogoJ4Incorrecto();
                    dialogoJ1Incorrecto.setVisible(true);
                    this.dispose();
                }  
        }
        
        
        
    }

    
    
}