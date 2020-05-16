class ParqueB {
public static void main(String[] args) {
 
	ParqueA informacion = new ParqueA();
        informacion.NombreParque = "Central Park";
        informacion.TamanoParque = "3.41 km2";
        informacion.Actividades = "Correr, Musica, Picnic";
        informacion.HoraAcceso = "8:00 AM";
		
		System.out.println("=======CLASE PARQUE=======");
        System.out.println("\n");
        System.out.println("Nombre del Parque: "+informacion.NombreParque+"\n"+"Tamano del Parque: "+informacion.TamanoParque+"\n"+"Actividades que se realizan: "+informacion.Actividades+"\n"+"Hora de apertura: "+informacion.HoraAcceso);      
        System.out.println("\n");
        
    }
    
   
    }