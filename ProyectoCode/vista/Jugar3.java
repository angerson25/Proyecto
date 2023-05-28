package vista;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Jugar3 extends JDialog implements ActionListener
{
    //----------------------
    // Atributos
    //----------------------
    Random random = new Random();
    private JButton btJugar1, btComprobar,btñ;
    public DialogoJ3 miDialogoJ3 =null;
    private JButton matriz[][] = new JButton[10][10];
    private ImageIcon iImagen;
    private JLabel lbImagen, lbPista;
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

        //creacion y adicion de label pista
        lbPista= new JLabel("PISTA » ");
        lbPista.setFont(new Font("Arial", Font.BOLD, 20));
        Color blanco =new Color(255,255,255);
        lbPista.setForeground(blanco);
        lbPista.setBounds(620,160,600,40);
        add(lbPista);
        
        //crear matriz
        
        
        Random random = new Random();
        int v = random.nextInt(5);
        
        int x = random.nextInt(10);
        int y = random.nextInt(10);

        

        //mostrar la matriz
    if(v==0)
    {
        for(int k=0,u=90;k<10;k++)
        {
            
            for(int h=0,l=40;h<10;h++)
            {
            btñ = new JButton("m");
            btñ.setBounds(l,u,50,40); 
            btñ.setFont(new Font("Arial", Font.BOLD, 12));
            matriz[k][h]=btñ;
            add(matriz[k][h]);

            l=l+51;
            
            }
            u=u+41;
        }
        
        

        matriz[x][y].setText("n");
        lbPista.setText("PISTA » n");
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
        lbPista.setText("PISTA » U");
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
        lbPista.setText("PISTA » :)");
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
        lbPista.setText("PISTA » n");
    }

    if(v==4)
    {
        for(int k=0,u=90;k<10;k++)
        {
            
            for(int h=0,l=40;h<10;h++)
            {
            JButton btñ = new JButton("q");
            btñ.setBounds(l,u,50,40); 
            btñ.setFont(new Font("Arial", Font.BOLD, 12));
            matriz[k][h]=btñ;
            add(matriz[k][h]);

            l=l+51;
            
            }
            u=u+41;
        }
        
        
        

        matriz[x][y].setText("p");
        lbPista.setText("PISTA » p");


    }
    btComprobar =matriz[x][y];
    btComprobar.addActionListener(this);
    
    //creacion y adicion de label titulo
    JLabel lbJuego3= new JLabel("ENCUENTRA EL CARACTER DIFERENTE");
    lbJuego3.setFont(new Font("Arial", Font.BOLD, 22));
    lbJuego3.setBounds(40,28,600,40);
    add(lbJuego3);




        

       
    //creacion y adicion de la imagen
    iImagen = new ImageIcon(getClass().getResource("/vista/Juego3.png"));
    lbImagen= new JLabel(iImagen);
    lbImagen.setBounds(0,0,900,506);
    add(lbImagen);

        
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