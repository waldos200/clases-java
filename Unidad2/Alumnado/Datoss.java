import java.util.Scanner;
//package Alumnado;

class Datoss
{
	public String carnet, nombre, apellido;
	public String capturarDatos()
	{
		Scanner leer = new Scanner(System.in);
		//DatosAlumno a1 = new DatosAlumno();
		//System.out.println("Cual es su numero de carnet: ");
		carnet = leer.nextLine();
		//return a1.carnet;
		//System.out.println("Cual es su nombre: ");
		nombre = leer.nextLine();
		//return a1.nombre;
		//System.out.println("Cual es su apellido: ");
		apellido = leer.nextLine();
		//return a1.apellido;
		return a1.datos;
	}
}