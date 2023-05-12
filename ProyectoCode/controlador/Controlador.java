package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Disle;
import vista.VentanaPrincipal;
import vista.PanelMenu;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Disle model;
    private Object miPanelEntrada;
    
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Disle pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelEntrada.agregarOyentesBotones(this);
        this.venPrin.miPanelMenu.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();

        if(comando.equals("entrar"))
        {
            
            venPrin.crearMenu();
            this.venPrin.miPanelMenu.agregarOyentesBotones(this);
        }

        //abrir la ventana de dialogo jugar1
        if(comando.equals("jugar"))
        {
            venPrin.crearJugar1();
            this.venPrin.miJugar1.agregarOyentesBotones(this);
        }
        
        
        
        
    }    
}