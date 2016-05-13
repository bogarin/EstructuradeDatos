public class Nodo{
  private Nodo siguiente;
  private Object contenido;

  /**
	*  Nodo constructor siguiente y contenido
	*/
  public Nodo(Nodo siguiente, Object contenido) {
    this.siguiente = siguiente;
    this.contenido = contenido;
  }

  /**
	*  Nodo constructor siguiente
	*/
  public Nodo(Nodo siguiente) {
    this.siguiente = siguiente;
  }

  public Nodo(Object contenido) {
    this.contenido = contenido;
    this.siguiente = null;
  }

  /**
	* Default Nodo constructor
	*/
  public Nodo() {
    this.siguiente = null;
    this.contenido = null;
  }

	/**
	* Returns value of siguiente
	* @return
	*/
	public Nodo getSiguiente() {
		return siguiente;
	}

	/**
	* Sets new value of siguiente
	* @param
	*/
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}

	/**
	* Returns value of contenido
	* @return
	*/
	public Object getContenido() {
		return contenido;
	}

	/**
	* Sets new value of contenido
	* @param
	*/
	public void setContenido(Object contenido) {
		this.contenido = contenido;
	}
}
