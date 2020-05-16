class CarreraB {
public static void main(String[] args) {
	CarreraA competencia = new CarreraA();
        competencia.MarcaCarro = "Hyundai Elantra";
        competencia.Lugar = "Italia";
        competencia.Costo = 250.75f;
        competencia.Premio = "Nissan Skyline R34 + 250.000 Dollars";
		
		System.out.println("=======CLASE CARRERA=======");
        System.out.println("\n");
        System.out.println("Nombre: "+competencia.MarcaCarro+"\n"+"Lugar:"+competencia.Lugar+"\n"+"Costo: $"+competencia.Costo+"\n"+"Premio: "+competencia.Premio);      
        System.out.println("\n");   
    }
    }