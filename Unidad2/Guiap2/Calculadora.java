import java.util.*;
class Suma{
	
	int primerNum, segundoNum;
	
	public int Sumar()
	{
		return primerNum+segundoNum;
	}
	
	public int Restar()
	{
		return primerNum-segundoNum;
	}
	
	public int Residuo()
	{
		return primerNum%segundoNum;
	}
	
	public int Dividir()
	{
		return primerNum/segundoNum;
	}
}

class Calculadora{
	
	public static void main(String []args){
		Scanner leer = new Scanner(System.in);
			Suma n1 = new Suma();
			System.out.println("Ingrese el primer numero: ");
			n1.primerNum = leer.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			n1.segundoNum = leer.nextInt();
			System.out.println("La suma es:" + n1.Sumar());
			System.out.println("La resta es:" + n1.Restar());
			System.out.println("El producto es:" + n1.Residuo());
			System.out.println("La division es :" + n1.Dividir());
	}
}