import java.util.*;

class Calculadora1

{

public static void main(String args[])

{

char opcion; // Declaramos una variable char para almacenar el símbolo digitado.

int n1,n2,resultado=0; /*Variables para almacenar la captura de los números y el resultado de la operación entre ellos.*/

Scanner valor=new Scanner(System.in); /*Declarando un objeto Scanner que nos permita realizar la captura, para que esta línea no genere error es necesario escribir siempre la primera de este código*/

System.out.println("*********************************************************"); // Una simple línea en pantalla.

System.out.println("***** SUMA -----------------------> PRESIONA + "); // Una simple línea en pantalla.

System.out.println("***** RESTA ----------------------> PRESIONA - "); // Una simple línea en pantalla.

System.out.println("***** PRODUCTO ---------------> PRESIONA * "); // Una simple línea en pantalla.

System.out.println("***** DIVISION -------------------> PRESIONA / "); // Una simple línea en pantalla.

System.out.println("***** RESTO DE DIVISION-----> PRESIONA % "); // Una simple línea en pantalla.

System.out.println("**********************************************************"); // Una simple línea en pantalla.

System.out.print("Digite una opción: ");

opcion=valor.next().charAt(0); /* Se almacenará el símbolo digitado en la variable "opcion". "valor" es el objeto de la clase Scanner declarado para auxiliarnos de él al momento de capturar un valor. "valor.next()" obtiene la cadena digitada(recuerde que todo lo que digita es cadena), pero como la clase "Scanner" no tiene soporte para la conversión de cadenas a char no es correcto pensar que con hacer esto: "valor.nextChar()" covertiremos lo digitado a caracter. Si la intención es convertir a char tenemos esta alternativa: "valor.next().charAt(0)", en donde obtenemos el caracter de la posición 0 en la cadena que se digitado.*/

System.out.print("Digite el primer valor entero: "); //Se solicita escribir el primer numero entero.

n1=valor.nextInt(); // Se convierte a entero el numero digitado, en el momento que se digita es una cadena.

System.out.print("Digite el segundo valor: ");

n2=valor.nextInt();

switch(opcion) //inicia la evaluación d lo digitado.

{

case '+': //Se evalúa en cada caso si lo que se ha digitado es un símbolo.

resultado=n1+n2; // La variable resultado almacenará el resultado de la operación si se digitó un signo más.

break;

case '-':

resultado=n1-n2;

break;

case '*':

resultado=n1*n2;

break;

case '/':

resultado=n1/n2;

break;

case '%': // Al seleccionar esta opción se calculará el resíduo de la operación.

resultado=n1%n2;

break;

default: //Se ejecutará el bloque default si no se cumple ningún caso.

System.out.println("Opcion incorrecta");

break;

}

System.out.println("El resultado de la operacion es: "+resultado); //Fuera de la estructura hacemos uso de la variable.

}

}