import java.util.*;
class Calculadora
{
	public static void main(String args[])
	{
		char opcion;
		int n1,n2,resultado;
		resultado=0;
		Scanner valor= new Scanner(System.in);
		System.out.println("*******************************************************");
		System.out.println("******** SUMA --------------------> PRESIONA + ********");
		System.out.println("******** RESTA -------------------> PRESIONA - ********");
		System.out.println("******** PRODUCTO ----------------> PRESIONA * ********");
		System.out.println("******** DIVISION ----------------> PRESIONA / ********");
		System.out.println("******** RESTO DE DIVISION -------> PRESIONA % ********");
		System.out.println("*******************************************************");
		System.out.println("Digite una opcion: ");
		opcion= valor.next().charAt(0);
		System.out.println("Digite el primer valor entero: ");
		n1=valor.nextInt();
		System.out.println("Digite el segundo valor: ");
		n2=valor.nextInt();
		switch(opcion)
		{
			case'+': resultado=n1+n2; break;
			case'-': resultado=n1-n2; break;
			case'*': resultado=n1*n2; break;
			case'/': resultado=n1/n2; break;
			case'%': resultado=n1%n2; break;
			default: System.out.println("Opcion incorrecta"); break;
		}
		System.out.println("El resultado de la operacion es: "+resultado);
	}
}