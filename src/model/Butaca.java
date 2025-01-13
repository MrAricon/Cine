package model;

/**
 *
 * @author paucanmil, alexiaruegut
 */
public class Butaca {

    private int precio;
    private enumTipoSala tipoButaca;
    private boolean reservada;

    public Butaca() {
    }

    public Butaca(int precio, enumTipoSala tipoButaca) {
        this.precio = precio;
        this.tipoButaca = tipoButaca;
    }
    
    public int getPrecio() {
        return precio;
    }

    public enumTipoSala getTipoButaca() {
        return tipoButaca;
    }

    public boolean isReservada() {
        return reservada;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setTipoButaca(enumTipoSala tipoButaca) {
        this.tipoButaca = tipoButaca;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

    @Override
    public String toString() {
        return "Butaca{" + "precio=" + precio + ", tipoButaca=" + tipoButaca + ", reservada=" + reservada + '}';
    }

}
