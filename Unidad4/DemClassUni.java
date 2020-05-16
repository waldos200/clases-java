import java.util.*;

class AlumnoUniver

{

String nombre,carnet,direccion;

int edad;

public AlumnoUniver()

{

System.out.println("Me Quiero Graduar de la UTEC");

nombre= "Casimira Cabezas";

carnet ="17-3567-2013";

direccion =" Col.las tinieblas Rojas";

System.out.println(" Me Llamo : \t"+nombre+"\n Mi numero de carnet es:"+carnet);

System.out.println(" Vivo en Sonsacate en la :"+direccion);

}

}

 

  class AsignaturaUni

{

 

 int CantidadAsig;

 String primeraAsig,segundaAsig;

 AsignaturaUni()

 {

 System.out.println("Me Encantan dos asignaturas :");

 }

 

 public void captura(){

Scanner dato = new Scanner(System.in);

System.out.println("ingrese el nombre de la primera ");

primeraAsig=dato.nextLine();

System.out.println("ingrese el nombre de la segundo ");

segundaAsig= dato.nextLine();

}

public void mostrarAsig()

 {

    System.out.println("Estoy facinada con\t:"+primeraAsig);

    System.out.println(" Y Me encanta \t:"+segundaAsig);   

 }

}

class NotasAlumn

    {

            double n1,n2,prom;

   

    public NotasAlumn () // En este constructor he creado objetos que invoca a los constructores de sus clases y métodos 

     {

              AlumnoUniver PrimerAlu= new AlumnoUniver();

              AsignaturaUni AsigEspe= new AsignaturaUni();

              AsigEspe.captura();

             Scanner nota = new Scanner(System.in);

             System.out.println("ingrese la nota de la primera asignatura");

     n1= nota.nextDouble();

             System.out.println("ingrese la nota de la segunda asignatura");

     n2= nota.nextDouble();

             AsigEspe.mostrarAsig();

               

     }

             public double prom()

             {

              prom=(n1+n2)/2;

             return prom;

             }

             

                 }

class DemClassUni

{

 

 public static void main (String arg[])

 {

 

  NotasAlumn  DatosAlum = new NotasAlumn(); //Este invoca al constructor que ha invocado a las demás clases

  System.out.println(" El CUM que tengo es \t: "+DatosAlum.prom());

     

 }

}