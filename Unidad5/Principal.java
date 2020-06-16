import java.util.Scanner;
import java.text.DecimalFormat;

abstract class Fruta{
	public double Precio;
	public int Cantidad;
	
	public Fruta(){

	}
	
	public Fruta(double Precio, int Cantidad){
		this.Precio=Precio;
		this.Cantidad=Cantidad;
	}
	
	public abstract void Mostrar();
}

class Manzana extends Fruta{
	private String TipoManzana, PaisOrigen;
	public Manzana(){

	}
	
	public Manzana(String TipoManzana, String PaisOrigen, double Precio, int Cantidad){
		super(Precio, Cantidad);
		this.TipoManzana=TipoManzana;
		this.PaisOrigen=PaisOrigen;
	}
	
	public void setTipoManzana(String TipoManzana){
		this.TipoManzana=TipoManzana;
	}
	
	public String getTipoManzana(){
		return TipoManzana;
	}
	
	public void setPaisOrigen(String PaisOrigen){
		this.PaisOrigen=PaisOrigen;
	}
	
	public String getPaisOrigen(){
		return PaisOrigen;
	}

	public double CalcularFruta(){
		return (Precio*Cantidad);
	}
	
	@Override
	public void Mostrar(){
		DecimalFormat formato1 =new DecimalFormat("#.00");
		System.out.println("Mostrando datos");
		System.out.println("");
		System.out.println("El precio de la fruta por unidad es: "+Precio);
		System.out.println("La cantidad de fruta es: "+Cantidad);
		System.out.println("El total de la compra es: "+formato1.format(CalcularFruta()));
		System.out.println("El tipo de manzana es: "+getTipoManzana());
		System.out.println("El pais de origen de la manzana es: "+getPaisOrigen());
	}
}

class Principal{
	public static void main(String[]args){
		Scanner teclado = new Scanner(System.in);
		Fruta m = new Manzana();
		Manzana man = new Manzana();

		System.out.println("Digite el tipon de manzana de acuerdo a su color:");
		man.setTipoManzana(teclado.nextLine());
		System.out.println("Digite el pais de origen");
		man.setPaisOrigen(teclado.nextLine());
		System.out.println("===================");
		System.out.println("Digite la cantidad comprada");
		m.Cantidad=teclado.nextInt();
		System.out.println("Digite el precio");
		m.Precio=teclado.nextDouble();

		Fruta mm = new Manzana(man.getTipoManzana(), man.getPaisOrigen(), m.Precio, m.Cantidad);
		System.out.println("===================");
		mm.Mostrar();
	}
}