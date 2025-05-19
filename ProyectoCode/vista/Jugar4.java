//importamos todos los paquetes para el juego
package vista;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import modelo.Juego;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;



public class Jugar4 extends JDialog implements ActionListener
{
    //---------------------
    // Atributos
    //----------------------
  
    private JLabel lbImagen,lbImagenAleatoria, lbInstrucciones, lbJuego4;
    private ImageIcon iImagen,iImagenAleatoria;
 
    private String palabraAleatoria;
    private JButton bt1;
    private JButton lista[] = new JButton[5];
    ArrayList<String> imagen = new ArrayList<>();
    
    //----------------------
    // Metodos
    //----------------------
    public Jugar4()
    {
        //caracteristicas de la ventana
        Juego j4 = new Juego("Identifique imagen");
        this.setLayout(null);
        this.setTitle(j4.getNombre());
        this.setSize(j4.getWidth(),j4.getHeight());
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        
       //Tomamos palabra aleatoria y imagen random
        palabraAleatoria = j4.getImagenAleatoria();
       

        // Agregamos la imagen random
        iImagenAleatoria = new ImageIcon(getClass().getResource("/vista/img/"+palabraAleatoria+".png"));
        lbImagenAleatoria= new JLabel(iImagenAleatoria);
        lbImagenAleatoria.setBounds(386,170,128,128);
        add(lbImagenAleatoria);
        j4.reordenarMatriz();

        //poner botones random
        for(int k=0 ,p=50;k<5;k++)
        {
        
        String palabraRandom = j4.getPalabraRandom(k);
        bt1 = new JButton(palabraRandom);
        bt1.setFont(new Font("Gill Sans MT", Font.BOLD, 13));
        bt1.setBounds(p,430,150,50); 
        lista[k]=bt1;
        lista[k].addActionListener(this);
        add(lista[k]);
        p=p+160;
        }

        //label titulo
        lbJuego4= new JLabel("IDENTIFICA LA IMAGEN");
        lbJuego4.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        lbJuego4.setBounds(90,10,400,100);
        this.add(lbJuego4);
                
        //Creacion del label informacion
        lbInstrucciones = new JLabel("SELECCIONE LA PALABRA QUE REPRESENTA LA IMAGEN", JLabel.CENTER);
        lbInstrucciones.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        lbInstrucciones.setBounds(50,350,800,100);
        this.add(lbInstrucciones);

        

        //creacion y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/img/Juego1.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(0,0,900,506);
        add(lbImagen);





        

    }

    //Control de acciones para los botones 
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