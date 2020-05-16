import java.util.*;

class Materias{
	public void actividades(){
		System.out.println("ACTIVIDADES A REALIZAR");
	}
	public int evaluaciones(int ne){
		return ne;
	}
	public void mesaje(String men){
		String m=men;
		System.out.println("m");
	}
	public double p1(double n1, double n2){
		return (n1+n2)/2;
	}
}

class materias1{
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);
		leer.evaluaciones();
		//Materias ob = new Materias();
		//System.out.println(ob.actividades());
		//System.out.println(ob.evaluaciones());
		//System.out.println(ob.mesaje());
		//System.out.println(ob.p1());
	}
}