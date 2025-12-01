package model;

/**
 * Clase abstracta que representa una unidad operativa genérica de la empresa Salmontt.
 * <p>
 * Todas las unidades operativas comparten un nombre y la comuna donde se ubican.
 * Esta clase sirve como superclase para tipos específicos como centros de cultivo
 * y plantas de proceso, promoviendo la reutilización de código mediante herencia.
 * </p>
 *
 * @author Benjamín Fernández-Niño
 * @version 1.0
 * @since 2025
 */
public abstract class UnidadOperativa {

    /** Nombre identificatorio de la unidad operativa */
    protected String nombre;

    /** Comuna en la Región de Los Lagos donde se encuentra la unidad */
    protected String comuna;

    /**
     * Constructor de la unidad operativa.
     *
     * @param nombre  nombre de la unidad
     * @param comuna  comuna donde está ubicada
     */
    public UnidadOperativa(String nombre, String comuna) {
        this.nombre = nombre;
        this.comuna = comuna;
    }

    /**
     * Obtiene el nombre de la unidad operativa.
     *
     * @return nombre de la unidad
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la comuna donde se ubica la unidad.
     *
     * @return comuna de ubicación
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * Devuelve una representación en cadena de la unidad operativa.
     * <p>
     * Las subclases deben sobrescribir este método para incluir sus atributos específicos.
     * </p>
     *
     * @return cadena con la información básica de la unidad
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Comuna: " + comuna;
    }
}