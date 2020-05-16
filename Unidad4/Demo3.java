import java.util.Scanner;
class Notafinal {
	public double n1,n2,n3,prom;
	public Notafinal() {
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese la nota1");
		n1=leer.nextDouble();
		System.out.println("ingrese la nota2");
		n2=leer.nextDouble();
		System.out.println("ingrese la nota2");
		n3=leer.nextDouble();
	}
	
	public void Notafinal() {
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese la nota1");
		n1=leer.nextDouble();
		System.out.println("ingrese la nota2");
		n2=leer.nextDouble();
		System.out.println("ingrese la nota2");
		n3=leer.nextDouble();
	}
}

class Demo3 {
	public static void main(String lili[]) {
		Notafinal p1=new Notafinal();
		p1.Notafinal();
	}
}