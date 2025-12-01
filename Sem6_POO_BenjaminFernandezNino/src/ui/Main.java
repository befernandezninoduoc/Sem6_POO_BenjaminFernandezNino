package ui;

import data.GestorUnidades;
import model.UnidadOperativa;

import java.util.List;

/**
 * Aplicación principal SalmonttApp.
 *
 * @author Benjamin Fernández-Niño
 * @version 1.0
 */
public class Main {
    /**
     * Método principal.
     *
     * @param args argumentos
     */
    public static void main(String[] args) {
        System.out.println("=== UNIDADES OPERATIVAS SALMONTT ===\n");

        List<UnidadOperativa> unidades = GestorUnidades.crearUnidadesDePrueba();

        unidades.forEach(u -> {
            System.out.println(u);
            System.out.println("─".repeat(70));
        });

        System.out.println("Total unidades cargadas: " + unidades.size());
    }
}