//Importamos paquetes para el controlado
package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Juego;
import vista.VentanaPrincipal;


public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Juego pModel)
    {
        this.venPrin = pVenPrin;
        this.venPrin.miPanelEntrada.agregarOyentesBotones(this);
        this.venPrin.miPanelMenu.agregarOyentesBotones(this);
        
        
        
    }
    
    //control de botones para el acceso a los juegos
    public void actionPerformed(ActionEvent ae) 
    {
       
        String comando = ae.getActionCommand();
        //abrir dialogo menu 
        if(comando.equals("entrar"))
        {
            
            venPrin.crearMenu();
            this.venPrin.miPanelMenu.agregarOyentesBotones(this);
        }

        //abrir la ventana de dialogo jugar1
        if(comando.equals("jugar1"))
        {
            venPrin.crearJugar1();
            this.venPrin.miJugar1.agregarOyentesBotones(this);
        }

        //abrir la ventana de dialogo jugar2
        if(comando.equals("jugar2"))
        {
            venPrin.crearJugar2();
            
            
        }
        
        //abrir el dialogo J3
        if(comando.equals("jugar3"))  
        {
            venPrin.crearJugar3();
        }

        //abrir el dialogo J4
        if(comando.equals("jugar4"))  
        {
            venPrin.crearJugar4();
            
        }
        
        
       
        

    }    
}