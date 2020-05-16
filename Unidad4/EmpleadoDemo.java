class Empleado {
    public String nombre;
    public String direccion;
    public int numero;
    public int ISSS;
    public double salario;
    
    public void enviarCheque() {
        System.out.println("Enviar cheque a " + nombre + "\n" + direccion);
    }
    public double calcularPago() {
        return salario / 52;
    }
}


class EmpleadoDemo {
    public static void main(String [] args) {
        Empleado e1, e2;
        e1 = new Empleado();
        e2 = new Empleado();
        
        e1.nombre = "Gustavo Cerati";
        e1.direccion = "Calle Principal # 123 Santa Tecla";
        e1.numero = 101;
        e1.ISSS = 111223333;
        e1.salario = 24000.00;
        System.out.println(e1.nombre + " " + e1.ISSS); 
        System.out.println(e1.calcularPago());
        e1.enviarCheque();

        e2.nombre = "Jairo Varela";
        e2.direccion = "Calle Principal #321 San Miguel";
        e2.numero = 202;
        e2.ISSS = 333221111;
        e2.salario = 30000.00;
        System.out.println(e2.nombre + " " + e2.ISSS);
        System.out.println(e2.calcularPago());
        e2.enviarCheque();
    }
}
