class Sobrecarga {
	public void Numeros(int x, int y){
		System.out.println("Metodo que recibe enteros.");
	}
	public void Numeros(double x, double y){
		System.out.println("Metodo que recibe numeros reales.");
	}
	public void Numeros(String cadena){
		System.out.println("Metodo que recibe una cadena: "+ cadena);
	}
}

class DemoSobremi{
	public static void main(String args[]){
		Sobrecarga s = new Sobrecarga();
		s.Numeros(8,7);
		s.Numeros(3.2,5.7);
		s.Numeros("Monillo007");
	}
}