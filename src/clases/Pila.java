package clases;
/**
 *
 * @author yose2
 */
public class Pila {
    private Nodo UltimoValorIngresado;
    
    public Pila(){
        UltimoValorIngresado = null;
    }
    //Metodo para insertar dentro de la pila
    public void Insertar(char valor){
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.informacion = valor;
        
        if (UltimoValorIngresado == null) {
            
            nuevo_nodo.siguiente = null;
            UltimoValorIngresado = nuevo_nodo;
            
    } else {
    
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;

        }

    }
    //Metodo para extraer de la pila
    public char extraer(){
        if (UltimoValorIngresado != null) {
        
            char informacion = UltimoValorIngresado.informacion;
            UltimoValorIngresado = UltimoValorIngresado.siguiente;
            return informacion;
            
        } else {
            return Character.MAX_VALUE;
        }
    }
    //Metodo para saber si la pila esta vacia
    public boolean PilaVacia(){
        return UltimoValorIngresado == null;
    }
    
}
