class NCuatro{
	private void metodo1(String cd){
		System.out.println(cd);
	}
	public void metodo2(String c){
		metodo1(c);
	}
}

class DemoCuatro{
	public static void main(String args[]){
		NCuatro ob = new NCuatro();
		ob.metodo2("hechooo");
	}
}