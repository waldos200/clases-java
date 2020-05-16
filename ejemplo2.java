//Clase principal 
import java.util.Scanner;
class Guia
{
	public static void main(String lilin[])
	{
		Scanner leer = new Scanner(System.in);
		Casa Urbana = new Casa();
		System.out.println("//Invocando la primera clase//");
		System.out.println("======Objeto uno =======");
	
		System.out.println("Ingrese el color de la casa");
		Urbana.color = leer.nextLine();
		System.out.println("Ingrese el tamaño de la casa");
		Urbana.tamano = leer.nextLine();
		System.out.println("Ingrese la Ubicacion de la casa");
		Urbana.ubicacion = leer.nextLine();
		System.out.println("Ingrese el numero de plantas de la casa ");
		Urbana.numplantas = leer.nextInt();
		System.out.println("====Atributos de la casa=== ");
		System.out.println("Color :"+Urbana.color+"\n"+"Tamaño :"+Urbana.tamano+"\n"+"Ubicacion :"+Urbana.ubicacion+"\n"+"Numero de plantas "+Urbana.numplantas);
		System.out.println("=========================");
		System.out.println("======Objeto dos =======");
		Casa Mixta = new Casa();
		System.out.print("Ingrese el color de la casa");
		Mixta.color = leer.next();
		System.out.print("Ingrese el tamaño de la casa :");
		Mixta.tamano = leer.next();
		System.out.print("Ingrese la Ubicacion de la casa :");
		Mixta.ubicacion = leer.next();
		System.out.print("Ingrese el numero de plantas de la casa : ");
		Mixta.numplantas = leer.nextInt();
		System.out.println("====Atributos de la casa=== ");
		System.out.println("Color :"+Mixta.color+"\n"+"Tamaño :"+Mixta.tamano+"\n"+"Ubicacion :"+Mixta.ubicacion+"\n"+"Numero de plantas "+Mixta.numplantas);
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("======Objeto tres =======");
		Casa Rural = new Casa();
		System.out.println("Ingrese el color de la casa");
		Rural.color = leer.next();
		System.out.println("Ingrese el tamaño de la casa :");
		Rural.tamano = leer.next();
		System.out.println("Ingrese la Ubicacion de la casa :");
		Rural.ubicacion = leer.next();
		System.out.println("Ingrese el numero de plantas de la casa : ");
		Rural.numplantas = leer.nextInt();
		System.out.println("====Atributos de la casa=== ");
		System.out.println("Color :"+Rural.color+"\t"+"Tamaño :"+Rural.tamano+"\t"+"Ubicacion :"+Rural.ubicacion+"\t"+"Numero de plantas "+Rural.numplantas);
		System.out.println("=========================");
	}
}

