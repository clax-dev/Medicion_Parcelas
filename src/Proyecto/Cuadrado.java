package Proyecto;

/**
 * Representa una figura geométrica de tipo Cuadrado.
 * Esta clase implementa la interfaz {@link Figura} y proporciona
 * la lógica matemática para calcular su área y su perímetro basándose
 * en la longitud de su lado.
 * * @author Clax
 * @version 1.0
 */

public class Cuadrado implements Figura {
    /**
     * Longitud de los lados del cuadrado en privada
     * para garantizar el encapsulamiento y proteger la integridad de los datos.
     */
    private final double lado;

    /**
     * Constructor de la clase Cuadrado.
     * @param lado siendo esta la longitud de los cuatro lados del cuadrado
     */
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    /**
     * Función para calcular el área del cuadrado.
     * @return devolviendo el resultado basándose en la fórmula del área de un cuadrado (lxl).
     */
    @Override
    public double calcArea() {
        return lado * lado;
    }

    /**
     * Función para calcular el perímetro del cuadrado.
     * @return devolviendo el resultado basándose en la fórmula del perímetro de un cuadrado (lx4).
     */
    @Override
    public double calcPerimetro() {
        return lado * 4;

    }

    /**
     * Función para representar el objeto Cuadrado como una cadena de texto.
     * @return Cadena de texto que muestra os datos que componen el objeto cuadrado
     */
    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }
}
