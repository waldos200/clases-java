class Area{
	private double base;
	private double altura;
	Area(double b, double a){
		base = b;
		altura = a;
	}
	
	void setBase(double b)
	{ base=b; }
	
	double getBase()
	{ return base; }
	
	void setaltura(double a)
	{ altura=a; }
	
	double getAltura()
	{ return altura; }
	
	double calculoArea()
	{ return base*altura; }
}

class DemoArea{
	public static void main(String args[]){
		Area a1 = new Area(15.3,7.2);
		System.out.println("La base es:" + a1.getBase());
		System.out.println("La altura es:" + a1.getAltura());
		System.out.println("El area es:" + a1.calculoArea());
	}
}