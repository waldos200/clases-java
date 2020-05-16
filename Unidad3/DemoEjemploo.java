class Ejemplo{
	private int x; //acceso private
	public int y; //acceso public
	int z; //acceso predeterminado
	
	//Metodos accesores para la variable private 
	void establecerX(int a)
	{ x=a; }
	
	int obtenerX()
	{ return x; }
}

class DemoEjemploo{
	public static void main(String args[]){
		Ejemplo ob = new Ejemplo();
		
		ob.establecerX(5);
		//ob.x = 5 error variable private
		ob.y = 10;
		ob.z = 20;
		System.out.println("Valor de x es:" + ob.obtenerX());
		System.out.println("Valoe de y es:" + ob.y);
		System.out.println("Valor de z es:" + ob.z);
	}
}