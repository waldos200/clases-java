import java.util.*;
class Estrucontrol1
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		int condicion = 1;
		int con2;
		System.out.println("Bienvenido por favor seleccione una opcion:");
		while(condicion==1)
		{
			System.out.println("1.Si quiere mostrar la sintaxis de la estructura if");
			System.out.println("2.Si quiere mostrar la sintaxis de la estructura SWITCH");
			System.out.println("3.Si quiere mostrar la sintaxis de la estructura while");
			System.out.println("4.Si quiere mostrar la sintaxis de la estructura DO WHILE");
			System.out.println("5.Si quiere mostrar la sintaxis de la estructura FOR");
			System.out.println("Digite el numero:");
			con2 = S.nextInt();
			if(con2>=1 && con2<=5){
				switch(con2)
				{
					case 1: System.out.println("Estructura IF:");
					System.out.println("if(condicion){"+"\n"+"N=4*10;}"+"\n"+"else{proceso si no se cumple la condicion}");break;
					case 2: System.out.println("Estructura SWITCH");
					System.out.println("inicializar = desde teclado");
					System.out.println("switch(inicializacion){");
					System.out.println("case 1: PROCESOS break;}");break;
					case 3: System.out.println("Estructura WHILE:");
					System.out.println("inicializar=1");
					System.out.println("while(condicion){proceso}"+"\n"+"contador++;}");break;
					case 4:  System.out.println("Estructura DO WHILE");
					System.out.println("INICIALIZAR=1");
					System.out.println("while(condicion){proceso}"+"\n"+"contador++;}");
					System.out.println("do{Si no se cumple}");break;
					case 5: System.out.println("Estructuras FOR");
					System.out.println("for{inicialización;condicion;incremento}" + "\n"+ "System.out.println(mensaje) + (contador)");break;
				}
			}
			else{
				System.out.println("Error....opcion no valida, seleccione nuevamente");
			}
			System.out.println(""+"\n");
			System.out.println("Digite 1 para continuar o 0 para salir:");
			condicion = S.nextInt();
		}
		System.out.println("Saliendo del sistema");
	}
}