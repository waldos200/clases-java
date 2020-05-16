import java.util.Scanner;
class SalarioEmpleado
{
	String nombre;
	int salario;
	int respuesta;
	float resultado;
	float resultadofinal;
	
		public void DatosEmpleado()
		{
			Scanner entrada= new Scanner(System.in);
			System.out.println("INGRESE LOS DATOS DEL EMPLEADO");
			System.out.println("================================="+"\n");
			
			System.out.println("Ingrese el nombre del empleado ");
			nombre= entrada.nextLine();
			System.out.println("================================="+"\n");
			
			System.out.println("Ingrese el salario del empleado: ");
			salario= entrada.nextInt();
			System.out.println("================================="+"\n");
			
			respuesta=entrada.nextInt();
		
			switch(salario){
				
				case 1:
				       resultado=salario*.30f;
					   resultadofinal=salario+resultado;
					   break;
					   
				case 2:
					   resultado=salario*.20f;
					   resultadofinal=salario+resultado;
					   break;
					   
				case 3:
					   resultado=salario*.10f;
					   resultadofinal=salario+resultado;
					   break;
					   
				default: System.out.println("El salario ingresado no es elegible para un aumento de salario");
					   break;
		
		}
		
		if(resultadofinal<301){
		System.out.println("El salario del empleado son $300, entonces se ha dado un 30% de aumento a su salario ya que formar parte de la Categoria C, su nuevo salario es: "+resultadofinal );
		}else if(resultadofinal<501){
			System.out.println("El salario del empleado son $300, entonces se ha dado un 20% de aumento a su salario ya que formar parte de la Categoria B, su nuevo salario es: "+resultadofinal );
		}else{
			System.out.println("El salario del empleado son $300, entonces se ha dado un 10% de aumento a su salario ya que formar parte de la Categoria A, su nuevo salario es: "+resultadofinal );
		}
	}
}




