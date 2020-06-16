import Clases.*;

class ClasePoo {
	public static void main(String args[]){
		Docente profesor = new Docente("Presentacion");
		Alumno e = new Alumno("Ingenieria en sistemas","Programacion Orietada a Objetos");
		Libro i = new Libro();
		profesor.getData();
	}
}