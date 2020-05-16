import java.util.Scanner;

class Entrar {
	public static void main (String args[])
    {
		Ejercicio3 eje3 = new Ejercicio3();
	    eje3.Captura();
	
	    System.out.println("Cantidad de colones: " + eje3.Conversion());
    }
  }
  
class Ejercicio3
{
	int cantidaDolares;
	double cantidadColones;
	
	Scanner read = new Scanner(System.in);
	
	public void Captura() { 
	System.out.println("Ingrese la cantidad de dolares a convertir: "); 
	cantidaDolares = read.nextInt();	
	}
	
	public double Conversion() {
	double resultado;
	resultado = cantidaDolares * 8.75;
	return resultado;
	}
	

}