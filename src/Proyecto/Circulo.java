package Proyecto;

/**
 * Representa una figura geométrica de tipo Círculo.
 * Esta clase implementa la interfaz {@link Figura} y proporciona
 * la lógica matemática para calcular su área y su perímetro basándose
 * en la longitud de su radio.
 * * @author Clax
 * @version 1.0
 */
public class Circulo implements Figura {
    /**
     * Medida del radio del círculo en privada
     * para garantizar el encapsulamiento y proteger la integridad de los datos.
     */
    private final double radio;

    /**
     * Constructor de la clase Círculo.
     * @param radio siendo esta la longitud del radio de la figura.
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    /**
     * Función para calcular el área del círculo.
     * @return devolviendo el resultado basándose en la fórmula del área de un círculo (Pi * r^2).
     */
    @Override
    public double calcArea() {
        // Calculamos el área siguiendo la fórmula Pi*r^2
        return Math.PI * Math.pow(radio, 2);
    }

    /**
     * Función para calcular el perímetro del círculo.
     * @return devolviendo el resultado basándose en la fórmula del perímetro de un círculo (2 * Pi * r).
     */
    @Override
    public double calcPerimetro() {
        // Calculamos el perímetro siguiendo la fórmula 2*Pi*r
        return 2 * Math.PI * radio;
    }

    /**
     * Función para representar el objeto Círculo como una cadena de texto.
     * @return Cadena de texto que muestra los datos que componen el objeto círculo.
     */
    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}