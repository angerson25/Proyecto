package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Disle;
import vista.VentanaPrincipal;

public class Controlador implements ActionListener
{
    //----------------------------
    //Atributos
    //----------------------------
    private VentanaPrincipal venPrin;
    private Disle model;
    
    
    //----------------------------
    //Metodos
    //----------------------------
    
    //Constructor
    public Controlador(VentanaPrincipal pVenPrin, Disle pModel)
    {
        this.venPrin = pVenPrin;
        this.model = pModel;
        this.venPrin.miPanelEntrada.agregarOyentesBotones(this);
        this.venPrin.miJugar1.agregarOyentesBotones(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        //Identificar el comendo generado (calcular, borrar, salir)
        String comando = ae.getActionCommand();

        if(comando.equals("entrar"))
        {
            
            venPrin.crearMenu();
            this.venPrin.miPanelMenu.agregarOyenteBoton(this);
        }

        //abrir la ventana de dialogo jugar1
        if(comando.equals("jugar"))
        {
            System.out.println("hola");
            venPrin.crearJugar1();
            this.venPrin.miJugar1.agregarOyentesBotones(this);
        }
        
        
        
        
    }    
}