import java.util.Scanner;
class Supermercado
{
	int numero;
	double Tcompra,des,Tpagar;
	
	
	Scanner read = new Scanner(System.in);
	public void captura()
	{
		System.out.println("Ingrese el total de compra:     ");
		Tcompra=read.nextDouble();
		System.out.println("Ingrese un número al azar:      ");
		numero=read.nextInt();
	}
	public double escoger()
	{
		
		if (numero<=50)
		{
			des = Tcompra * 0.05;
		}
		des = Tcompra * 0.10;
	    Tpagar = Tcompra - des;
	return Tpagar;
	}

}
class DemoSupermercado
{
	public static void main(String []args)
	{
		Supermercado supe = new Supermercado();
		supe.captura();
		System.out.println("Descuento: " + supe.des);
		System.out.println("Total a pagar: " + supe.escoger());
	}
}