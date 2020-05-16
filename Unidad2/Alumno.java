import java.util.Scanner;
import Alumnado.*;

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
		f1.notas();
		System.out.println("        INFORMACIÓN DEL ALUMNO        ");
		System.out.println("**************************************");
		System.out.println(q1.mostrarDatos());
	}
}