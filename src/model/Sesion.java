package model;

import java.sql.Timestamp;

/**
 *
 * @author paucanmil, alexiaruegut
 */
public class Sesion extends ElementoConHorario {

    private Pelicula pelicula;
    private Butaca[][] butacas;

    public Sesion() {
        super();
    }

    public Sesion(Pelicula pelicula, Butaca[][] butacas, Timestamp fechaHora) {
        super(fechaHora);
        this.pelicula = pelicula;
        this.butacas = butacas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Timestamp getHoraFecha() {
        return super.horaFecha;
    }

    public void setHoraFecha(Timestamp horaFecha) {
        super.horaFecha = horaFecha;
    }

    public Butaca[][] getButacas() {
        return butacas;
    }

    public void setButacas(Butaca[][] butacas) {
        this.butacas = butacas;
    }

    @Override
    public void mostrarHorario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
