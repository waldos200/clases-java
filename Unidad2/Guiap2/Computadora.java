import java.util.*;
class Ordenador
{
	String marca,memoria,procesador,discoduro;
	public String Datospc()
	{
		return "El cliente necesita una computadora marca "+marca+"\n"+"con una memoria de "+memoria+"\n"+"un procesador "+procesador+"\n"+"y un disco duro de "+discoduro;
	}

	public void llamada()
	{
		System.out.println(Datospc());
	}
}	
class Computadora
	{
		public static void main(String []args)
		{
			Scanner leer = new Scanner(System.in);
			Ordenador n1 = new Ordenador();
			System.out.println("Ingrese la marca de la computadora: ");
			n1.marca = leer.nextLine();
			System.out.println("Ingrese la memoria de la computadora: ");
			n1.memoria = leer.nextLine();
			System.out.println("Ingrese el procesador: ");
			n1.procesador = leer.nextLine();
			System.out.println("Ingrese la capacidad del disco duro: ");
			n1.discoduro = leer.nextLine();
			System.out.println("*********************************************************");
			System.out.println(n1.Datospc());
		}
	}