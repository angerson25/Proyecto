//importamos paquetes para el dialogo
package vista;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class DialogoJ1 extends JDialog implements ActionListener
{
    //atributos
   
    private JLabel lbImagen;
    private ImageIcon iImagen;
    public Jugar1 miJugar1 =null;
    private JButton btContinuar;
    private JButton btSalir;


    public DialogoJ1()
    {
        this.setLayout(null);

        //Caracteristicas de la ventana
        this.setTitle("Dialogo");
        this.setSize(350,350);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);

      
        //creacion de boton Continuar
        btContinuar = new JButton("DE NUEVO");
        btContinuar.setBounds(75,190,200,25);
        btContinuar.setActionCommand("continuarJ2");
        btContinuar.setFont(new Font("Gill Sans MT", Font.BOLD, 20));;
        Color morado =new Color(220,51,209);
        btContinuar.setBackground(morado);
        this.add(btContinuar);        
        btContinuar.addActionListener(this);
        
        //creacion de boton salir
        btSalir = new JButton("MENU");
        btSalir.setBounds(75,220,200,25);
        btSalir.setActionCommand("SalirJ2");
        btSalir.setFont(new Font("Gill Sans MT", Font.BOLD, 20));;
        btSalir.setBackground(morado);
        this.add(btSalir);        
        btSalir.addActionListener(this);

        //creacion y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("/vista/img/win.png"));
        lbImagen= new JLabel(iImagen);
        lbImagen.setBounds(125,55,100,100);
        add(lbImagen);


        
    }
    //Control de acciones para los botones 
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
