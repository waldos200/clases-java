import Iglesia1.*;

public class Iglesia{
	public static void main(String[] args){
		System.out.println("==================INVOCANDO LA CLASE PANTILLA=================");
		System.out.println("");
		
		System.out.println("Nombre de la iglesia:");
		iglesia1 a1 = new iglesia1();
		a1.nomIglesia = "Mision Cristiana Juda";
		System.out.println(a1.nomIglesia);
		System.out.println(" ");
		
		System.out.println("Cuales son los dias de culto:");
		iglesia1 e1 = new iglesia1();
		e1.dias_culto = "Martes, Jueves y Domingo";
		System.out.println(e1.dias_culto);
		System.out.println(" ");
		
		System.out.println("Cual es el horario del culto :");
		iglesia1 i1 = new iglesia1();
		i1.horaIglesia = "Martes y Jueves 6:30 - 8:00 y Domingos de 10:30 - 12:00";
		System.out.println(i1.horaIglesia);
		System.out.println(" ");
		
		System.out.println("Cual es el nombre del pastor:");
		iglesia1 o1 = new iglesia1();
		o1.nom_pastor = "Waldo Mendoza";
		System.out.println(o1.nom_pastor);
		System.out.println(" ");
		
		System.out.println("=========================FIN==============================");
	}
}