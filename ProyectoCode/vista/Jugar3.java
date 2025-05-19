//importamos todos los paquetes nesesarios para el juego
package vista;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.Juego;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Jugar3 extends JDialog implements ActionListener
{
    //---------------------
    // Atributos
    //----------------------
    Random random = new Random();
    private JButton btJugar1,btñ;
    public DialogoJ3 miDialogoJ3 =null;
    private JButton matriz[][] = new JButton[10][10];
    private ImageIcon iImagen;
    private JLabel lbImagen, lbPista;
    ArrayList<JLabel> cajas = new ArrayList<JLabel>();
    private int x,y;
    private String caracter,caracterDiferente;
    
    //----------------------
    // Metodos
    //----------------------
    public Jugar3()
    {
        //Caracteristicas de la ventana
        Juego j3 = new Juego("Encontrar el caracter difetente");
        this.setLayout(null);
        this.setTitle(j3.getNombre());
        this.setSize(j3.getWidth(),j3.getHeight());
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
        
        // Tomamos dos numeros random 
        x = j3.getNumeroRandom();
        y = j3.getNumeroRandom();

        // Tomamos el caracter y el caracter diferente
        caracter = j3.getCaracterRandom();
        caracterDiferente = j3.getCaracterDiferente();

        //Creamos matriz
        for(int k=0,u=90;k<10;k++)
        {
            
            for(int h=0,l=40;h<10;h++)
            {
            btñ = new JButton(caracter);
            btñ.setBounds(l,u,50,40); 
            btñ.setFont(new Font("Arial", Font.BOLD, 12));
            matriz[k][h]=btñ;
            matriz[k][h].addActionListener(this);
            add(matriz[k][h]);

            l=l+51;
            
            }
            u=u+41;
        }
        
        
        // Tonemos el caracter diferente en una pocision aleatoria
        matriz[x][y].setText(caracterDiferente);
        lbPista.setText("PISTA » "+caracterDiferente);
    
    
    //creacion y adicion de label titulo
    JLabel lbJuego3= new JLabel("ENCUENTRA EL CARACTER DIFERENTE");
    lbJuego3.setFont(new Font("Arial", Font.BOLD, 22));
    lbJuego3.setBounds(40,28,600,40);
    add(lbJuego3);



       
    //creacion y adicion de la imagen
    iImagen = new ImageIcon(getClass().getResource("/vista/img/Juego3.png"));
    lbImagen= new JLabel(iImagen);
    lbImagen.setBounds(0,0,900,506);
    add(lbImagen);

        
    }
    //Control de acciones para los botones 
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == matriz[x][y]) 
        {
            
            miDialogoJ3 = new DialogoJ3();
            this.dispose();
            
            
        }
        if(e.getSource()!= matriz[x][y])
        {
            JOptionPane.showMessageDialog(null,"Sigue intentando");
            
        }
        
    }

  
    
    public void agregarOyentesBotones(ActionListener pAL)
    {
        btJugar1.addActionListener(pAL);
    }
}