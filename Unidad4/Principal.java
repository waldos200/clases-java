class Ejemplo {
	public void Mensaje(){
		System.out.println("Este es un mensaje");
	}
	public void Mensaje(String m){
		System.out.println(m);
	}
}

class Principal{
	public static void main(String args[]){
		Ejemplo instancia = new Ejemplo();
		instancia.Mensaje("...Probando sobrecarga...");
	}
}