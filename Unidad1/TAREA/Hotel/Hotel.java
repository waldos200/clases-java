import Hotel1.*;

public class Hotel{
	public static void main(String[] args){
		System.out.println("==================INVOCANDO LA CLASE PANTILLA=================");
		System.out.println("");
		
		System.out.println("Nombre del cliente:");
		hotel1 a1 = new hotel1();
		a1.nom_cliente = "Silvia de Mendoza";
		System.out.println(a1.nom_cliente);
		System.out.println(" ");
		
		System.out.println("Cuantas personas se quedaran:");
		hotel1 e1 = new hotel1();
		e1.num_personas = 5;
		System.out.println(e1.num_personas);
		System.out.println(" ");
		
		System.out.println("Cual es el numero de telefono para contactarlo:");
		hotel1 i1 = new hotel1();
		i1.num_tel = 70446699;
		System.out.println(i1.num_tel);
		System.out.println(" ");
		
		System.out.println("Cuantos dias estaran:");
		hotel1 o1 = new hotel1();
		o1.estadia = 3;
		System.out.println(o1.estadia);
		System.out.println(" ");
		
		System.out.println("=========================FIN==============================");
	}
}