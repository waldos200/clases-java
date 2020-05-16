import java.util.Scanner;
class DatosAlumno
{
	String nombre,apellido,carnet,datos;
	int nota1, nota2, nota3, nota4;
	
	
	public String capturarDatos()
	{
		Scanner leer = new Scanner(System.in);
		System.out.println("Cual es su numero de carnet: ");
		return carnet = leer.nextLine();
		System.out.println("Cual es su nombre: ");
		return nombre = leer.nextLine();
		System.out.println("Cual es su apellido: ");
		return apellido = leer.nextLine();
	}
	
	public int notas()
	{
		Scanner leer1 = new Scanner(System.in);
		System.out.println("Ingrese las notas: ");
		System.out.println("Primer parcial: ");
		nota1 = leer1.nextInt();
		return nota1;
		System.out.println("Segundo parcial: ");
		nota2 = leer1.nextInt();
		return nota2;
		System.out.println("Tercer parcial: ");
		nota3 = leer1.nextInt();
		return nota3;
		System.out.println("Cuantos parciales hizo en total: ");
		nota4 = leer1.nextInt();	
		return nota4;
	}
	
	public int Promedio()
	{
		return nota1+nota2+nota3/nota4;
	}
	
	public String nombreCompleto()
	{
		return nombre+" "+apellido;
	}
	
	public String mostrarDatos()
	{	
		System.out.println("carnet: "+carnet);
		System.out.println("Nombre completo"+nombreCompleto());
		System.out.println("Parcial 1: "+nota1);
		System.out.println("Parcial 2: "+nota2);
		System.out.println("Parcial 3: "+nota3);
		System.out.println("Promedio: "+Promedio());
		//System.out.println("carnet: "+carnet+"/n"+"Nombre completo"+nombreCompleto()"/n"+"Parcial 1: "+nota1+"/n"+"Parcial 2: "+nota2+"/n"+"Parcial 3: "+nota3+"/n"+"Promedio: "+Promedio());
		return datos;
	}
}

class Alumno
{
	public static void main(String []args){
		DatosAlumno p1 = new DatosAlumno();
		p1.capturarDatos();
		p1.notas();
		System.out.println("        INFORMACIÓN DEL ALUMNO        ");
		System.out.println("**************************************");
		System.out.println(p1.mostrarDatos());
	}
}