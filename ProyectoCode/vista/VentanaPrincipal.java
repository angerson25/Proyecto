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
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultado;
    public DialogoMoverCarro miDialogoMoverCarro;
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
        
        
        
        
        miDialogoMoverCarro = null;
        
        //Caracteristicas de la ventana
        setTitle("Niños con dislexia");
        setSize(900,600);
        //setLocation(10,10);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        
    }
    
    //Crear ventana dialogo Mover
    public void crearDialogoMover()
    {
        miDialogoMoverCarro = new DialogoMoverCarro();
    }
}