package vista;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Jugar3 extends JDialog implements ActionListener
{
    //----------------------
    // Atributos
    //----------------------
    Random random = new Random();
    private JButton btJugar1, btComprobar,btñ;
    public DialogoJ3 miDialogoJ3 =null;
    private JLabel lb14, lbErrores;
    private JButton matriz[][] = new JButton[10][10];
    private int contadorErrores;
    private JTextField tfLetra;
    private String palabraAleatoria;
    private int x = random.nextInt(10);
    private int y = random.nextInt(10);
    ArrayList<JLabel> cajas = new ArrayList<JLabel>();
    
    //----------------------
    // Metodos
    //----------------------
    public Jugar3()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Caracteristicas de la ventana
        this.setTitle("Juego3");
        this.setSize(900,556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
        //crear matriz
        
        
        Random random = new Random();
        int v = random.nextInt(4);
        
        int x = random.nextInt(10);
        int y = random.nextInt(10);

        //mostrar la matriz
    if(v==0)
    {
        for(int k=0,u=90;k<10;k++)
        {
            
            for(int h=0,l=40;h<10;h++)
            {
            btñ = new JButton("M");
            btñ.setBounds(l,u,50,40); 
            btñ.setFont(new Font("Arial", Font.BOLD, 12));
            matriz[k][h]=btñ;
            add(matriz[k][h]);

            l=l+51;
            
            }
            u=u+41;
        }
        
        

        matriz[x][y].setText("N");
    }
    if(v==1)
    {
        for(int k=0,u=90;k<10;k++)
        {
            
            for(int h=0,l=40;h<10;h++)
            {
            JButton btñ = new JButton("V");
            btñ.setBounds(l,u,50,40); 
            btñ.setFont(new Font("Arial", Font.BOLD, 12));
            matriz[k][h]=btñ;
            add(matriz[k][h]);
            matriz[k][h].addActionListener(this);

            l=l+51;
            
            }
            u=u+41;
        }
        
        
        matriz[x][y].setText("U");
    }
    if(v==2)
    {
        for(int k=0,u=90;k<10;k++)
        {
            
            for(int h=0,l=40;h<10;h++)
            {
            JButton btñ = new JButton(":(");
            btñ.setBounds(l,u,50,40); 
            btñ.setFont(new Font("Arial", Font.BOLD, 12));
            matriz[k][h]=btñ;
            add(matriz[k][h]);

            l=l+51;
            
            }
            u=u+41;
        }
        
        
        

        matriz[x][y].setText(":)");
    }
    if(v==3)
    {
        for(int k=0,u=90;k<10;k++)
        {
            
            for(int h=0,l=40;h<10;h++)
            {
            JButton btñ = new JButton("h");
            btñ.setBounds(l,u,50,40); 
            btñ.setFont(new Font("Arial", Font.BOLD, 12));
            matriz[k][h]=btñ;
            add(matriz[k][h]);

            l=l+51;
            
            }
            u=u+41;
        }
        
        
        

        matriz[x][y].setText("n");
    }
    btComprobar =matriz[x][y];
    btComprobar.addActionListener(this);
    

        

       
        

        
    }
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btComprobar) 
        {
            
            miDialogoJ3 = new DialogoJ3();
            this.dispose();
            
            
        }
        this.dispose();
    }

  
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btJugar1.addActionListener(pAL);
    }
}