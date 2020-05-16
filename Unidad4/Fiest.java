class Fiesta

{

int numeroP;

String TipoFies;

Fiesta(int nP, String TF) // Este es un constructor

{

numeroP= nP;

TipoFies =TF;

System.out.println("#invitados "+numeroP+"Tipo de fiesta  "+TipoFies);

}

void Fiesta(int nP,String TP) // Este es un método porque tiene void

{

numeroP =nP;

TipoFies = TP;

 

System.out.println("#invitados "+numeroP+"Tipo de fiesta  "+TipoFies);

}

}

class Fiest

{

public static void main(String a[])

{

Fiesta Primera= new Fiesta(200,"Matrimonio"); // aca estoy invocando el constructor

Primera.Fiesta(300,"Fiesta de juan");

}

}