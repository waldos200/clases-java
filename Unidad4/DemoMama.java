/**Crear una clase que tenga un constructor en donde inicialice los atributos 
de una clase llamada Mamá dentro de ella tendra tres atibutos nombre,apellido, edad.
Ademas tendra un método llamado profesion en donde le asignara parametros de acuerdo 
a la profesion de su mamá ,debe de subrecargar el metodo dos veces .
Tambien creara otra clase llamada hijo en donde tendra 3 atributos suyos en esta 
creara un constructor sobrecargado .
Aplicar Creatividad **/
class Mama {
	String nombre,apellido;
	int edad;
	Mama() {
		nombre="Alicia ";
		apellido=" Flores";
		edad=63;
		System.out.println(nombre+""+apellido+""+edad);
	}
	
	public void profesion(String ocup) {
		String oc=ocup;
		System.out.println("La profesion de mi mama es "+ oc);
	}
	
//Sobrecarga de metodos
	public String profesion(int tiempo) {
		return "Teimpo"+tiempo;
	}

	public void profesion(int tiempo,String lab) {
		System.out.println( tiempo+ lab);
	}
}

class Hijo {
	String nombre,apellido;
	int edad;
	
	Hijo() {
		nombre= "Lilian";
		apellido="Romero";
		edad =42;
		System.out.println(nombre+""+apellido+""+edad);
	}
	
	Hijo(String mensaje) {
		System.out.println("FELIZ DIA DE LA MADRE");
	}
}

class DemoMama {
	public static void main(String lili[]) {
		Mama tia= new Mama();
		tia.profesion("Docente");
		tia.profesion(4);
		tia.profesion(7,"Lavorando");
		Hijo heredero= new Hijo();
		Hijo heredero2= new Hijo("SOY EL HIJO PREDERIDO");
	}
}