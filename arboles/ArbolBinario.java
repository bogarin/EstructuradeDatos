class ArbolBinario{

private Nodo raiz;
private String resultado;

public ArbolBinario(){
    this.raiz=null;
	}

	public ArbolBinario(Nodo raiz){
	    this.raiz=raiz;
		}

	/**
	* Returns value of raiz
	* @return
	*/
	public Nodo getRaiz() {
		return raiz;
	}

	/**
	* Sets new value of raiz
	* @param
	*/
	public void setRaiz(Nodo raiz) {
		this.raiz = raiz;
	}

	/**
	* Returns value of resultado
	* @return
	*/
	public String toString() {
		return resultado;
	}

	public void preOrden(){
		  resultado = "";
			preOrden(raiz);
	}

	public void postOrden(){
    resultado = "";
		postOrden(raiz);
	}

	public void inOrden(){
		resultado = "";
		inOrden(raiz);
	}

	private void preOrden(Nodo nodo){
		if(nodo != null){
			resultado+= " "+nodo.getDato();
			preOrden(nodo.getIzquierda());
			preOrden(nodo.getDerecha());
		}
	}

	private void postOrden(Nodo nodo){
		if(nodo != null){
			postOrden(nodo.getIzquierda());
			postOrden(nodo.getDerecha());
			resultado+= " "+nodo.getDato();
		}
	}

	private void inOrden(Nodo nodo){
		if(nodo != null){
			inOrden(nodo.getIzquierda());
			resultado+= " "+nodo.getDato();
			inOrden(nodo.getDerecha());
		}
	}

}
