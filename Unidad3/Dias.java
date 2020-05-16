import java.util.*;
class Dias
{
	public static void main(String args[])
	{
		int Ndia;
		String dia;
		Scanner valor= new Scanner(System.in);
		System.out.println("Digite un numero entero ente 1 y 7: ");
		Ndia=valor.nextInt();
		switch(Ndia)
		{
			case 1: dia="Lunes";break;
			case 2: dia="Martes";break;
			case 3: dia="Miercoles";break;
			case 4: dia="Jueves";break;
			case 5: dia="Viernes";break;
			case 6: dia="Sabado";break;
			case 7: dia="Domingo";break;
			default:dia="El numero se encuentra fuera de rango";break;
		}
		System.out.println(dia);
	}
}