//Clase principal
import java.util.Scanner;
class Fiesta{
  public static void main(String[] rogel){
    Scanner leer = new Scanner(System.in);
	Pachanga Party = new Pachanga();
	System.out.println("======================INVOCANDO LA CLASE PLANTILLA=======================");
	
	System.out.println("Ingrese el tipo de fiesta :");
	Party.tipo = leer.nextLine();
	System.out.println("Ingrese el lugar de la fiesta :");
	Party.lugar = leer.nextLine();
	System.out.println("Ingrese la fecha de la fiesta :");
	Party.fecha = leer.nextLine();
	System.out.println("Ingrese el tema de la fiesta :");
	Party.tema = leer.nextLine();
	
	System.out.println("===================ATRIBUTOS DE LA CLASE FIESTA==========================");
	System.out.println("El tipo de fiesta es :"+Party.tipo+"\n"+"El lugar de la fiesta es :"+Party.lugar+"\n"+"La fecha de la fiesta es :"+Party.fecha+"\n"+"El tema de la fiesta es :"+Party.tema);
  }
}