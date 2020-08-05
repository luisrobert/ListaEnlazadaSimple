import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   System.out.println("HOLA A TODOS QUE TENGAN UN BONITO DIA ♡");
  Scanner teclado = new Scanner(System.in);
  ListaSimple lista = new ListaSimple();
  int op;
  int dato;
  do{
       System.out.println("♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡");
      System.out.println("♡    1:insertar     ♡\n♡    2:listar       ♡\n♡    3:Eliminar     ♡\n♡    0:salir        ♡");
       System.out.println("♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡ ♡");
      op =teclado.nextInt();
      switch (op){
          case 1: System.out.println("Ingrese el dato:");
                  dato = teclado.nextInt();
                  Nodo nodo = new Nodo(dato);
                  lista.insertar(nodo);
                  break;
          case 2: System.out.println("---------");
                  lista.listar();
                  System.out.println("---------");
                   break;
          case 3: lista.eliminarUltimo();
                  break;         
      }
  }while (op!=0);



  }
}