import java.util.Scanner;
class DatosEmpleados
{
	String nombre;
	String genero;
	int codigo;
	float salario;
	
		public void capturarDatos()
		{
			Scanner leer= new Scanner(System.in);
			System.out.println("INGRESE LOS DATOS DEL EMPLEADO");
			System.out.println("================================="+"\n");
			System.out.println("Ingrese el genero del empleado: ");
			genero= leer.nextLine();
			System.out.println("================================="+"\n");
			System.out.println("Ingrese el nombre del empleado ");
			nombre= leer.nextLine();
			System.out.println("================================="+"\n");
			System.out.println("Ingrese el codigo del empleado: ");
			codigo= leer.nextInt();
			System.out.println("================================="+"\n");
			System.out.println("Ingrese el salario del empleado: ");
			salario= leer.nextInt();
			System.out.println("================================="+"\n");
		
		}

		public void calculoRenta()
		{
			
			float resultado = salario * 0.10f;
			float resultado2 = salario - resultado;
			System.out.println( resultado2+ "\n");
		}
		public void mostrarDatos()
		{ 
			System.out.println("LOS DATOS DEL EMPLEADO SON");
			System.out.println("================================="+"\n");
			System.out.println( genero+ "\n" +nombre+ "\n" +codigo);
		}
}