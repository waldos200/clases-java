//Ejercicio1

class Celular {
	String mj;
	double precio;
	
	public Celular() {
		System.out.println("Por que te gustan los celulares");
	}
	
	public Celular(String m, double p) {
		mj = m;
		precio= p;
		System.out.println(mj+" de "+precio+" dolares ");
	}
}

class digicel extends Celular {
	public digicel() {
		System.out.println("Por que le llamo a mi Familia");
	}
	
	public digicel(String m, double p) {
		super(m,p);
	}
}

class Promocion extends Celular {
	public String costollamada() {
		return("Por que  regalan saldo triple");
	}
}

class DemCelular {
	public static void main(String arg[]) {
		digicel obj1 = new digicel();
		digicel obj2 = new digicel("y me recarga saldo de ",10.00);
		Promocion obj3=new Promocion();
		System.out.println(obj3.costollamada());
	}
}