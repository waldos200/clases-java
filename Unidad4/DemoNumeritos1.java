class Numeritos

{

 

public void Numeritos (int y,int z)

{

 

System.out.println("me gustan los numeros"+y+","+z);

}

public Numeritos(double a ,double b)

{

 

System.out.println("me gustan los numeros"+a+","+b);

}

public int sumas( int xx,int xxx)

{

return 4+(xx+xxx);

}

public double sumas( double yy,double yyy)

{

return 3.9+(yy+yyy);

}

 

}

class DemoNumeritos1

{

public static void main(String x[])

{

Numeritos obj1= new Numeritos(7,8);

Numeritos obj2= new Numeritos(2.0,9.0);

System.out.println("la suma de enteros es " + obj1.sumas(5,4));

System.out.println("la suma de los reales es " + obj1.sumas(3.0,8.0));

}

}