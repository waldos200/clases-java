class Cinco{
	private String X(String a){
		return(a);
	}
	public String Y(String b){
		return X(b);
	}
}

class DemoCinco{
	public static void main(String args[]){
		Cinco ob = new Cinco();
		System.out.println(ob.Y("Clases de metodos mas dificiles"));
	}
}