class FiestaB {
 public static void main(String[] args) {
        
        FiestaA celebracion = new FiestaA();
        celebracion.NomFiesta = "New Year Party";
        celebracion.Lugar = "Hotel Real Intercontinental";
        celebracion.Invitados = 1000;
        celebracion.Costo =2500.00f;
		
        System.out.println("=======CLASE FIESTA=======");
		System.out.println("\n");
        System.out.println("Nombre de la Fiesta: "+celebracion.NomFiesta+"\n"+"Lugar de la Fiesta: "+celebracion.Lugar+"\n"+"Invitados: "+celebracion.Invitados+"\n"+"Costo de la Fiesta: $"+celebracion.Costo);
		System.out.println("\n");
 }
}