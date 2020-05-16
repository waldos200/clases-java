import java.util.Scanner;
class Programa1{
	int opci,regre,stop;
	public void menu(){
		Scanner le = new Scanner(System.in);
		System.out.println("*********************************************");
		System.out.println("***Bienvenido a Structure***");
		System.out.println("**");
		System.out.println("*Digite el numero de la estructura*");
		System.out.println("*para observar su estructura*");
		System.out.println("**");
		System.out.println("*1- IF*");
		System.out.println("*2- While*");
		System.out.println("*3- Switch*");
		System.out.println("*4- Do While*");
		System.out.println("*5- For*");
		System.out.println("*0- Salir*");
		System.out.println("*********************************************");
		System.out.println("Esperando respuesta:...");
		opci = le.nextInt();
	}
	public void si(){
		System.out.println("*****************************************************");
		System.out.println("************ estructura de control IF(si)************");
		System.out.println("");
		System.out.println("El condicional If (Si) hara una comparacion de dos datos");
		System.out.println(" si se cumple entonces ejecutara parte de un codigo y sino");
		System.out.println(" ejecutara otro. Esta es la estructura:");
		System.out.println("");
		System.out.println("if(condicion){"+"\n codigo a ejecutar"+"\n}");
		System.out.println("else{"+"\n codigo a ejecutar"+"\n}");
		menP();
	}
	public void whl(){
		System.out.println("*****************************************************");
		System.out.println("************ estructura de control WHILE ************");
		System.out.println("");
		System.out.println("While permite crear BUCLES, los bucles son sentencias que se repiten");
		System.out.println(" si se cumple la condicion, se ejecutara hasta que la condicion sea");
		System.out.println(" diferente. Esta es su estructura:");
		System.out.println("");
		System.out.println("while(condicion){"+"\n codigo a ejecutar"+"\n}");
		menP();
	}
	public void swt(){
		System.out.println("******************************************************");
		System.out.println("************ estructura de control SWITCH ************");
		System.out.println("");
		System.out.println(" Switch es similar a IF pero la diferencia es que esta evaluara");
		System.out.println(" mas valores a la vez y ejecutara el codigo que esta en cada CASO");
		System.out.println(" al menos que se le agregue la palabra BREAK. Esta es su estructura:");
		System.out.println("");
		System.out.println("switch(condicion){"+"\n case 1:"+"\n codigo a ejecutar"+"\n case 2:"+"\n codigo a ejecutar"+"\n}");
		menP();
	}
	public void dhw(){
		System.out.println(" *****************************************************");
		System.out.println("************ estructura de control DO WHILE ************");
		System.out.println("");
		System.out.println(" Muy similar a While , la diferencia esta en que esta en que la condicion");
		System.out.println(" se evalua despues de ejecutar las instrucciones.");
		System.out.println(" Esta es su estructura :");
		System.out.println("");
		System.out.println(" do {"+"\n Codigo a ejecutar"+"\n } while (condicion)");
		menP();
	}
	public void para(){
		System.out.println(" *****************************************************");
		System.out.println("************ estructura de control FOR ************");
		System.out.println("");
		System.out.println(" Es un bucle mas complejo pensado para rellenar arrays o ejecutar");
		System.out.println(" instrucciones controladas por un contador.");
		System.out.println(" Esta es su estructura :");
		System.out.println("");
		System.out.println(" for (Expersion inicial , condicion, expresion en cada vuelta) {"+ "\n Codigo a ejecutar"+" \n }");
		menP();
	}
	public void menP(){
		//menu de pie de pagina saldra cuando se halla entrado a una opcion
		Scanner r = new Scanner(System.in);
		boolean continuar = true;
		while(continuar){
			System.out.println("");
			System.out.println("************6- Menu principal 0- salir del programa************");
			System.out.println("***************************************************************");
			regre = r.nextInt();
			if(regre!=6&&regre!=0){
				continuar = true;
			}
			else{
				continuar = false;
			}
		}
	}
	public void proceso(){
		if(opci>7){
			System.out.println("Valor invalido");
		}
		else{
			if(opci == 1){
				si();
			}
			if(opci == 2){
				whl();
			}
			if(opci == 3){
				swt();
			}
			if(opci == 4){
				dhw();
			}
			if(opci == 5){
				para();
			}
		}
	}
}

class MenuEstru1{
	public static void main(String args[]){
		Programa1 p = new Programa1();
		int conta = 2;
		while(conta>1){
			p.menu();
			p.proceso();
			if(p.regre==0){
				System.out.println("++++Saliendo del sistema++++");
				break;
			}
			if(p.opci==0){
				System.out.println("++++Saliendo del sistema++++");
				break;
			}
		}
	}
}