import java.util.*;

class Entrar{
	public static void main(String args[]){
		Scanner valorDigitado = new Scanner(System.in); //Creando objeto de la clase Scanner
		Personas Estudiantes = new Personas();//Creando objeto de la clase personas, el objeto se llama Estudiantes
		
		System.out.println("\n\n Digite el nombre del estudiante:");
		Estudiante.nombre = valorDigitado.nextline();
		
		System.out.println("\n\n Digite el apellido del estudiante:");
		Estudiante.apellido = valorDigitado.nextline();
		
		System.out.println("\n\n Digite la edad del estudiante:");
		Estudiante.edad = valorDigitado.nexInt();
		
		System.out.println("\n***RESULTADO DEL METODO***");
		System.out.println(Estudiante.datosPersonales());
	}
}