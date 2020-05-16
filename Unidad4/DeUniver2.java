class Universidad {
	public String nombre,direccion;
	private double pagocuota;
	public static String carrera;
	
	private static String facultad;
	Universidad() {
		nombre="UTEC";
		direccion="12 av.norte #210";
		pagocuota=65.0;
	}

	private Universidad(String mensaje) {
		System.out.println("Este es un constructor privado"+"pero "+mensaje);
	}

	public Universidad(String x,String y) {
		x=x;
		y=y;
		System.out.println(x+"\t"+y);
		Universidad y1=new Universidad("Pude invocarlo");
	}
	
	public void m1() {
		System.out.println("nombre :"+nombre+"\n direccion"+direccion);
		System.out.println("LA couta de la Universidad es :"+pagocuota);
	}
	
	public void m1(String mensaje){
		System.out.println("nombre :"+nombre+"\n direccion"+direccion+""+"\n"+mensaje);
	}
	
	public void m1(double x,double y){
		double a,b,c;
		a=x;
		b=y;
		c=a+b;
		System.out.println("Resultado :"+c);
	}
	
	public static void m1(String c,String f ) {
		carrera=c;
		facultad=f;
		System.out.println("La carrera es :"+carrera+"\n facultad"+facultad);
	}
}

class DeUniver2 {
	public static void main(String lli[]) {
		Universidad u1=new Universidad();
		Universidad u2=new Universidad("Estoy jugando","Y me gusta mucho");
		u1.m1();
		u1.m1("Estos son los datos de esta instituciòn");
		u1.m1(8.9,6.9);
		Universidad.m1("Informatica ","Ingenieria en Sistemas");
	}
}