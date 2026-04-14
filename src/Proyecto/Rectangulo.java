package Proyecto;

/**
 * Representa una figura geométrica de tipo Rectángulo.
 * Esta clase implementa la interfaz {@link Figura} y proporciona
 * la lógica matemática para calcular su área y su perímetro basándose
 * en la longitud de su lado.
 * * @author Clax
 * @version 1.0
 */

public class Rectangulo implements Figura {
    /**
     * Medidas de la base y altura del rectángulo en privada
     * para garantizar el encapsulamiento y proteger la integridad de los datos.
     */
    private final double base;
    private final double altura;

    /**
     * Constructor de la clase Rectángulo.
     * @param base siendo esta la base de la figura.
     * @param altura siendo esta la altura de la figura.
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Función para calcular el área del rectángulo.
     * @return devolviendo el resultado basándose en la fórmula del área de un rectángulo (base x altura).
     */
    @Override
    public double calcArea() {
        return base * altura;
    }

    /**
     * Función para calcular el perímetro del rectángulo.
     * @return devolviendo el resultado basándose en la fórmula del perímetro de un rectángulo ((base x 2) + (altura x 2)).
     */
    @Override
    public double calcPerimetro() {
        return (base * 2) + (altura * 2);
    }

    /**
     * Función para representar el objeto Rectángulo como una cadena de texto.
     * @return Cadena de texto que muestra los datos que componen el objeto rectángulo.
     */
    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }
}
