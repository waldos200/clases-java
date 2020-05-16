class Transmision{
	String tipo;
	int num;
	public void parking(){
		System.out.println("la trnasmision esta en PARKING");
	}
	public void reversa(){
		System.out.println("La transmision ha sido cambiada a REVERSA");
		parking();
	}
	public String neutro(){
		return "La transmision ha sido cambiado a NEUTRO";
	}
	public void directa(){
		System.out.println("La transmision ha sido cambiada a DIRECTA");
		System.out.println(neutro());
	}
}

class Transmision1{
	public static void main(String args[]){
		Transmision a1 = new Transmision();
		a1.parking();
		a1.reversa();
		a1.neutro();
		a1.directa();
	}
}