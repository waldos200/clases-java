import java.util.*;
class Cubo
{
	public static void main(String args[])
	{
		int num,suma;
		suma=0;
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite un numero: ");
		num = valor.nextInt();
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				suma = suma+num;
			}
		}
		System.out.println("El cubo de "+num+" es: "+suma);
	}
}