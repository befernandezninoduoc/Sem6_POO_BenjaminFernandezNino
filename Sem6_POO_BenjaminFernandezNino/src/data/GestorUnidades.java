package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de cargar todas las unidades operativas de Salmontt
 * desde archivos de texto ubicados en la carpeta resources
 *
 * @author Benjamin Fernández Niño
 * @version 1.0
 */
public class GestorUnidades {

    /**
     * Carga centros de cultivo y plantas de proceso desde los archivos
     * <code>centros.txt</code> y <code>plantas.txt</code>.
     *
     * @return lista con todas las unidades operativas cargadas
     */
    public static List<UnidadOperativa> crearUnidadesDePrueba() {
        List<UnidadOperativa> unidades = new ArrayList<>();

        cargarArchivo("centros.txt", unidades, true);
        cargarArchivo("plantas.txt", unidades, false);

        return unidades;
    }

    /**
     * Lee un archivo de texto y crea las unidades correspondientes.
     *
     * @param archivo  nombre del archivo (ej. "centros.txt")
     * @param lista    lista donde agregar las unidades creadas
     * @param esCentro true si es archivo de centros, false si es de plantas
     */
    private static void cargarArchivo(String archivo, List<UnidadOperativa> lista, boolean esCentro) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                GestorUnidades.class.getClassLoader().getResourceAsStream(archivo)))) {

            if (br == null) {
                System.err.println("No se encontró el archivo: " + archivo);
                return;
            }

            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue;

                String[] datos = linea.split(";");
                if (datos.length != 3) continue;

                String nombre = datos[0].trim();
                String comuna = datos[1].trim();

                if (esCentro) {
                    double toneladas = Double.parseDouble(datos[2].trim().replace(",", "."));
                    lista.add(new CentroCultivo(nombre, comuna, toneladas));
                } else {
                    int capacidad = Integer.parseInt(datos[2].trim());
                    lista.add(new PlantaProceso(nombre, comuna, capacidad));
                }
            }
            System.out.println("Cargado correctamente: " + archivo);
        } catch (Exception e) {
            System.err.println("Error al cargar " + archivo + ": " + e.getMessage());
        }
    }
}