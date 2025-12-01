package model;

/**
 * Representa una planta de proceso de salmón de la empresa Salmontt.
 * <p>
 * Hereda los atributos básicos de {@link UnidadOperativa} y agrega
 * la capacidad diaria de procesamiento en toneladas.
 * </p>
 *
 * @author Benjamín Fernández-Niño
 * @version 1.0
 */
public class PlantaProceso extends UnidadOperativa {

    /** Capacidad máxima de procesamiento en toneladas por día */
    private int capacidadProceso;

    /**
     * Constructor de una planta de proceso.
     *
     * @param nombre           nombre de la planta
     * @param comuna           comuna donde está ubicada
     * @param capacidadProceso toneladas que puede procesar por día
     */
    public PlantaProceso(String nombre, String comuna, int capacidadProceso) {
        super(nombre, comuna);
        this.capacidadProceso = capacidadProceso;
    }

    /**
     * Obtiene la capacidad diaria de la planta.
     *
     * @return capacidad en toneladas/día
     */
    public int getCapacidadProceso() {
        return capacidadProceso;
    }

    /**
     * Representación completa de la planta, incluyendo atributos heredados.
     *
     * @return cadena con toda la información de la planta
     */
    @Override
    public String toString() {
        return "PlantaProceso{" +
                super.toString() +
                ", capacidadProceso (ton/día)=" + capacidadProceso +
                '}';
    }
}