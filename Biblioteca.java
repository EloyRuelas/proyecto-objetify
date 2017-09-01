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
    
    /**
     * Añade un archivo a la coleccion.
     * @param nombreArchivo El archivo que hay que añadir.
     */
    public void agregarCancion(String nombreArchivo)
    {
        canciones.add(nombreArchivo);
    }
    
    public void reproducirCancion(int numCancion)
    {
        reproductor.reproducir(canciones.get(numCancion));
    }
    
    /**
     * Devuelve el número de archivos de la coleccion.
     * @return El número de archivos de la coleccion.
     */
    public int obtenerNumeroDeCanciones()
    {
        return canciones.size();
    }
    
    /**
     * Muestra un archivo de la coleccion.
     * @param index El indice del archivo que hay que mostrar.
     */
    public void muestraCancion(int index)
    {
        if(index >= 0 && index < canciones.size())
        {
            String nombreArchivo=canciones.get(index);
            System.out.println(nombreArchivo);
        }
    }
    
    /**
     * Elimina un archivo de la coleccion.
     * @param index El indice del archivo que hay que eliminar.
     */
    public void BorraCancion(int numCancion)
    {
        if(numCancion >= 0 && numCancion < canciones.size())
        {
            canciones.remove(numCancion);
        }
    }
    
    /**
     * Muestra una lista de todos los elementos.
     */
    public void muestraTodosLosArchivos()
    {
        for(String nombreArchivo : canciones)
        {
            System.out.println(canciones);
        }
    }
    
    /**
     * Enumera los nombres de archivos que se corresponden con
     * la cadena de busqueda proporcionada
     * @param palabraBusc La cadena que hay que buscar.
     */
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
    
    /**
     * Muestra una lista de todos los archivos de la coleccion.
     */
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
    
    /**
     * Localiza el indice del primer archivo que se corresponde con la cadena
     * de busqueda indicada.
     * @param palabra La cadena que hay que buscar.
     * @return El indice de la primera aparicion, es decir -1 si no se encuentra
     *         ninguna correspondencia.
     */
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