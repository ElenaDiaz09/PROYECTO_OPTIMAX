package ventana;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baton
 */

public class ListaDatos {
     int val1;
    Nodo nodeIni, nodeFin;
    public ListaDatos(){
        
        this.nodeIni = null;
        this.nodeFin = null;
    }
   
    public void getDatos(){
        
    }
    public void setDatos(int val1){
    this.val1 = val1;
    }
    public boolean isEmpty(){ //Comprobar si la lista esta vacia
        if(nodeIni == null)
            return true;
        else
            return false;
    }
    public void add(Nodo nuevo){
       //PRIMERO VERIFICAR SI LA LISTA ESTA VACÍA
   if(isEmpty()){
       nodeIni = nuevo;
       nodeFin = nuevo;
   }   
   else {
      Nodo temp = nodeIni;
      while(temp.getSiguiente()!= null){
      temp  = temp.getSiguiente();
      }
      temp.setSiguiente(nuevo);
       nodeFin.setSiguiente(nuevo);
        nodeFin = nuevo;
   }
   
    }
    public int size(){
        int iCont = 0;
        Nodo temp = nodeIni;
        while(temp != null){
            iCont++;
            temp = temp.getSiguiente();
        }
        return iCont;
    }
    public void print(){
        Nodo temp = nodeIni;   
        while(temp != null){
        System.out.print(temp.getValor() + " - ");
        temp = temp.getSiguiente();
       
        }
       
            
        }
    public static void llenar(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
    }
}
