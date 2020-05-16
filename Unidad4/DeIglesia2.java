import java.util.Scanner;
class Iglesia {
	private static String nombre,direccion;
	
	private Iglesia() {
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese el nombre de la iglesia");
		nombre=leer.nextLine();
		System.out.println("Ingrese el direccion de la iglesia");
		direccion=leer.nextLine();
	}
	
	private Iglesia(String men) {
		Scanner leer=new Scanner(System.in);
		System.out.println("Ingrese el nombre de la iglesia");
		nombre=leer.nextLine();
		System.out.println("Ingrese el direccion de la iglesia");
		direccion=leer.nextLine();
	}

	private static String m1() {
		return "nombre de la inglesia :"+nombre+"\nla direccion es "+direccion;
	}
	
	private static String m1(String mensaje) {
		return "nombre de la inglesia :"+nombre+"\nla direccion es "+direccion+"\n"+mensaje;
	}
	
	static public void m1(int a) {
		Iglesia I1=new Iglesia();
		Iglesia I2=new Iglesia("Datos de la Iglesia son :");
		System.out.println(Iglesia.m1());
		System.out.println(Iglesia.m1("Nuevos datos "));
	}
}

class DeIglesia2 {
	public static void main(String lili[]) {
		Iglesia.m1(4);
	}
}