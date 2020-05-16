import parcial3.datosalumno.*;
class demoparcial3
{
	public static void main(String args[])
	{
		System.out.println("Invocando a la clase alumno");
		System.out.println("Objeto 1 de la clase DatosAlumno");
		Datosalum A1= new Datosalum();
		System.out.println(A1.datos(A1.nombre,A1.carnet));
		System.out.println("Objeto 2 de la clase DatosAlumno");
		Datosalum A2= new Datosalum();
		System.out.println(A2.datos(A2.nombre,A2.carnet));
	}
}