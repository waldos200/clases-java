class cancio
{

public class Cancion {
    String titulo;
    int duracion;
    String cantante;

    public Cancion(String titulo, int duracion, String cantante, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.cantante = cantante;
		this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTtitulo(String titulo) {
        this.titulo = titulo;
	 }

    public String getGenero() {
        return genero;
    }

    public void setTGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return cantante;
    }

    public void setAutor(String cantante) {
        this.cantante = cantante;
    }
    public static void main(String []args)
	{
    public void mostrar(){
        System.out.println("titulo: "+this.titulo);
        System.out.println("Duracion: "+this.duracion);
        System.out.println("cantante: "+this.cantante);
		System.out.println("genero musical: "+this.genero);
    }
}