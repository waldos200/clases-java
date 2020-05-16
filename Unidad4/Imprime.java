class Datos{
	public String nombre, apellido;
	Datos(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public void Imprimir(){
		System.out.println(nombre+" "+apellido);
	}
}

class Imprime{
	public static void main(String args[]){
		Datos obj = new Datos("Jose Oswaldo", "Barrera Montes");
		obj.Imprimir();
	}
}