//Clase principal
import java.util.Scanner;
class Casa{
	public static void main (String[] args) {
		Scanner leer = new Scanner (System.in);
		Casa1 objeto1 = new Casa1 ();
		System.out.println("************************INVOCANDO A LA CLASE PLANTILLA**********************");
		
		System.out.println("Ingrese la ubicación de la casa:");
		objeto1.ubicacion = leer.nextLine();
		System.out.println("Ingrese el color de la casa:");
		objeto1.color = leer.nextLine();
		System.out.println("Ingrese área de la casa:");
		objeto1.area = leer.nextLine();
		System.out.println("Ingrese la cantidad de hábitaciones de la casa:");
		objeto1.habitaciones = leer.nextInt();
		System.out.println("************************ATRIBUTOS DE LA CLASES CASA*********************");
		
		System.out.println("La ubicación de la casa es : "+objeto1.ubicacion+"\n"+"El color de la casa es : "+objeto1.color);
		System.out.println("El área de la casa es : "+objeto1.area+"\n"+"La cantidad de hábitaciones son : "+objeto1.habitaciones);

	}
}