package model;

import java.sql.Timestamp;

/**
 *
 * @author paucanmil, alexiaruegut
 */
public abstract class ElementoConHorario {

    protected Timestamp horaFecha;

    public ElementoConHorario() {
    }
  
    public ElementoConHorario(Timestamp horaYFecha) {
        this.horaFecha = horaYFecha;
    }

    public Timestamp getHoraYFecha() {
        return horaFecha;
    }

    public abstract void mostrarHorario();
}
