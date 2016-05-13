public class Persona {
  private String nombre;
  private String apellido;
  private int edad;


	/**
	* Default empty Persona constructor
	*/
	public Persona() {
	}

	/**
	* Default Persona constructor
	*/
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	/**
	* Returns value of nombre
	* @return
	*/
	public String getNombre() {
		return nombre;
	}

	/**
	* Sets new value of nombre
	* @param
	*/
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	* Returns value of apellido
	* @return
	*/
	public String getApellido() {
		return apellido;
	}

	/**
	* Sets new value of apellido
	* @param
	*/
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	* Returns value of edad
	* @return
	*/
	public int getEdad() {
		return edad;
	}

	/**
	* Sets new value of edad
	* @param
	*/
	public void setEdad(int edad) {
		this.edad = edad;
}
	/**
	* Create string representation of Persona for printing
	* @return
	*/
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
}
