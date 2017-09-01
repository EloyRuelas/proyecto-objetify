import java.util.ArrayList;
public class Biblioteca
{
    private ArrayList<String> canciones;
    private Reproductor reproductor;
    public Biblioteca()
    {
        canciones = new ArrayList<String>();
        reproductor=new Reproductor();
    }
    
    public void agregarCancion(String nombreArchivo)
    {
        canciones.add(nombreArchivo);
    }
    
    public void reproducirCancion(int numCancion)
    {
        reproductor.reproducir(canciones.get(numCancion));
    }
    
    public int obtenerNumeroDeCanciones()
    {
        return canciones.size();
    }
    
    public void muestraCancion(int numCancion)
    {
        if(numCancion >= 0 && numCancion < canciones.size())
        {
            canciones.remove(numCancion);
        }
    }
    public void muestraTodosLosArchivos()
    {
        for(String nombreArchivo : canciones)
        {
            System.out.println(canciones);
        }
    }
    
    public void imprimirElementoSeleccionado(String palabraBusc)
    {
        for(String nombreArchivo : canciones)
        {
            if(nombreArchivo.contains(palabraBusc))
            {
                //una coincidencia
                System.out.println(nombreArchivo);
            }
        }
    }
    
    public void mostrarLista()
    {
        int index = 0;
        while(index < canciones.size())
        {
            String nombreArchivo=canciones.get(index);
            System.out.println(nombreArchivo);
            index++;
        }
    }
    
    public int localizaPrimerPalabra(String palabra)
    {
        int index=0;
        
        boolean buscar=true;
        
        while(buscar && index < canciones.size())
        {
            String nombreArchivo=canciones.get(index);
            if(canciones.contains(palabra))
            {
                buscar=false;
            }
            else
            {
                index++;
            }
        }
        if(buscar)
        {
            return -1;
        }
        else
        {
            return index;
        }
    }
    
}