class NTres {
	public String b = "Ejercicio";
	private void metodos(String a){
		System.out.println(a);
	}
	public void retorno(){
		metodos(b);
	}
}

class DemoNTres{
	public static void main(String args[]){
		NTres obj = new NTres();
		obj.b = "clase con parametros";
		obj.retorno();
	}
}