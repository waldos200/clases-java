// Ejercicio2

class Empleado {
	public Empleado() {
		System.out.println("---- Mi Experiencia Laboral ----");
	}
	
	public Empleado(double tiempo) {
		System.out.println("He trabajodo aca por "+tiempo+" años");
	}
	
    public Empleado (String cargo) {
		System.out.println("Me he desempañado en el cargo de: "+cargo);
	}
}

class Programador extends Empleado {
	public Programador(String nomempresa, String departamento) {
		System.out.println("Trabajo en: "+nomempresa+", ubicada en: "+departamento);
	}
	
    public Programador(double tiempo) {
		super(tiempo);
	}
	
	public Programador(String cargo) {
		super(cargo);
	}
}

class DemEmpleado {
	public static void main (String args[]) {
		Programador obj1=new Programador("Digicel","Zona Industrial Santa Elena");
		Programador obj2=new Programador("Ingeniero de Plataformas de Valor Agregado");
		Programador obj3=new Programador(3.5);
	}
}