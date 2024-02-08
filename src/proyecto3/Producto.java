package proyecto3;

public abstract class Producto {
	//Atributos
	protected String nombre;
	protected double precio;
	
	//Constructor
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	//Getters
	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}
	
	//To String
	@Override
	public String toString() {
		return "Producto [Nombre=" + nombre + ", Precio=" + precio + "]";
	}
}
