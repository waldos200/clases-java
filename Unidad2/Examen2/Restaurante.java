package Examen2;

//Class Restaurante 

public class Restaurante

{

                public String nombre ;

                public String direccion;
				
				public String tipo;

                public String TipoServicio()

                {

                    nombre =  "\n\tHotel y Restaurante los Bellos";

                               return nombre;

                }

                public String Ubicacion()

                {

                      return direccion;

                }

                public String Caracteristicas()

                {
                    String tipo = "Elegante";
					
                            System.out.println("\nNombre:"+nombre+"\nDireccion:"+direccion+"\n tipo de lugar:"+tipo);
					return tipo;
                }

}