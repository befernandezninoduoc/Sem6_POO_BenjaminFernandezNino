package model;

/**
 * Representa un centro de cultivo de salmón perteneciente a Salmontt.
 * <p>
 * Hereda los atributos comunes de {@link UnidadOperativa} y agrega
 * la producción anual en toneladas.
 * </p>
 *
 * @author Benjamín Fernández-Niño
 * @version 1.0
 */
public class CentroCultivo extends UnidadOperativa {

    /** Producción anual del centro en toneladas de salmón*/
    private double toneladas;

    /**
     * Constructor completo de un centro de cultivo.
     *
     * @param nombre     nombre del centro
     * @param comuna     comuna de ubicación
     * @param toneladas  toneladas de salmón producidas al año
     */
    public CentroCultivo(String nombre, String comuna, double toneladas) {
        super(nombre, comuna);
        this.toneladas = toneladas;
    }

    /**
     * Obtiene la producción anual del centro.
     *
     * @return toneladas de salmón producidas en un año
     */
    public double getToneladas() {
        return toneladas;
    }

    /**
     * Representación completa del centro de cultivo, incluyendo datos heredados.
     *
     * @return cadena descriptiva del objeto
     */
    @Override
    public String toString() {
        return "CentroCultivo{" +
                super.toString() +
                ", toneladas=" + toneladas +
                '}';
    }
}