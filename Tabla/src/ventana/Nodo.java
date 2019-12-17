package ventana;
/**
 *
 * 
 */
public class Nodo {
    
private int valor;
private Nodo siguiente; 
private Nodo nuevo;
private Nodo previo;

public Nodo(){
    this.siguiente = null;
    this.previo = null;
}
public Nodo (int valor){
    this.valor = valor;
    this.siguiente = null;
this.previo = null;
}
public void add(){

}

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
 public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public int getNext() {
        return valor;
    }

    public void setNext(Nodo nuevo) {
       this.nuevo = nuevo;
    }
     public int getPrevio() {
        return valor;
    }

    public void setPrevio(Nodo nuevo) {
        this.nuevo = nuevo;
    }
     
}