//Clase principal
import java.util.Scanner;
class Celular{
	public static void main (String[] args) {
		Scanner leer = new Scanner (System.in);
		Celular1 objeto1 = new Celular1 ();
		System.out.println("************************INVOCANDO A LA CLASE PLANTILLA**********************");
		
		System.out.println("Ingrese la marca del celular:");
		objeto1.marca = leer.nextLine();
		System.out.println("Ingrese el modelo del celular:");
		objeto1.modelo = leer.nextLine();
		System.out.println("Ingrese el precio del celular:");
		objeto1.precio = leer.nextInt();
		System.out.println("Ingrese espacio de la RAM y ROM del celular:");
		objeto1.espacio = leer.nextInt();
		System.out.println("************************ATRIBUTOS DE LA CLASES CELULAR*********************");
		
		System.out.println("La marca del celular es : "+objeto1.marca+"\n"+"El modelo del celular es : "+objeto1.modelo);
		System.out.println("El precio del celular  es : "+objeto1.precio+"\n"+"El espacio del celular es : "+objeto1.espacio);
	}	
}
