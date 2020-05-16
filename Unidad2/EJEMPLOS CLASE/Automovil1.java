//clase plantia

class Automovil1
{
  String marca,color,modelo;

  public void Mostrar()
  {
  System.out.println("====Atributos==============");
  System.out.println("MARCA :"+marca+"\n"+"COLOR :"+color+"\n"+"MODELO :"+modelo);
  }

 public void Arranque()
 {
 System.out.println("=======Métodos==============");
 System.out.println("METODO 1:"+"Poner llave en el llavin");
 }
  public String Acelerar()
   {
    return "METODO 2:"+"Presionar acelerador";

   }
   public void Frenar()
   {
    System.out.println("METODO 3:"+"Presionar el freno");

   }

}