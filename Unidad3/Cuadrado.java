import java.util.*;
class Cuadrado
{
	public static void main(String args[])
	{
		int acumulador, numero, i;
		acumulador = 0;
		i = 0;
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite el numero a calcular el cuadrado: ");
		numero = valor.nextInt();
		do
		{
			acumulador = acumulador+numero;
			i++;
		}
		while(i<numero);
		System.out.println("El cuadrado de "+numero+" es: "+acumulador);
	}
}