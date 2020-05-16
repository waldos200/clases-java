import java.util.Scanner;
class Notafinal {
	public double n1,n2,n3,prom;
	public Notafinal() {
		n1=8.2;
		n2=8.3;
		n3=10.0;
		prom=(n1+n2+n3)/3;
		System.out.println("El promedio"+prom);
	}
	
	public void notaactividad() {
		n1=4.5;
		n2=10;
		prom= (n1+n2)/2;
		System.out.println("El promedio de actividades es :"+prom);
	}
}

class Demo4 {
	public static void main(String lili[]) {
		Notafinal p1=new Notafinal();
		p1.notaactividad();
		p1.n1=9.2;
		p1.n2=6.2;
		p1.n3=8.2;
		p1.prom= (p1.n1+p1.n2+p1.n3)/3;
		System.out.println("El promedio de laboratorios es :"+p1.prom);
	}
}