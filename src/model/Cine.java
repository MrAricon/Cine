package model;

import java.util.ArrayList;

/**
 *
 * @author paucanmil, alexiaruegut
 */
public class Cine {

    private String nombre;
    private String ubicacion;
    private int totalSalas;
    private int precioBase;
    private ArrayList<Sala> salas;
    private ArrayList<Entrada> entradas;

    public Cine() {
    }

    public Cine(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Cine(String nombre, String ubicacion, int totalSalas, int precioBase, ArrayList<Sala> salas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.totalSalas = totalSalas;
        this.precioBase = precioBase;
        this.salas = salas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getTotalSalas() {
        return totalSalas;
    }

    public void setTotalSalas(int totalSalas) {
        this.totalSalas = totalSalas;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public ArrayList<Sala> getSalas() {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas) {
        this.salas = salas;
    }

    public ArrayList<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(ArrayList<Entrada> entradas) {
        this.entradas = entradas;
    }

}
