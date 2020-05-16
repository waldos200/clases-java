import java.util.Scanner;
class Empleado
{
	String nombre,apellido;
	public String NombreEmpleado()
	{
		return nombre+" "+apellido;
	}
}
class SalarioHe
{
	public void Horasxtras()
	{
		Scanner leer=new Scanner(System.in);
        int horassemana;
        double pagonormal,valorhora,pagohorasdoble,pagohorastriple,pagofinal;
        System.out.println("Ingrese las horas trabajadas en la semana:");
        horassemana = leer.nextInt();
        System.out.println("Ingrese el sueldo por hora:");
        valorhora = leer.nextDouble();
		pagohorastriple=0;
		pagohorasdoble=0;
		if(horassemana<=44){
			pagonormal = horassemana*valorhora;
		}else{
			pagonormal = 44*valorhora;
		}
		if(horassemana>52){
			pagohorastriple = (horassemana-52)*valorhora*3;
			pagohorasdoble = 8*valorhora*2;
		}else{
			if((horassemana>44)&&(horassemana<=52)){
				pagohorasdoble = (horassemana-44)*valorhora*2;
			}
		}
        pagofinal=pagonormal+pagohorastriple+pagohorasdoble;
		
        System.out.println("\nSu sueldo de horas extras al 300% es: \t$"+pagohorastriple);
        System.out.println("\nSu sueldo de horas extras normales es: \t$"+pagohorasdoble);
        System.out.println("\nSu sueldo normal es: \t$"+pagonormal);
        System.out.println("\nSu sueldo final: \t$"+pagofinal);
	}
}

class Salario
{
	public static void main(String []rogel)
	{
		System.out.println("LLAMANDO A LA CLASE EMPLEADO");
		Scanner entrada = new Scanner(System.in);
		Empleado p1 = new Empleado();
		System.out.println("Ingrese el nombre del empleado: ");
		p1.nombre = entrada.nextLine();
		System.out.println("Ingrese el apellido del empleado: ");
		p1.apellido = entrada.nextLine();
		System.out.println(p1.NombreEmpleado());
		System.out.println("****************************************************");
		System.out.println("CALCULANDO EL SUELDO Y LAS HORAS EXTRAS DEL EMPLEADO");
	    SalarioHe d1 = new SalarioHe();
		d1.Horasxtras();
		
	}
}