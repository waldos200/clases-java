//Clase principal
import java.util.Scanner;
class Sueldo{
  public static void main(String[] rogel){
  Scanner leer = new Scanner(System.in);
  Sueldo1 Pago = new Sueldo1();
  System.out.println("=============INVOCANDO LA CLASE PLANTILLA===========");
  
  System.out.println("Ingrese el nombre del empreado :");
  Pago.nomempleado = leer.nextLine();
  System.out.println("Ingrese el sueldo base del empleado :");
  Pago.sueldobase = leer.nextDouble();
  System.out.println("Ingrese el descuento del ISSS :");
  Pago.descuisss = leer.nextDouble();
  System.out.println("Ingrese el descuento de la renta :");
  Pago.descurenta = leer.nextDouble();
  Pago.sueldopago = Pago.sueldobase-(Pago.descuisss+Pago.descurenta);
  
  System.out.println("=============ATRIBUTOS DE LA CLASE SUELDO=============");
  System.out.println("El nombre del empleado es :"+Pago.nomempleado+"\n"+"El sueldo base del empleado es :$"+Pago.sueldobase);
  System.out.println("El descuento del ISSS es :$"+Pago.descuisss+"\n"+"El decuento de la renta es :$"+Pago.descurenta);
  System.out.println("El sueldo a pagar es :$"+Pago.sueldopago);
  }
}