public class ListaSimple{
  Nodo inicio;
  Nodo fin;
  public ListaSimple(){
    this.inicio = null;
    this.fin = null;
  }
  public boolean listaVacia(){
    if (inicio == null) return true;
    else return false;
  }
  public void insertar(Nodo nodo){
    if(listaVacia()){
      inicio = nodo;
      fin = nodo;
    }
    else {
      fin.siguiente = nodo;
      fin = fin.siguiente;
    }
  }
  public void listar(){
    if(!listaVacia()){
      Nodo temp = inicio;
      while (temp != null){
        System.out.println(temp.dato);
        temp = temp.siguiente;
      }
    }
    else{
        System.out.println("La lista esta vacia");
      }

    }
    public void eliminarUltimo(){
      if(!listaVacia()){
        Nodo temp=inicio;
      boolean band=true;
    if(inicio==fin){
    inicio=null;
     }
    else{
      while (band){
        if(temp.siguiente == fin){
          fin = temp;
          fin.siguiente = null;
          band = false;
        }    
        
        temp = temp.siguiente;    
          
      }
    }
    }
    else{
        System.out.println("La lista esta vacia");
      }

    }

    
 }
