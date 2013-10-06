public class Nodo{
    //puntero al siguiente nodo
    public Nodo ptr;
    // puedes poner todos los datos que quieras
    
    public int tipoZapatillas;
    public int valorU;
    public int cantidadV;
    public String numVentas;
    
    //constructor por default es NULL, porque sera el ultimo de la lista
    public Nodo(){
        ptr = null;
    }
} 