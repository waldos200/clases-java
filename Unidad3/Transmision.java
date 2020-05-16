class Transmision{
	String tipo;
	int num;
	public void parking(){
		System.out.println("La transmision esta en PARKING");
	}
	public void reversa(){
		System.out.println("La transmision ha sido cambiada a REVERSA");
		parking();
	}
	public String neutro(){
		return "La transmision ha sido cambiada a NEUTRO";
	}
	public void directa(){
		System.out.println("La transmision ha sido cambiada a Directa");
		System.out.println(neutro());
	}
}