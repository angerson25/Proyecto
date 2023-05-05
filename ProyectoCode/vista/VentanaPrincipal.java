package vista;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------------------
    //Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelEntrada miPanelEntrada;
    public PanelMenu miPanelMenu = null;
    
    private JLabel lbImagen;
    private ImageIcon iImagen;

    //-------------------------
    //Métodos
    //-------------------------
    
    //Metodo constructor
    public VentanaPrincipal()
    {
        //Definición del contenedor de la ventana
        setLayout(null);
        
        miPanelEntrada = new PanelEntrada();
        miPanelEntrada.setBounds(10,10,860,540);

        this.add(miPanelEntrada);
        
        
       
        
        //Caracteristicas de la ventana
        setTitle("Niños con dislexia");
        setSize(900,556);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        
    }
    //Crear menu
    public void crearMenu()
    {
        miPanelMenu = new PanelMenu();
    }
    
}