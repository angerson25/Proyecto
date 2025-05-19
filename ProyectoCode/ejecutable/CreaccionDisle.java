package ejecutable;

//import
import controlador.Controlador;
import modelo.Juego;
import vista.VentanaPrincipal;


public class CreaccionDisle 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Juego miDisle= null;
        Controlador miControlador = new Controlador(miVentana, miDisle);
    }
}