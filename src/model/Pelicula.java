package model;

/**
 *
 * @author paucanmil, alexiaruegut
 */
public class Pelicula {

    private String titulo;
    private int duracion;
    private String idioma;
    private String descripcion;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, String idioma, String descripcion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.idioma = idioma;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", idioma=" + idioma + ", descripcion=" + descripcion + '}';
    }

}
