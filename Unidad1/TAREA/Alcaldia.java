//Clase principal
import java.util.Scanner;
class Alcaldia{
  public static void main(String[] rogel){
    Scanner leer = new Scanner(System.in);
	Comuna Info = new Comuna();
	System.out.println("*********************INVOCANDO LA CLASE PLANTILLA**************************");
	
	System.out.println("Ingrese el municipio de la alcaldia :");
	Info.municipio = leer.nextLine();
	System.out.println("Ingrese el departamento de la alcaldia :");
	Info.departamento = leer.nextLine();
	System.out.println("Ingrese el nombre del alcalde :");
	Info.nomalcalde = leer.nextLine();
	System.out.println("Ingrese el numero de empleados de la alcaldia :");
	Info.numempleados = leer.nextInt();
	System.out.println("************************ATRIBUTOS DE LA CLASE ALCALDIA**********************");
	
	System.out.println("Municipio de alcaldia :"+Info.municipio+"\n"+"Departamento de alcaldia :"+Info.departamento);
	System.out.println("El nombre del alcalde es :"+Info.nomalcalde+"\n"+"El numero de empleados de la alcadia es :"+Info.numempleados);
  }
}