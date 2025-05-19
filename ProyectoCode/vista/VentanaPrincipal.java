package vista;
import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //---------------------
    //Atributos
    //----------------------

    public PanelEntrada miPanelEntrada;
    public PanelMenu miPanelMenu = null;
    public Jugar1 miJugar1 = null;
    public Jugar2 miJugar2 =null;
    public Jugar3 miJugar3 =null;
    public Jugar4 miJugar4 =null;
    public DialogoJ2 miDialogoJ2 =null;

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

    //Crear jugar3
    public void crearJugar3()
    {
        miJugar3 =new Jugar3();
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

    //Crear dialogoJ2
    public void crearDJ2()
    {
        miDialogoJ2 = new DialogoJ2();
    }

    //Crear dialogoJ4
    public void crearJugar4()
    {
        miJugar4 = new Jugar4();
    }
    
}