import java.util.*;
import java.lang.ArithmeticException;

class DatosAlumno
{
	String nombre,apellido,carnet,datos;
	int nota1, nota2, nota3, nota4;
	
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
		System.out.println("carnet: " + carnet);
		System.out.println("Nombre completo: " + nombreCompleto());
		System.out.println("Parcial 1: " + nota1);
		System.out.println("Parcial 2: " + nota2);
		System.out.println("Parcial 3: " + nota3);
		System.out.println("Promedio: " + Promedio());
		return datos;
	}
}

class Datoss
{
	public String capturarDatos()
	{
		Scanner leer = new Scanner(System.in);
		DatosAlumno a1 = new DatosAlumno();
		a1.carnet = leer.nextLine();
		return a1.carnet;
		a1.nombre = leer.nextLine();
		return a1.nombre;
		a1.apellido = leer.nextLine();
		return a1.apellido;
		//return a1.datos;
	}
}

class Notass
{
	public int notas()
	{
		Scanner leer1 = new Scanner(System.in);
		DatosAlumno e1 = new DatosAlumno();
		System.out.println("Ingrese las notas: ");
		System.out.println("Primer parcial: ");
		e1.nota1 = leer1.nextInt();
		return e1.nota1;
		System.out.println("Segundo parcial: ");
		e1.nota2 = leer1.nextInt();
		return e1.nota2;
		System.out.println("Tercer parcial: ");
		e1.nota3 = leer1.nextInt();
		return e1.nota3;
		System.out.println("Cuantos parciales hizo en total: ");
		e1.nota4 = leer1.nextInt();	
		return e1.nota4;
	}
}

class Alumno
{
	public static void main(String []args){
		Datoss p1 = new Datoss();
		
		DatosAlumno q1 = new DatosAlumno();
		Notass f1 = new Notass();
		System.out.println("Cual es su numero de carnet: ");
		p1.capturarDatos();
		System.out.println("Cual es su nombre: ");
		p1.capturarDatos();
		System.out.println("Cual es su apellido: ");
		p1.capturarDatos();
		System.out.println("Cual es la nota del primer parcial:");
		f1.notas();
		System.out.println("Cual es la nota del segundo parcial:");
		f1.notas();
		System.out.println("Cual es la nota del tercer parcial:");
		f1.notas();
		System.out.println("Cuantos parciales tiene en total:");
		f1.notas();
		System.out.println("        INFORMACIÓN DEL ALUMNO        ");
		System.out.println("**************************************");
		System.out.println(q1.mostrarDatos());
	}
}