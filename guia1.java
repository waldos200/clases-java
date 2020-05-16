class Equipo{
	public String tipoequipo;
}

class PrincipalEquipo{
	public static void main(String []lilian){
		System.out.println("Creamos el objeto 1 de la clase Equipo");
		System.out.println("");
		Equipo e1 = new Equipo();
		e1.tipoequipo = "Equipo de Oficina";
		System.out.println("El equipo de oficina es :"+e1.tipoequipo);
		
		System.out.println("Creamos el objeto 1 de la clase Compañia");
		System.out.println("");
		Compannia1 c1 = new Compannia1();
		c1.nombrecompannia = "Compañia los Afortunados";
		System.out.println("A la compañia que pertenezco es "+c1.nombrecompannia);
	}
	
}
