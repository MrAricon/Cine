package model;

import java.sql.Timestamp;

/**
 *
 * @author paucanmil, alexiaruegut
 */
public class Entrada extends ElementoConHorario{

    private int precio;
    private String numeroButaca;
    private String tituloPelicula;

    public Entrada() {
        super();
    }

    public Entrada(int precio, String numeroButaca, String tituloPelicula, Timestamp fechaHora) {
        super(fechaHora);
        this.precio = precio;
        this.numeroButaca = numeroButaca;
        this.tituloPelicula = tituloPelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNumeroButaca() {
        return numeroButaca;
    }

    public void setNumeroButaca(String numeroButaca) {
        this.numeroButaca = numeroButaca;
    }

    public Timestamp getFechaHora() {
        return super.horaFecha;
    }

    public void setFechaHora(Timestamp fechaHora) {
        super.horaFecha = fechaHora;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    @Override
    public void mostrarHorario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
