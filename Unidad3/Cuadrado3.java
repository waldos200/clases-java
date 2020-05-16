import java.util.*;
class Cuadrado3
{
	public static void main(String args[])
	{
		int acumulador=0,numero,i=0;
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite el numero a calcular el cuadrado: ");
		numero = valor.nextInt();
		while(i<numero)
		{
			acumulador = acumulador+numero;
			i++;
		}
		System.out.println("El cuadrado de "+numero+" es: "+acumulador);
	}
}