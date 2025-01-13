package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paucanmil, alexiaruegut
 */
public class Sala {

    private int totalAsientosMinusvalidos;
    private int totalAsientosVIP;
    private int precioTipoSala;
    private int[][] idTipoAsientos;
    private enumTipoSala tipoSala;
    private ArrayList<Sesion> sesiones;
    private ArrayList<Pelicula> peliculas;

    public Sala() {
        this.sesiones = new ArrayList<>();
        this.peliculas = new ArrayList<>();
    }

    public Sala(enumTipoSala tipoSala) {
        this.tipoSala = tipoSala;
        this.sesiones = new ArrayList<>();
        this.peliculas = new ArrayList<>();
    }

    public int getTotalAsientosMinusvalidos() {
        return totalAsientosMinusvalidos;
    }

    public void setTotalAsientosMinusvalidos(int totalAsientosMinusvalidos) {
        this.totalAsientosMinusvalidos = totalAsientosMinusvalidos;
    }

    public int getTotalAsientosVIP() {
        return totalAsientosVIP;
    }

    public void setTotalAsientosVIP(int totalAsientosVIP) {
        this.totalAsientosVIP = totalAsientosVIP;
    }

    public int getPrecioTipoSala() {
        return precioTipoSala;
    }

    public void setPrecioTipoSala(int precioTipoSala) {
        this.precioTipoSala = precioTipoSala;
    }

    public int[][] getIdTipoAsientos() {
        return idTipoAsientos;
    }

    public void setIdTipoAsientos(int[][] idTipoAsientos) {
        this.idTipoAsientos = idTipoAsientos;
    }

    public enumTipoSala getTipoSala() {
        return tipoSala;
    }

    public void setTipoSala(enumTipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }

    public ArrayList<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(ArrayList<Sesion> sesiones) {
        this.sesiones = sesiones;
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}