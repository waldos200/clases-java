abstract class FormaDosD8 {
	private double ancho;
	private double alto;
	private String nombre;
	
	double getAncho() {
		return ancho;
	}
	
    double getAlto() {
        return alto;
    }
	
	void setAncho(double ancho) {
		if (ancho <= 0)
			this.ancho = 0.0;
		else
			this.ancho = ancho;
	}
	
	void setAlto(double alto) {
		if (alto <= 0)
			this.alto = 0.0;
		else
			this.alto = alto;
	}
	
	String getNombre() {
		return nombre;
	}
	
	void mostrarDim() {
		System.out.println("El ancho es " + ancho + "\ny el alto es " + alto);
	}
	
	FormaDosD8() {
		ancho = alto = 0.0;
		nombre = "Nulo";
	}
	
	FormaDosD8(double x, String nombre) {
		ancho = alto = x;
		this.nombre = nombre;
	}
	
	FormaDosD8(double ancho, double alto, String nombre) {
		this.ancho = ancho;
		this.alto = alto;
		this.nombre = nombre;
	}
	
	FormaDosD8(FormaDosD8 ob) {
		ancho = ob.ancho;
		alto = ob.alto;
		nombre = ob.nombre;
	}
	
	abstract double area();
	abstract double perimetro();
}
 
// Subclase que recibe herencia de FormaDosD8.
class Triang8 extends FormaDosD8 {
	private String estilo;
	
	// Código que sobrescribe al método abstracto de la clase padre
	double area() {
		return getAncho() * getAlto() / 2;
	}
	
	// Código que sobrescribe al método abstracto de la clase padre
	double perimetro() {
		return 2 * (Math.sqrt(Math.pow(getAncho()/2,2) + Math.pow(getAlto(),2))) + getAncho();
	}
	
	String mostrarEstilo() {
		return estilo;
	}
	
	Triang8() {
		super();
		estilo = "nulo";
	}
	
	Triang8(double x) {
		super(x, "un triángulo");
		estilo = "Isósceles";
	}
	
	Triang8(double ancho, double alto, String estilo) {
		super(ancho, alto, "un triángulo");
		this.estilo = estilo;
	}
	
	Triang8(Triang8 ob) {
		super(ob);
		estilo =  ob.estilo;
	}
}

//Otra subclase que recibe herencia de FormaDosD8:
class Rectang extends FormaDosD8 {
	// Código que sobrescribe al método abstracto de la clase padre
	double area() {
		return getAncho() * getAlto();
	}
	
	// Código que sobrescribe al método abstracto de la clase padre
	double perimetro() {
		return 2 * (getAncho() + getAlto());
	}
	
	Rectang() {
		super();
	}
	
	Rectang(double x) {
		super(x, "un rectángulo");
	}
	
	Rectang(double ancho, double alto) {
		super(ancho, alto, "un rectángulo");
	}
	
	Rectang(Rectang ob) {
		super(ob);
	}
	
	boolean esCuadrado() {
		if (getAncho() == getAlto())
			return true;
		else
			return false;
	}
}

//Programa para usar las clases anteriores.
class Formas {
	public static void main (String [] args) {
		FormaDosD8 [] formas = new FormaDosD8[4];
		formas[0] = new Triang8(8.0, 12.0, "Recto");
		formas[1] = new Rectang(10);
		formas[2] = new Rectang(10, 4);
		formas[3] = new Triang8(7.0);
		int cuenta = 1;
		
		for(int i = 0; i < formas.length; i++) {
			System.out.println("El objeto " + (i + 1) + " es " + formas[i].getNombre());
			System.out.println("Ancho = " + formas[i].getAncho());
			System.out.println("Alto = " + formas[i].getAlto());
			System.out.println("El área es " + formas[i].area());
			System.out.println("El perímetro es " + formas[i].perimetro());
			System.out.println();
		}
		
		for (FormaDosD8 forma : formas) {
			if (forma instanceof Rectang) {
				System.out.println("El rectángulo " + cuenta + " es cuadrado? " + ((((Rectang) forma).esCuadrado()) ? "SI" : "NO" ));
				cuenta++;
			}
		}
		
		cuenta = 1;
		System.out.println();
		for (FormaDosD8 forma : formas) {
			if (forma instanceof Triang8) {
				System.out.println("El triángulo " + cuenta + " es " + ((Triang8) forma).mostrarEstilo());
				cuenta++;
			}
		}
	}
}