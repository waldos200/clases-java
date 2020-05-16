class Demoautomovil
{
public static void main(String args [])
{
Automovil Pickup = new Automovil();
Pickup.color="Rojo";
Pickup.VelocidadMax ="310km/h";
Pickup.Ruedas = "Bridgestone";
Pickup.motor="2.5 dCi (133 Hp) Pickup Double Cab";
System.out.println(" Atributos :");
System.out.println("==================================");
System.out.println("Color : "+Pickup.color);
System.out.println("Lo maximo que corre es :"+Pickup.VelocidadMax );
System.out.println("Tipo de llantas del pickup :"+Pickup.Ruedas);
System.out.println("Motor:"+Pickup.motor);
System.out.println(" Métodos :");
System.out.println("==================================");
Pickup.arranca();
System.out.println("==================================");
Pickup.frenar();
System.out.println("==================================");
Pickup.girar();
}
}