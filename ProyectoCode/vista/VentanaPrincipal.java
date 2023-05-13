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
    public Jugar1 miJugar1 = null;
    public Jugar2 miJugar2 =null;
    public DialogoJ2 miDialogoJ2 =null;
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

    //Crear jugar1
    public void crearJugar1()
    {
        miJugar1 = new Jugar1();
    }

    //Crear jugar2
    public void crearJugar2()
    {
        miJugar2 = new Jugar2();
    }
    public void crearDJ2()
    {
        miDialogoJ2 = new DialogoJ2();
    }
    
}