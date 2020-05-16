class Fiesta

{

int numeroP;

String TipoFies;

public Fiesta(){}

private Fiesta(int nP, String TF)// constructor privado

{

numeroP= nP;

TipoFies =TF;

System.out.println("#invitados "+numeroP+"Tipo de fiesta  "+TipoFies);

}

void Fie(int nP,String TP) // con este método invoca al constructor privado

{

Fiesta p= new Fiesta(10,"rosa2");

 

numeroP =nP;

TipoFies = TP;

 

System.out.println("#invitados "+numeroP+"Tipo de fiesta  "+TipoFies);

}

}

class Fiest1

{

public static void main(String a[])

{

Fiesta l= new Fiesta();

l.Fie(300,"fiesta Rosa");

}

}