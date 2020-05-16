class Datos{
  String ubicacion,nombre,tipo;
  int numesas;
}

class Restaurante{
  public static void main(String[] rogel){
  Datos cena = new Datos();
  cena.ubicacion = "Metrocentro 8a etapa";
  cena.nombre = "Pueblo Viejo";
  cena.tipo = "Comida rapida";
  cena.numesas = 10;
  System.out.println("*******************ATRIBUTOS DE LA CLASE RESTAURANTE************************");
  System.out.println("La ubicacion del restaurante es :"+cena.ubicacion+"\n"+"El nombre del restaurante es :"+cena.nombre);
  System.out.println("El tipo de restaurante es :"+cena.tipo+"\n"+"El numero de mesas del restaurante es :"+cena.numesas);
  }
}