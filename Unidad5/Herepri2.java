class DatoHer {
	String colorpelo;
	String colorojos;
	
	DatoHer(String p,String o) {
		colorpelo = p;
		colorojos =o;
		System.out.println( "El color de pelo es "+colorpelo+" y sus ojos son de color :"+colorojos) ;
	}
	
	DatoHer(String x) {
		colorpelo = x;
		String colorpiel ="morena";
		System.out.println( "La chica es pelo "+ colorpelo+" piel "+colorpiel);
	}
}

class Dato extends DatoHer {
	Dato() {
		super("negro","verdes");
	}
	
	Dato(String n) {
		super("Rubio");
	}
	
	public void llamar() {
		System.out.println ("llamando");
	}
}

class Herepri2 {
	public static void main (String a[]) {
		Dato ob= new Dato();
		Dato b2= new Dato("g");
		ob.llamar();
	}
}