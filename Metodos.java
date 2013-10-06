import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Metodos {
    //el puntero al primer elemento
    private Nodo root;
    //el total de nodos en la lista
    private int numNodos;

    //el constructor inicializa las variables
    public Metodos(){
        root = null;
        numNodos = 0;
    }

    //Agrega un nodo a la lista
    public void adicionar(Nodo newNodo){
        int i =0;
        
        //puntero temporal para recorreme en la lista
        Nodo tmp = root;
       
              
                   //si la lista esta vacia
                    if(tmp==null){
                        //lo agregamos al root
                        root = newNodo;
                    }else{
                        //de lo contrario nos recorremos hasta el ultimo
                        while(tmp.ptr!=null)
                            tmp = tmp.ptr;

                        //en el ultimo hacemos el enlace 
                        tmp.ptr = newNodo;
                    }
                    //incrementamos el numero de nodos
                    numNodos++;
              
    }
    
    //imprime la lista de nodos
    public String listar(){
        //puntero que se movera sobre la lista
        Nodo tmp = root;
        String cadena="No.  Venta     Valor   Cantidad   Tipo Zapatilla ";
        String cadenaV2 ="No.\t" + "Venta\t" +"Valor\t"+"Cantidad\t" + "Tipo Zapatilla\t";
        //sercirandonos que no este vacia
        if(tmp==null){
        	JOptionPane.showMessageDialog(new JDialog(), "Lista Vacia");
        }else{
            //nos movemos hasta el final imprimiendo nodo por nodo
            int i=0;
            String mapto = "";
            while (tmp != null){
            	cadena = cadenaV2 +"\n"+
                        i+"\t"+tmp.numVentas+"\t"+tmp.valorU+"\t"+tmp.cantidadV+"\t"+tmp.tipoZapatillas;
                        if(tmp.tipoZapatillas== 0){
            			mapto = "Tipo 1";
            		}
                        if(tmp.tipoZapatillas== 1){
            			mapto = "Tipo 2";
            		}
                        if(tmp.tipoZapatillas== 2){
            			mapto = "Tipo 3";
            		}
                        if(tmp.tipoZapatillas== 3){
            			mapto = "Tipo 4";
            		}
        		cadena = cadena +mapto;
        		tmp = tmp.ptr;
                i++;
            }
        }
        return (cadena);
    }

    
    public void buscar(){
        //puntero que se movera sobre la lista
        Nodo tmp = root;
        //sercirandonos que no este vacia
        if(tmp==null){
        	JOptionPane.showMessageDialog(new JDialog(), "Lista Vacia");
        }else{
            //nos movemos hasta el final imprimiendo nodo por nodo
            int i=0;
            String ceduaux;
            ceduaux=JOptionPane.showInputDialog("Digite el numero de venta a buscar");
            String cadena="";
            while (tmp != null){
            	if(ceduaux.equals(tmp.numVentas)){
            		cadena = "Numero de registro-> "+ i;
            		cadena = cadena + "\nNumero Venta-> "+tmp.numVentas;
            		cadena = cadena + "\nValor Unitario: "+tmp.valorU;
            		cadena = cadena + "\nCantidad: "+tmp.cantidadV;
                        String mapto = "";
            		if(tmp.tipoZapatillas== 0){
            			mapto = "Tipo 1";
            		}
                        if(tmp.tipoZapatillas== 1){
            			mapto = "Tipo 2";
            		}
                        if(tmp.tipoZapatillas== 2){
            			mapto = "Tipo 3";
            		}
                        if(tmp.tipoZapatillas== 3){
            			mapto = "Tipo 4";
            		}
                        
            		cadena = cadena + "\nTipo de Zapatilla: "+mapto;
            		JOptionPane.showMessageDialog(new JDialog(), cadena);
            	}
                tmp = tmp.ptr;
                i++;
            }
        }
    }
    
    public void calculos(){
        Nodo tmp=root;
        //Mostrar tipo marca 1
        
        
    }

    
}