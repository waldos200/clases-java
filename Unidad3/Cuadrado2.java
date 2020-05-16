import java.util.*;
class Cuadrado2
{
	public static void main(String args[])
	{
		int acumulador,numero;
		acumulador=0;
		Scanner valor= new Scanner(System.in);
		System.out.println("Digite el numero a calcular el cuadrado: ");
		numero = valor.nextInt();
		for(int i=0;i<numero;i++)
		{
			acumulador = acumulador+numero;
		}
		System.out.println("El cuadrado de "+numero+" es: "+acumulador);
	}
}