class Nodo{
  private int dato;
  private Nodo izquierda;
  private Nodo derecha;

	/**
	* Default empty Nodo constructor
	*/
	public Nodo() {
  		this.dato = 0;
  		this.izquierda = null;
  		this.derecha = null;
	}

  /**
	*  Nodo constructor dato
	*/
	public Nodo(int dato) {
		this.dato = dato;
		this.izquierda = null;
		this.derecha = null;
	}

	/**
	* Default Nodo constructor
	*/
	public Nodo(int dato, Nodo izquierda, Nodo derecha) {
		super();
		this.dato = dato;
		this.izquierda = izquierda;
		this.derecha = derecha;
	}

	/**
	* Returns value of dato
	* @return
	*/
	public int getDato() {
		return dato;
	}

	/**
	* Sets new value of dato
	* @param
	*/
	public void setDato(int dato) {
		this.dato = dato;
	}

	/**
	* Returns value of izquierda
	* @return
	*/
	public Nodo getIzquierda() {
		return izquierda;
	}

	/**
	* Sets new value of izquierda
	* @param
	*/
	public void setIzquierda(Nodo izquierda) {
		this.izquierda = izquierda;
	}

	/**
	* Returns value of derecha
	* @return
	*/
	public Nodo getDerecha() {
		return derecha;
	}

	/**
	* Sets new value of derecha
	* @param
	*/
	public void setDerecha(Nodo derecha) {
		this.derecha = derecha;
	}
}
