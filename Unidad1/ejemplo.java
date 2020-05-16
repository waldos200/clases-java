import Ejemplo.*;
class PrinciEjemplo
{
	public static void main(String []lilin)
	{
		
		System.out.println("ALUMNO DE POO -SECC-01");
		System.out.println("=======================================");
		String nombre ="Ligia Vasquez";
		String Ncarnet="25-3456-2015";
		System.out.println("Mi nombre es :"+nombre+"\t"+"Carnet No :"+Ncarnet);
		System.out.println("=======================================");
		
		System.out.println(" Objeto 1 de la clase Pizza");
		Pizza p1=new Pizza();
		p1.ingredientes=" queso, jamon,salsa,peperoni,cebolla,chile,pina";
		System.out.println("Los ingredientes que tiene la pizza son :"+p1.ingredientes);
		System.out.println("");
		System.out.println(" Objeto 2 de la clase Pizza");
		Pizza p2=new Pizza();
		p2.ingredientes=" queso,cebolla,chile,pina";
		System.out.println("Los ingredientes que tiene la pizza son :"+p2.ingredientes);
		System.out.println("");
		System.out.println("=======================================");
		System.out.println(" Objeto 1 de la clase Sala de venta");
		SalaVenta s1=new SalaVenta();
		s1.ubicacion="Calle Arce Nº 123 San Salvaor";
		System.out.println("Estamos Ubicados en :"+s1.ubicacion);
		System.out.println(" Objeto 2 de la clase Sala de venta");
		SalaVenta s2=new SalaVenta();
		s2.ubicacion="Calle la dario Nº 12 San Salvador";
		System.out.println("Estamos Ubicados en :"+s2.ubicacion);
		
	}
}


