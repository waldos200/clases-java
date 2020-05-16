class NumUno{
	private void metodo1(){
		System.out.println("esta clase me estreza pensando");
	}
	public void metodo2(){
		metodo1();
	}
}

class Demometodo{
	public static void main(String args[]){
		NumUno obj1 = new NumUno();
		obj1.metodo2();
		
	}
}