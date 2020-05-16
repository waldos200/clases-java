import java.util.Scanner;
package Alumnado;

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