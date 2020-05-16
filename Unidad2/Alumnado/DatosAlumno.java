import java.util.Scanner;
package Alumnado;

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
		System.out.println("carnet: "+carnet);
		System.out.println("Nombre completo: "+nombreCompleto());
		System.out.println("Parcial 1: "+nota1);
		System.out.println("Parcial 2: "+nota2);
		System.out.println("Parcial 3: "+nota3);
		System.out.println("Promedio: "+Promedio());
		//System.out.println("carnet: "+carnet+"/n"+"Nombre completo"+nombreCompleto()"/n"+"Parcial 1: "+nota1+"/n"+"Parcial 2: "+nota2+"/n"+"Parcial 3: "+nota3+"/n"+"Promedio: "+Promedio());
		return datos;
	}
}