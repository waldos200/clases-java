//clase principal

class DemoVehiculo1
{
  public static void main(String lili[])
 {
    Automovil1 camion = new Automovil1();
    Automovil1 microbus = new Automovil1();
    Automovil1 pickup = new Automovil1();
   System.out.println("El bjeto camion.Invo los miembros de la clase plantia");
   camion.marca="Toyota";
   camion.color="Rojo";
   camion.modelo="2017";
   camion.Mostrar();
   camion.Arranque();
   System.out.println(camion.Acelerar());
   camion.Frenar ();
   System.out.println("El bjeto microbus.Invo los miembros de la clase plantia");
   microbus.marca="Nissan";
   microbus.color="Negro";
  microbus.modelo="2011";
  microbus.Mostrar();
  microbus.Arranque();
  System.out.println(microbus.Acelerar());
  microbus.Frenar ();
  System.out.println("El bjeto pickup.Invo los miembros de la clase plantia");
  pickup.marca="Mazda";
  pickup.color="Azul";
  pickup.modelo="2010";
  pickup.Mostrar();
  pickup.Arranque();
  System.out.println(pickup.Acelerar());

  pickup.Frenar ();

  }

}