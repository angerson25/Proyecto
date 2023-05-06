package vista;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;


public class PanelMenu extends JDialog
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel lbNombreVendedor;
    private JLabel lbCedula;
    private JLabel lbEdad;
    private JTextField tfNombreVendedor;
    private JTextField tfCedula;
    private JTextField tfEdad;
    private JButton btAgregarVendedor;

    //----------------------
    // Metodos
    //----------------------
    public PanelMenu()
    {
        //Definición del layout del Dialogo
        this.setLayout(null);

        //Crear y agregar elementos
        lbNombreVendedor = new JLabel("Menu : ");
        lbNombreVendedor.setBounds(10,50,140,20);
        this.add(lbNombreVendedor);

        lbCedula = new JLabel("Cedula  : ");
        lbCedula.setBounds(10,80,140,20);
        this.add(lbCedula);

        lbEdad = new JLabel("Edad : ");
        lbEdad.setBounds(10,110,140,20);
        this.add(lbEdad);

        tfNombreVendedor = new JTextField();
        tfNombreVendedor.setBounds(150,50,100, 25);
        this.add(tfNombreVendedor);

        tfCedula = new JTextField();
        tfCedula.setBounds(150,80,100, 25);
        this.add(tfCedula);

        tfEdad = new JTextField();
        tfEdad.setBounds(150,110,100, 25);
        this.add(tfEdad);

        btAgregarVendedor = new JButton("Agregar");
        btAgregarVendedor.setBounds(20,140,260,25);
        btAgregarVendedor.setActionCommand("agregar");
        this.add(btAgregarVendedor);

        //Caracteristicas de la ventana
        this.setTitle("Agregar Vendedor");
        this.setSize(900,556);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    //Metodos de acceso
    public String getNombreVendedor()
    {
        return tfNombreVendedor.getText();
    }
    public String getCedula()
    {
        return tfCedula.getText();
    }
    public String getEdad()
    {
        return tfEdad.getText();
    }

    public void agregarOyenteBoton(ActionListener pAL)
    {
        btAgregarVendedor.addActionListener(pAL);
    }

    public void cerrarDialogoAgregarVendedor()
    {
        this.dispose();
    }
}