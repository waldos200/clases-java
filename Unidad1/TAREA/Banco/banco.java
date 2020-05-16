import Banco1.*;

public class banco{
	public static void main(String[] args){
		System.out.println("==================INVOCANDO LA CLASE PANTILLA=================");
		System.out.println("");
		
		System.out.println("Nombre del empleado:");
		banco1 a1 = new banco1();
		a1.nom_empleado = "Waldo Mendoza";
		System.out.println(a1.nom_empleado);
		System.out.println(" ");
		
		System.out.println("Cuales son los dias de culto:");
		banco1 e1 = new banco1();
		e1.dinero_caja = 400.00;
		System.out.println(e1.dinero_caja);
		System.out.println(" ");
		
		System.out.println("Cuanto sera el monto de la remesa:");
		banco1 i1 = new banco1();
		i1.monto_remesa = 150.00;
		System.out.println(i1.monto_remesa);
		System.out.println(" ");
		
		System.out.println("Cual es el numero de cuenta:");
		banco1 o1 = new banco1();
		o1.numero_cuenta = 68;
		System.out.println(o1.numero_cuenta);
		System.out.println(" ");
		
		System.out.println("=========================FIN==============================");
  }
}