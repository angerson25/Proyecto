package modelo;

import java.util.ArrayList;
import java.util.Random;
public class Juego 
{
    //atributos
    ArrayList<String> palabras = new ArrayList<String>();
    private String palabraAleatoria;
    
    public Juego()
    {

    }

    public String getPalabraAleatoria()
    {
        palabraAleatoria="";
        palabras.add("ARBOL");
        palabras.add("CASA");
        palabras.add("LAPICERO");
        palabras.add("MOTO");
        palabras.add("NAVIDAD");
        palabras.add("BIGOTE");
        palabras.add("MUÑECA");
        palabras.add("CEREBRO");
        palabras.add("ABDOMEN");
        palabras.add("ESPALDA");
        palabras.add("AZUL");
        palabras.add("ROJO");
        palabras.add("VERDE");
        palabras.add("AMARILLO");
        palabras.add("NARANJA");
        palabras.add("REPRODUCCION");
        palabras.add("ELEFANTE");
        palabras.add("CARACOL");
        palabras.add("VEGETAL");
        palabras.add("PATATA");
        palabras.add("MANZANA");
        palabras.add("GASEOSA");
        palabras.add("CALENDARIO");
        palabras.add("ANOCHECER");
        palabras.add("UNIVERSO");
        palabras.add("TORMENTA");
        palabras.add("HABITACION");
        palabras.add("VENTANA");

        Random rand = new Random();
        palabraAleatoria = palabras.get(rand.nextInt(palabras.size()));
        return palabraAleatoria;

    }
    public String invertirPalabra()
    {
        String palabraInvertida = "";
        for (int x = palabraAleatoria.length() - 1; x >= 0; x--)
        {
            palabraInvertida = palabraInvertida + palabraAleatoria.charAt(x);
        }
        return palabraInvertida;
    }
    
}