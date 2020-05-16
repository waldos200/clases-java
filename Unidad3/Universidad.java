class Universidad1{
	private edificio(){
		System.out.println("edificio si ");
		return edificio;
	}
}

class Universidad{
	public static void main (String li[]){
		Universidad1 utec= new Universidad1();
		utec.edificio();
	}
}