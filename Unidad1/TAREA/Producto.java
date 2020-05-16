//Clase principal
import java.util.Scanner;
class Producto{
	public static void main (String[] args) {
		Scanner leer = new Scanner (System.in);
		Producto1 objeto1 = new Producto1 ();
		System.out.println("************************INVOCANDO A LA CLASE PLANTILLA**********************");
		
		System.out.println("Ingrese la clase del producto :");
		objeto1.producto = leer.nextLine();
		System.out.println("Ingrese el color del producto:");
		objeto1.color = leer.nextLine();
		System.out.println("Ingrese el precio del producto:");
		objeto1.precio = leer.nextInt();
		System.out.println("Ingrese la utilidad del pruducto:");
		objeto1.utilidad = leer.nextLine();
		System.out.println("************************ATRIBUTOS DE LA CLASES PRODUCTO*********************");
		
		System.out.println("La clase del producto es : "+objeto1.producto+"\n"+"El color del producto es : "+objeto1.color);
		System.out.println("El precio del producto es : "+objeto1.precio+"\n"+"La utilidad del producto es : "+objeto1.utilidad);
	}	
}
