class Principal {

  public static void main(String[] args) {
    Nodo obj1=new Nodo(1);
    Nodo obj2=new Nodo(2);
    Nodo obj3=new Nodo(3);
    Nodo obj4=new Nodo(4);
    Nodo obj5=new Nodo(5);

    ArbolBinario arbol=new ArbolBinario(obj1);
    obj1.setIzquierda(obj2);
    obj1.setDerecha(obj3);
    obj2.setIzquierda(obj4);
    obj2.setDerecha(obj5);

    arbol.preOrden();
    System.out.println(arbol.toString());

    arbol.inOrden();
    System.out.println(arbol.toString());

    arbol.postOrden();
    System.out.println(arbol.toString());
  }

}
