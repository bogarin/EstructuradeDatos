public class Principal  {

  public static void main(String[] args) {
    Persona obj1=new Persona("jose ramon","bogarin valenzuela",28);
    Persona obj2=new Persona("juan ramon","bogarin valenzuela",29);
    Persona obj3=new Persona("ramon","bogarin valenzuela",30);
    Persona obj4=new Persona("luna haydee","bogarin chavez",3);

    Nodo nodo1=new Nodo(obj1);
    Nodo nodo2=new Nodo(obj2);
    Nodo nodo3=new Nodo(obj3);
    Nodo nodo4=new Nodo(obj4);

    nodo1.setSiguiente(nodo2);
    nodo2.setSiguiente(nodo3);
    nodo3.setSiguiente(nodo4);

    Nodo nodoInicial=nodo1;
    Persona aux2;

    do{
        aux2=(Persona)nodoInicial.getContenido();
        System.out.println(aux2.toString());
        nodoInicial=nodoInicial.getSiguiente();
    }while(nodoInicial!=null);

  }

}
