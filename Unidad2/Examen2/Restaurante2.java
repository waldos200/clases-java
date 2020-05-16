import java.util.*;
import Examen2.*;

class Restaurante2
{
	public static void main(String[]args){
		Scanner leer = new Scanner(System.in);
		Restaurante a1 = new Restaurante();
		Comidas e1 = new Comidas();
		Cliente i1 = new Cliente();
		System.out.println("Cual es el nombre del Restauraunte:");
		a1.nombre = leer.nextLine();
		//System.out.println(a1.TipoServicio());
		System.out.println("Donde esta ubicado el restaurante");
		a1.direccion = leer.nextLine();
		System.out.println("Estas son las caracteristicas del restaurante:");
		System.out.println(a1.Caracteristicas());
		System.out.println("Este es el menu que tiene el restaurante:");
		System.out.println(e1.Menu());
		System.out.println("Cual es el nombre del cliente:");
		i1.nombre = leer.nextLine();
		System.out.println("Cual es el apellido del cliente:");
		i1.apellido = leer.nextLine();
		System.out.println(i1.Mostrar());
	}
}