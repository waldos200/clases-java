import java.util.*;

class Division1{
	double resultado;
	
	public double Dividir(double x, double y)
	{
		resultado = x/y;
		return resultado;
	}
}

class Matematica1{
	public static void main(String args[])
	{
		Division numero = new Division();
		Scanner val = new Scanner(System.in);
		
		System.out.println("Digite el primer numero:");
		double a = val.nextDouble();
		
		System.out.println("Digite el segundo numero:");
		double b = val.nextDouble();
		
		System.out.println(numero.Dividir(a,b));
	}
}

