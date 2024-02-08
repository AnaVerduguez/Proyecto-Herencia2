package proyecto3;

public class Fruta extends Producto {
	private Double peso;
	private String color;
	
	public Fruta(String nombre, double precio, Double peso, String color) {
		super(nombre, precio);
		this.peso = peso;
		this.color = color;
	}

	public Double getPeso() {
		return peso;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Fruta [Peso=" + peso + ", Color=" + color + "]";
	}
}
