package ejecutable;

import controlador.Controlador;
import modelo.Disle;
import vista.VentanaPrincipal;

public class CreaccionDisle 
{
    public static void main(String[] args)
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Disle miDisle= null;
        Controlador miControlador = new Controlador(miVentana, miDisle);
    }
}