import java.util.Scanner;
class Datos1{
  String nombre,ubicacion;
  int numplantas,numconsult;
}

class Hospital{
  public static void main(String[] rogel){
    Scanner leer = new Scanner(System.in);
	Datos1 Noso = new Datos1();
	
	System.out.println("Ingrese el nombre del hospital :");
	Noso.nombre = leer.nextLine();
	System.out.println("Ingrese la ubicacion de hospital :");
	Noso.ubicacion = leer.nextLine();
	System.out.println("Ingrese el numero de plantas del hospital :");
	Noso.numplantas = leer.nextInt();
	System.out.println("Ingrese el numero de consultorios del hospital :");
	Noso.numconsult = leer.nextInt();
	System.out.println("**************************ATRIBUTOS DE LA CLASE HOSPITAL**************************");
	
	System.out.println("El nombre del hospital es :"+Noso.nombre+"\n"+"La ubicacion del hospital es :"+Noso.ubicacion);
	System.out.println("El numero de plantas del hospital es:"+Noso.numplantas);
	System.out.println("El numero de consultorios del hospital es:"+Noso.numconsult);
  }
}