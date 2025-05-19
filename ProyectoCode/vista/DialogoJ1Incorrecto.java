package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DialogoJ1Incorrecto extends JDialog implements ActionListener
{
    //atributos
   
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

      

        lbxd= new JLabel("INCORRECTO");
        lbxd.setHorizontalAlignment(JLabel.CENTER);
        lbxd.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        lbxd.setBounds(75,10,200,80);
        Color negro =new Color(0,0,0);
        lbxd.setForeground(negro);
        add(lbxd);
        
        btContinuar = new JButton("DE NUEVO");
        btContinuar.setBounds(75,120,200,25);
        btContinuar.setActionCommand("continuarJ2");
        btContinuar.setFont(new Font("Gill Sans MT", Font.BOLD, 20));;
        Color morado =new Color(220,51,209);
        btContinuar.setBackground(morado);
        this.add(btContinuar);        
        btContinuar.addActionListener(this);

        btSalir = new JButton("MENU");
        btSalir.setBounds(75,180,200,25);
        btSalir.setActionCommand("SalirJ2");
        btSalir.setFont(new Font("Gill Sans MT", Font.BOLD, 20));;
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


