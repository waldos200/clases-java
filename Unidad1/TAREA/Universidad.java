//Clase principal
import java.util.Scanner;
class Universidad{
	public static void main (String[] args) {
		Scanner leer = new Scanner(System.in);
		Universidad1 objeto1 = new Universidad1();
		System.out.println("************************INVOCANDO A LA CLASE PLANTILLA**********************");
		
		System.out.println("Ingrese nombre de la universidad:");
		objeto1.nombre = leer.nextLine();
		System.out.println("Ingrese nombre de la carrera:");
		objeto1.carrera = leer.nextLine();
		System.out.println("Ingrese el total de la materias en el pensum:");
		objeto1.materias = leer.nextInt();
		System.out.println("Ingrese cantidad de ciclos:");
		objeto1.ciclos = leer.nextInt();
		System.out.println("************************ATRIBUTOS DE LA CLASES UNIVERSIDAD*********************");
		
		System.out.println("El nombre de la universidad es : "+objeto1.nombre+"\n"+"El nombre de la carrera es : "+objeto1.carrera);
		System.out.println("La cantidad de materia en total es : "+objeto1.materias+"\n"+"La cantidad de ciclos en total es : "+objeto1.ciclos);
	}	
}
