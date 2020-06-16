import java.util.Scanner;

abstract class Cafe {
	protected String Nombre;
	protected int Cant, Tamano;
	protected double Precio, Total;
	Scanner Entrada = new Scanner (System.in);

	public void println(String M) {
		System.out.println(M);
	}
	
	public abstract void NombreCafe ();

	public void Datos () {
		println("Ingresar el tamaño: \n1- Grande \t2- Mediano\t0- Salir");
		System.out.print("Respuesta: ");
		Tamano = Entrada.nextInt ();
		println ("");
		switch (Tamano) {
			case 1:
			Precio = 2.00;
			break;

			case 2:
			Precio = 1.50 ;
			break;

			default :
			println("Sin Especificar");
			break;
		}
		
		println("Precio: $" + Precio);
		println("Ingresar la Cantidad :");
		Cant = Entrada.nextInt ();
	}
	
	public abstract void Operaciones ();

	public void Caja(String NombreCliente) {
		println("\nDetalles de Pago :");
		println("Nombre de Cafe :"+ Nombre);
		println("Cantidad de Cafe"+Cant);
		println("Precio de Cafe:"+ Precio);
		println("\nCliente :" + NombreCliente);
		println("Total a Pagar: $"+Total );
	}
}

class CafeAmericano extends Cafe {
	@Override
	public void NombreCafe () {
		Nombre = "Cafe Americano";
		println("\nCafe: Americano");
		println("Obtienes descuento del 10%");
	}
	
	public void Operaciones () {
		Total = (Cant * Precio) - (Cant * Precio * 0.10);
	}
}

class CafeCapuchino extends Cafe {
	@Override
	public void NombreCafe () {
		Nombre = "Cafe Capuchino";
		println("\nCafe: Capuchino");
		println("Obtienes Galleta de Chocolate Gratis");
	}
	
	public void Operaciones () {
		Total = (Cant * Precio);
	}
}

class Cafeteria {
	public static void main (String Args []) {
		Cafe Ca = new CafeAmericano();
		Ca.NombreCafe();
		Ca.Datos ();
		Ca.Operaciones ();
		Ca.Caja("Lilian de Leiva ");

		Cafe Cp = new CafeCapuchino ();
		Cp.NombreCafe ();
		Cp.Datos ();
		Cp.Operaciones();
		Cp.Caja ("Lilian de Leiva ");
	}
}