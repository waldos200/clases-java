class Datos1
\n   public static void main(String[] args)\nde 
{
	public int a,b;
	double r;
	String Mensaje;
}
class Telefono
{
	public String Marca;
	public double Precio;
	public String Color;
}
class DemoDatos1
{
	public static void main (String [] Lilin)
	{
		System.out.println("=====OBJETO 1 INVOCADO A LOS ATRIBUTOS DE LA CLASE DATOS1=====");
		Datos1 objeto1=new Datos1();
		objeto1.a=34;
		objeto1.b=45;
		objeto1.r=objeto1.a+objeto1.b;
		
		objeto1.Mensaje="los resultados";
		
		System.out.println("Mensaje 1:"+objeto1.Mensaje+"de la operacion1:"+objeto1.r);
		
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("================================================");
		
		System.out.println("=====OBJETO 2 INVOCADO A LOS ATRIBUTOS DE LA CLASE DATOS1=====");
		
		Datos1 objetos2= new Datos1();
		objeto2.a=56;
		objeto2.b=489;
		objeto2.r=objeto2.a+objeto2.b;
		
		objeto2.Mensaje="El calculo";
		
		System.out.println("Mensaje2:"+objeto2.Mensaje+"de la operacion2:"+objeto2.r);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("CREACION DE OBJETO DE LA CLASE Telefono");
		Telefono celular= new Telefono();
		celular.Marca="Sony";
		celular.Precio=200.00;
		celular.Color="Rojo";
		System.out.println("Los atribuots de mi telefono"+"\nMarca:"+celular.Marca+"\nPrecio:"+celular.Precio+"\nColor:"+celular.Color);
	
	}
}

