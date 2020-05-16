//Clase principal
import java.util.Scanner;
class Ciber{
  public static void main(String[] rogel){
    Scanner leer = new Scanner(System.in);
	Cafe objeto1 = new Cafe();
	System.out.println("************************INVOCANDO LA CLASE PLANTILLA**********************");
	
	System.out.println("Ingrese la ubicacion de ciber :");
	objeto1.ubicacion = leer.nextLine();
	System.out.println("Ingrese el nombre del ciber :");
	objeto1.nombre = leer.nextLine();
	System.out.println("Ingrese el propietario del ciber :");
	objeto1.propietario = leer.nextLine();
	System.out.println("Ingrese el numero de computadoras del ciber :");
	objeto1.numpc = leer.nextInt();
	System.out.println("**************************ATRIBUTOS DE LA CLASE CIBER**********************");
	
	System.out.println("La ubicacion del ciber es :"+objeto1.ubicacion+"\n"+"El nombre del ciner es :"+objeto1.nombre);
	System.out.println("El propietario del ciber es :"+objeto1.propietario+"\n"+"El numero de computadoras del ciber es :"+objeto1.numpc);
  }
}