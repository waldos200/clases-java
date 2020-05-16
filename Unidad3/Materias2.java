import java.util.*;

class materias{
	public static void actividades(){
		System.out.println("ACTIVIDADES A REALIZAR");
	}
	public static int evaluaciones(int ne){
		return ne;
	}
	public static void mesaje(String men){
		String m = men;
		System.out.println(m);
	}
	public static double p1(double n1, double n2){
		return (n1+n2)/2;
	}
}

class Materias2{
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);
		materias A1 = new materias();
		A1.actividades();
		System.out.println(A1.evaluaciones(4));
		A1.mesaje("nota");
		System.out.println(A1.p1(6,12));
	}
}