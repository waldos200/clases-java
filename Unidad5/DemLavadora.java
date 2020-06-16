// Ejercicio3
import java.util.Scanner;

class Lavadora {
	String marca, potencia;
	int volumen;
	
	public Lavadora() {
		System.out.println("========= Ajustes de Lavado =========");
	}
	
	public void funcion(String p) {
		Scanner input=new Scanner(System.in);
		System.out.print("Ingrese Potencia de Lavado (Baja/Media/Alta): ");
		potencia=input.nextLine();
		System.out.print("Ingrese Rapidez de Lavado (1,2,3,4,5): ");
		volumen=input.nextInt();
		System.out.println();
		System.out.println("PROCESO: Iniciado");
	}
	
	public void funcion() {
		System.out.println("PROCESO: Vaciando detergente");
	}
	
	public void secar() {
		System.out.println("PROCESO: Secando");
	}
	
	public void parar() {
		System.out.println("PROCESO: Terminado !");
	}
}

class Lavaplatos extends Lavadora {
	public Lavaplatos(String marca) {
		System.out.println("LAVAPLATOS Marca: "+marca);
	}
	
	public void detallar() {
		System.out.println();
		System.out.println("El proceso se ejecuto a potencia: "+potencia+", con un volumen: "+volumen+" elegido" );
	}
}

class DemLavadora {
	public static void main (String[] args) {
		Lavaplatos obj1=new Lavaplatos("SAMSUNG");
		obj1. funcion("Datos de lavado");
		obj1. funcion();
		obj1.secar();
		obj1.parar();
		obj1.detallar();
	}
}