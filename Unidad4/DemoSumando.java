import java.util.*;

class Sumando

{

            int s1 ,s2 ;

            double s3 , s4;

 

Sumando (int var1 , int var2)

{          

            s1 = var1;

            s2 = var2;

}

Sumando(double var3 , double var4)

{

            s3 = var3;

            s4 = var4;

}

 

int sumar (int var1 , int var2)

            {

                        return (var1 + var2);

            }

 

            double sumar (double var3 ,  double var4)

            {

                        return (var3 + var4);

            }

}

class DemoSumando

{

            public static void main (String mn [])

{          

            int var1 , var2;

            double var3 , var4;

            Scanner leer = new Scanner (System.in);

           

            System.out.println("***************************");

            System.out.print("Ingrese numero entero: ");

            var1 = leer.nextInt();

            System.out.print("Ingrese otro numero entero: ");

            var2 = leer.nextInt();

            Sumando s1 = new Sumando (var1 , var2);

            System.out.println("La suma de los enteros es:  " + s1.sumar (var1 , var2));

 

            System.out.println();

            System.out.print("Ingrese  numero racional: ");

            var3 = leer.nextDouble();

            System.out.print("Ingrese otro numero racional: ");

            var4 = leer.nextDouble();

 

            Sumando s2= new Sumando(var3, var4);

            System.out.println("La suma de los racionales es:" + s2.sumar(var3 , var4));

            }

}