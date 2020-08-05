public class Nodo{
  int dato;
  Nodo siguiente;
  public Nodo(int dato){
    this.dato = dato;
    siguiente = null;
  }
  public void setDato(int dato){
    this.dato = dato;
  }
  public void setNodo(Nodo nodo){
    this.siguiente = nodo;
  }
public int getDato(){
    return this.dato;
  }
  public Nodo getNodo(){
    return this.siguiente;
  }

}