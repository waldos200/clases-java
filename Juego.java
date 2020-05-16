public class Juego
{
	public String tipojuego;
}

class PrincipalJuego {
	public static void main(String [] arg){
	//public static void main(String []lilin){
		String nombreAlumno="Lilian de Leiva";
		String carnet="15-2500-1998";
		System.out.println("Mi nombre es :"+nombreAlumno+"\t"+"Nucarne"+carnet);
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		System.out.println("Objeto 1 de la clase Juego");
		System.out.println("======================");
		Juego j1 = new Juego();
		j1.tipojuego="FIFA-2010";
		System.out.println("Yo juego con :"+j1.tipojuego);
		
		System.out.println("======================");
		System.out.println("Objeto 1 de la clase Jugador ");
		Jugador jugador1 = new Jugador();
		jugador1.nombre = "Edwin Garcia";
		System.out.println("Mi nombre es  :"+jugador1.nombre);
		
	}
}

