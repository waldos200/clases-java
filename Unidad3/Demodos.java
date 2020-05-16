class Dos{
	private String metodo(){
		return("Me siento feliz cuando hago funcionar los ejercicios");
	}
	public void realizar(){
		System.out.println(metodo());
	}
}

class Demodos{
	public static void main(String args[]){
		Dos ob = new Dos();
		ob.realizar();
	}
}