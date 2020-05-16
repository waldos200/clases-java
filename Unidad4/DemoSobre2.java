class SobreCar {

 int n;

 double n1;

 double n2;

 int a;

 int b;

 String c;

 String d;

  public SobreCar() {

    a = 10;

    b = 100;

   System.out.println("Me encantan los numeros :"+a +"y"+ b);  

   }

  public SobreCar(int x ) {

                  n = x;

System.out.println("me gustan este número:"+ n);      

    

    }

   public SobreCar( double p1,double p2) {

      n1 = p1;

      n2 = p2;

 System.out.println(" las notas que tengo son :"+n1 +"y"+ n2);   

    }

   public SobreCar(String mj, String mj2) {

     c = mj;

     d= mj2;

 System.out.println(" mi nombre es  :"+c +","+ d);  

   }

              

  public void asignatura() {

     

    System.out.println("me gusta esta asignatura");

   }

   public String asignatura(String nombredoc) {

                return (" mi Docente es :"+nombredoc);

    }

   public double asignatura(double no1,double no2)  {

 

     return(no1+no2)/2;

    }

}

               

class DemoSobre2

{

public static void main(String args[]){

SobreCar  alumno1 = new SobreCar();

SobreCar  alumno2 = new SobreCar(3);

SobreCar  alumno3 = new SobreCar(8.0,9.0);

SobreCar  alumno4 = new SobreCar("Doroteo","Florentino");

  alumno1.asignatura();

 System.out.println(alumno1.asignatura("Lilian de Leiva"));

 System.out.println("mi nota en POO es :"+alumno1.asignatura(6.0,8.0));

}

}