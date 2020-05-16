package parcial3.datosalumno;
import java.util.Scanner;
public class Datosalum
{
	public String nombre, carnet;
	public String datos (String nombre,String carnet)
	{
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese el nombre del alumno:");
		nombre = leer.nextLine();
		System.out.println("ingrese el carnet del alumno:");
		carnet = leer.nextLine();
		return "El alumno es: "+nombre+" con el numero de carnet: "+ carnet;
	}
}
