import java.util.Scanner;

class factura{
	String producto;
    double precio;
    int cantidad;
 
 void captura() {
    Scanner leer = new Scanner(System.in);
    System.out.print("Digite el producto: ");
    producto=leer.nextLine();
    System.out.print("Digite el precio: ");
    precio=leer.nextDouble();
    System.out.print("Digite la cantidad: ");
    cantidad=leer.nextInt();
   }

 double iva(){
	return ((precio*cantidad)*0.13);
   }

 double total(){
	return (((precio*cantidad)*0.13)+precio*cantidad);
   }
 
 void mostrar(){
	System.out.println("\nFACTURA COMERCIAL");
    System.out.println("PRODUCTO \tPRECIO \tCANTIDAD \tIVA \tTOTAL");
   }
 
  }

class DemoFactura
 {
	public static void main (String Args[]) 
	{
		factura f1= new factura();
		f1.captura();
        f1.iva();
        f1.total();
 
        factura f2= new factura();
        f2.captura();
        f2.iva();
        f2.total();
		f1.mostrar();
		
		System.out.print(f1.producto+"\t"+"\t"+f1.precio+"\t"+   f1.cantidad+"\t");
        System.out.print("\n"+f2.producto+"\t"+"\t"+f2.precio+"\t"+   f2.cantidad+"\t");
  
    }  



}