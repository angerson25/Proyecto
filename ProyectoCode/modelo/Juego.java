package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Juego 
{
    //atributo
    ArrayList<String> palabras = new ArrayList<String>();
    private String palabraAleatoria;
    ArrayList<String> imagen = new ArrayList<String>();

    private String nombre,caracter,caracterDiferente;
    private final static int whidt=900;
    private final static int height=556;
    private int r,numeroRandom;
    public Juego(String nombre)
    {
        this.nombre =nombre;

    }
    //metodo que agrega y selecciona una palabra random.
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


    public String getImagenAleatoria()
    {
        palabraAleatoria="";
        imagen.add("CARRO");
        imagen.add("LAPIZ");
        imagen.add("FRUTA");
        imagen.add("BOTELLA");
        imagen.add("MOTO");
        

        Random rand = new Random();
        palabraAleatoria = imagen.get(rand.nextInt(imagen.size()));
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


    public String getNombre()
    {
        return nombre;

    }

    public int getWidth()
    {
        return whidt;
    }

    public  int getHeight() 
    {
        return height;
    }


    public void reordenarMatriz()
    {
        Collections.shuffle(imagen);
    }


    public String getPalabraRandom(int k)
    {
        return imagen.get(k);
    }


    public String getCaracterRandom()
    {
        String [] caracteres = {"h","V",":(","p","q","U","n","E","F","$","S","B","P","L","I"};
        Random rand = new Random();
        r = rand.nextInt(caracteres.length); 
        caracter = caracteres[r];
        return caracter;

    }

    public String getCaracterDiferente()
    {
        String [] caracteres = {"n","U",":)","q","p","V","h","F","E","S","$","P","B","I","L"};
        caracterDiferente = caracteres[r];
        return caracterDiferente;

    }


    public int getNumeroRandom()
    {
        Random random = new Random();
        
        
        numeroRandom = random.nextInt(10);
        return numeroRandom;
    }
    
}