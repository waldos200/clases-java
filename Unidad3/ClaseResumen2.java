import java.util.Scanner;

class EstructurasControl{
	//Metodo para reducir System.out.println a solo println.
	public void println(String M){
		System.out.println(M);
	}
	public void Simple(){
		println("Sintaxis de Estructuras de Control Simple\n");
		println("if(exples_boolean){");
		println("	accion01;\n}");
	}
	public void Doble(){
		println("Sintaxis de Estructura de Control Doble\n");
		println("if(express_boolean){");
		println("	accion01;\n}elsif(expres_boolean){");
		println("	accion02;\n}");
	}
	public void Multiple(){
		println("Sintaxis de Estructura de Control Multiple\n");
		println("switch(Evaluacion){");
		println("	case1:");
		println("		accion01;");
		println("		break;");
		println("	case2:");
		println("		accion02;");
		println("		break;");
		println("	case3:");
		println("		accion03;");
		println("		break;");
		println("	default:");
		println("		accion default;");
		println("		break; \n}");
	}
	public void DoWhile(){
		println("Sintaxis de Estructura de Control Do While \n");
		println("do{");
		println("	sentencia(s);");
		println("}While(expresion);");
	}
	public void For(){
		println("Sintaxis de Estructura de Control While \n");
		println("for(int i=valor inicial; i<=valor final; i=i+paso){");
		println("Bloque de Instrucciones;");
		println("}");
	}
}

class Invocar{
	public void Invo(){
		Scanner Leer = new Scanner(System.in);
		int Resp;
		EstructurasControl EC = new EstructurasControl();
		EC.println("\n ======== INVOCANDO LA CLASE DE ESTRUCTURAS DE CONTROL========");
		do{
			EC.println("--Seleccione un numero que muestre la estructura que desea ver:");
			EC.println("---------------------------------------------------------------");
			EC.println("Estructuras de Control:");
			EC.println("1-Simple");
			EC.println("2-Doble");
			EC.println("3-Multiple");
			EC.println("\n Estructuras repetitivas:");
			EC.println("4-Do While");
			EC.println("5-For");
			EC.println("0-Salir");
			EC.println("---------------------------------------------------------------");
			Resp=Leer.nextInt();
			EC.println("");
			switch(Resp){
				case 1:
					EC.Simple();
					break;
				case 2:
					EC.Doble();
					break;
				case 3:
					EC.Multiple();
					break;
				case 4:
					EC.DoWhile();
					break;
				case 5:
					EC.For();
					break;
				default:
					EC.println("No Seleccionado");
					break;
			}
			EC.println("");
		}while(Resp!=0);
	}
}

class ClaseResumen2{
	public static void main(String args[]){
		Invocar In = new Invocar();
		In.Invo();
	}
}