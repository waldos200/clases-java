import java.util.Scanner;

class Clinica{
	public static void main (String args[]){
		String nombrePaciente, nombreMedico, unidadReferencia;
		Scanner datos;
		
		datos = new Scanner(System.in);
		System.out.println("\n**************************REGISTRO DE PACIENTES******************************\n");
		System.out.println("Ingrese el Nombre del Paciente:");
		nombrePaciente = datos.nextLine();
		System.out.println("\n Ingrese el Nombre del Medico:");
		nombreMedico = datos.nextLine();
		System.out.println("\n Ingrese el nombre de la unidad a ser referido:");
		unidadReferencia = datos.nextLine();
		
		System.out.println("\n ************************ REGISTRO REALIZADO*************************");
		System.out.println("El paciente a ingresar es:"+nombrePaciente);
		System.out.println("El medico que lo atendera es el/la Dr(a). :"+nombreMedico);
		System.out.println("El paciente sera referido a la unidad de:"+unidadReferencia);
	}
}