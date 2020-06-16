// TAREA 
import java.util.*;

class DatosPersonales {
	String nombre; 
	String apellidos;
	// Debe escribir su nombre y apellido como alumno
	public DatosPersonales(String n,String a){
		nombre=n;
		apellidos=a;
		System.out.println("DATOS");
		System.out.println("Nombre: "+nombre+"\nApellido: "+apellidos); 
	}
}

class Alimentos extends DatosPersonales {
	public Alimentos() {
		super("Waldo","Mendoza");
		System.out.println("ME gusta comer cualquier tipo de alimento");
	}
	
	public String comidasFav(String C, String B) {
		System.out.println("Alimento preferido es" + C + " y " + B);
		return C+B;
	}
	
	public String comidaFav (String a) {
		return "Mi comida favorita es " + a;
	}
	
	public double preComidaFav(double p) {
		System.out.print("El precio de mi plato preferido es de: " + p);
		return p; 
	}

	public void horaComidaFav() {
		String ghorarioDu="mañana y noche";
		int cantAlim=3;
		System.out.println("Yo como  :"+ghorarioDu);
		System.out.println("Me alimento "+cantAlim+" veces al dia");
	}
}

class Deporte extends DatosPersonales {
	public Deporte(String m) {
		super("Waldo","Mendoza");
		System.out.println("Deporte que mas practico y me gusta: " +m); 
	}

	public String deporteFav (String m) {
		System.out.println("Tambien me encata el " + m);
		return m;
	}

	public void datos() {
		apellidos="Casimiro";
		System.out.println("El deportista que mas me gusta es " + apellidos);
	}

	public class Ropa {
		String colorCamisa;
		String tipoCamisa;
		String tipoPantalon;
	}
		public void Ropa(String colorCamisa, String tipoCamisa, String tipoPantalon){
			Scanner leer = new Scanner(System.in);
			System.out.println("Me gusta un color de camisa: ");
			colorCamisa=leer.nextLine();
			System.out.println("Me gusta el tipo de camisa: ");
			tipoCamisa=leer.nextLine();
			System.out.println("Y un tipo de pantalon: ");
			tipoPantalon=leer.nextLine(); 
		} 

	public class Videos {
		String tipoJuegos;
		String tipoPeliculas;
		String frutaFavorita;
		String pasatiempo;
	}
	
	public void Videos(String tipoJuegos, String tipoPeliculas, String frutaFavorita, String pasatiempo){
		Scanner leer=new Scanner(System.in);
		System.out.print("Digite tipo de juegos: ");
		tipoJuegos=leer.nextLine();
		System.out.print("Digite tipo de peliculas: ");
		tipoPeliculas=leer.nextLine();
		System.out.print("Digite la fruta favorita: ");
		frutaFavorita=leer.nextLine();
		System.out.print("Digite su pasa-tiempo: ");
		pasatiempo=leer.nextLine();
	}

	public String  mostrarEntreten(String tipoJuegos, String tipoPeliculas, String frutaFavorita, String pasatiempo){
		return "Juegos de: "+tipoJuegos+"\nPeliculas: "+tipoPeliculas+"\nFruta: "+frutaFavorita+"\nPasatiempo: "+pasatiempo;
	}

	public String Entreten (String m, String n){
		String atrib1="Restaurante,";
		String atrib2=" Playa,";
		String atrib3=" Dormir";
		String atrib4=" Y Jugar ps3";
		System.out.println("Me gusta ir de paseo a "+atrib1+atrib2+atrib3+atrib4+"\ncon mis "+m+" y "+n);
		return m;
	}
}

class Tarea{
	public static void main(String args[]){
		Alimentos alimentos = new Alimentos();
		alimentos.comidasFav("Pizza", "Hamburguesa");
		alimentos.comidaFav("hotdog");
		alimentos.preComidaFav(3.50);
		alimentos.horaComidaFav();
		System.out.println("------------------------------------------------------------------------------------");
		Deporte deporte = new Deporte("Futbol");
		deporte.datos();
		deporte.deporteFav("tennis");
		deporte.Ropa("","","");
		deporte.Videos("","","","");
		deporte.mostrarEntreten("", "", "", "");
		deporte.Entreten("Amigos", "Familia");
	}
}