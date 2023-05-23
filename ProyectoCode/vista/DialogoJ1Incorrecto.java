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

public class DialogoJ1Incorrecto extends JDialog implements ActionListener
{
    //atributo
   
    private JLabel lbxd;
    public Jugar2 miJugar2 =null;
    public Jugar1 miJugar1 =null;
    
    private JButton btContinuar;
    private JButton btSalir;
    public DialogoJ1Incorrecto()
    {
        this.setLayout(null);

        //Caracteristicas de la ventana
        this.setTitle("Dialogo");
        this.setSize(350,350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

      

        lbxd= new JLabel("PERDISTE :( ");
        lbxd.setFont(new Font("Arial", Font.BOLD, 15));
        lbxd.setBounds(10,10,100,80);
        Color negro =new Color(0,0,0);
        lbxd.setForeground(negro);
        add(lbxd);
        
        btContinuar = new JButton("continuar");
        btContinuar.setBounds(75,80,200,40);
        btContinuar.setActionCommand("continuarJ2");
        btContinuar.setFont(new Font("Arial", Font.BOLD, 20));;
        Color morado =new Color(220,51,209);
        btContinuar.setBackground(morado);
        this.add(btContinuar);        
        btContinuar.addActionListener(this);

        btSalir = new JButton("Salir");
        btSalir.setBounds(75,140,200,40);
        btSalir.setActionCommand("SalirJ1");
        btSalir.setFont(new Font("Arial", Font.BOLD, 20));;
        btSalir.setBackground(morado);
        this.add(btSalir);        
        btSalir.addActionListener(this);


        
    }
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btContinuar) 
        {
           miJugar1 = new Jugar1();
           this.dispose();
            
            
        }
        if (e.getSource()== btSalir)
        {
            this.dispose();
        }
        
        
    }
    
    
      
}


