import Farmacia1.*;

public class Farmacia{
	public static void main (String[] args){
		System.out.println("===============INVOCANDO LA CLASE PLANTILLA=============");
		
		System.out.println("El nombre del empleado es:");
		farmacia1 a1 = new farmacia1();
		a1.nom_empleado = "Waldo Mendoza";
		System.out.println("N.E="+a1.nom_empleado);
		System.out.println(" ");
		
		System.out.println("Las ventas que a hecho son:");
		farmacia1 e1 = new farmacia1();
		e1.num_ventas = 30;
		System.out.println("N.V="+e1.num_ventas);
		System.out.println(" ");
		
		System.out.println("La bonificacion por venta es la siguiente");
		farmacia1 i1 = new farmacia1();
		i1.bonificacion = 3;
		System.out.println("La bonificacion por compra es= $"+i1.bonificacion);
		System.out.println(" ");
		
		System.out.println("Las horas trabajadas en la semana son las siguientes");
		farmacia1 o1 = new farmacia1();
		o1.horas_trabajadas = 44;
		System.out.println("Horas totales="+o1.horas_trabajadas);
		System.out.println(" ");
		
		System.out.println("=====================FIN=========================");
	}
}

