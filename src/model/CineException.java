package model;

/**
 *
 * @author paucanmil
 */
public class CineException extends Exception {
    private int errorCode;
    
    /**
     * Constructor con mensaje de error.
     * 
     * @param mensaje Mensaje descriptivo del error.
     */
    public CineException(String mensaje) {
        super(mensaje);
        this.errorCode = 0; // Código genérico de error
    }
    
    /**
     * Constructor con mensaje de error y código de error.
     * 
     * @param mensaje Mensaje descriptivo del error.
     * @param errorCode Código del error.
     */
    public CineException(String mensaje, int errorCode) {
        super(mensaje);
        this.errorCode = errorCode;
    }
    
    /**
     * Obtiene el código de error.
     * 
     * @return Código del error.
     */
    public int getErrorCode() {
        return errorCode;
    }
    
    /**
     * Representación en cadena de la excepción.
     * 
     * @return Mensaje de error con código de error.
     */
    @Override
    public String toString() {
        return "CineException{errorCode=" + errorCode + ", message=" + getMessage() + "}";
    }
}

