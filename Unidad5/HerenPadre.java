import java.util.*;

class Padre {
	String colorpelo;
	String colorojos;

	public Padre() {
		colorpelo = "colocho";
		colorojos ="Azules";
	}
	
	public void caracteristicas() {
		System.out.println ("Esta es la herencia de mi padre");
	}
}

class Hijo extends Padre {
	public String caracteristicashijo(String prof,String ocu) {
		prof= prof;
		ocu=ocu;
		return ("Mi profesion es :"+prof+" Y mi ocupación es "+ ocu);
	}
	
	public void caracteristicashijo() {
		System.out.println("Mi pelo se parece a los de mi abuelo :"+colorpelo);
		System.out.println("Mis ojos son :"+colorojos+" y se parecen a los de mi abuelo");
	}
}

class Nieto extends Hijo {
	public Nieto() {
		System.out.println("tengo los mismos atributos de mi abuelo y de mi padre");
	}
}

class HerenPadre {
	public static void main(String arg[]) {
		String prof,ocu;
		Nieto obj= new Nieto ();
		obj.caracteristicas();
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingrese la profesion");
		prof= dato.nextLine();
		System.out.println("Ingrese la ocupacion");
		ocu= dato.nextLine();
		System.out.println(obj.caracteristicashijo(prof,ocu));
		obj.caracteristicashijo();
	}
}