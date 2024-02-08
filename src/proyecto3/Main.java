package proyecto3;

public class Main {
	public static void main(String[] args) {	
	//Creo 2 objetos por cada tipo de producto -> Lacteo|Fruta|Limpieza|NoPerecible
	Lacteo lacteo1 = new Lacteo ("Leche Parcialmente Descremada DIA Sachet", 164.3 , 1, 11);
	Lacteo lacteo2 = new Lacteo ("Yogur Batido Entero Ilolay Vainilla", 69.5, 120, 9);
	
	Fruta fruta1 = new Fruta ("Banana", 439.0, 1.0, "Amarillo");
	Fruta fruta2 = new Fruta ("Naranja", 599.0, 1.0, "Naranja");
	
	Limpieza limpieza1 = new Limpieza ("Lavandina Comun Odex", 100.9, "Agua lavandina común", 1.0);
	Limpieza limpieza2 = new Limpieza ("Suavizante para Ropa Woody Doypack", 225.6, "Floral", 0.9);
	
	NoPerecible noperecible1 = new NoPerecible ("Aceite de Girasol Natura", 481.2, 1, 884);
	NoPerecible noperecible2 = new NoPerecible ("Fideos Spaghetti Matarazzo ", 233.9, 500, 138);
	
	//Almaceno los objetos creados en un arrelgo del tipo Producto
	Producto producto[] = {lacteo1, lacteo2, fruta1, fruta2, limpieza1, limpieza2, noperecible1, noperecible2};
	
	//Muestro los objetos con sus detalles iterando el arreglo anterior
	for (Producto i : producto) {
		System.out.println("Producto: " + i.getNombre());
		System.out.println("Precio: " + i.getPrecio());
		System.out.println(i.toString());
		System.out.println("---------------------------------");
		}
	}
}
