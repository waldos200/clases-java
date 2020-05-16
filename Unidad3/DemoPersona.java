class Persona {
	private String nombre,apellido;
	public int edad;
	public void mt1(){
		nombre="Lilian";
		apellido="Romero";
		System.out.println(nombre+" "+apellido);
	}
	public String mt2() {
		return nombre+" "+apellido;
	}
	public void mt3(String n,String a) {
		System.out.println("nombre :"+n+"Apellido :"+ a);
	}
	public String mt4(String n,String a) {
		nombre=n;
		apellido=a;
		return nombre+" "+apellido;
	}
	public void setmt5() {
		System.out.println(nombre);
	}
	public String getmt6() {
		nombre="Jesus";
		return nombre;
	}
	private void met7() {
		System.out.println("Saludos");
	}
	public void mt8(){
		met7();
	}
}

class DemoPersona {
	public static void main(String []lili) {
		Persona Alum= new Persona();
		//Alum.nombre="Alicia";
		Alum.mt1();
		System.out.println(Alum.mt2());
		Alum.mt3("Jose ","Flores");
		System.out.println(Alum.mt4("Walter","Romero"));
		Alum.setmt5();
		System.out.println(Alum.getmt6());
		Alum.mt8();
	}
}