import Ejerciciop4.*;
class Persona1 {
    public static void main(String args[]) {
        Persona a = new Persona("Waldo Mendoza", "San Salvador, El Salvador", "456666-5", "555666-103-3", 20);
		a.llamar("Estos son los datos recolectados");
		Persona e = new Persona("Ricardo Martinez", "Sonsonate, El Salvador", "67838-8", "765890-143-3", 22);
		e.llamar("Estos son los nuevos datos recolectados");
    }
}