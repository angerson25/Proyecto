package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import vista.VentanaPrincipal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogoJ2 extends JDialog implements ActionListener
{
    //atributo
   
    private JLabel lbxd;
    public Jugar2 miJugar2 =null;
    
    private JButton btContinuar;
    public DialogoJ2()
    {
        this.setLayout(null);

        //Caracteristicas de la ventana
        this.setTitle("Dialogo");
        this.setSize(200,200);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

      

        lbxd= new JLabel("Hola");
        lbxd.setFont(new Font("Arial", Font.BOLD, 12));
        lbxd.setBounds(10,10,100,80);
        Color blanco =new Color(255,255,255);
        lbxd.setForeground(blanco);
        add(lbxd);
        
        btContinuar = new JButton("continuar");
        btContinuar.setBounds(10,80,50,40);
        btContinuar.setActionCommand("continuarJ2");
        Color morado =new Color(220,51,209);
        btContinuar.setBackground(morado);
        this.add(btContinuar);        
        btContinuar.addActionListener(this);


        
    }
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btContinuar) 
        {
           miJugar2 = new Jugar2();
           this.dispose();
            
            
        }
    }
    
    
    public void cerrarDialogo()
    {
        this.dispose();
    }   
}
