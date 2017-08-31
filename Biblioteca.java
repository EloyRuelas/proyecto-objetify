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
}