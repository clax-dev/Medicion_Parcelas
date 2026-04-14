package Proyecto;

/**
 * Representa una figura geométrica de tipo Triángulo.
 * Esta clase implementa la interfaz {@link Figura} y proporciona
 * la lógica matemática para calcular su área y su perímetro basándose
 * en las longitudes de sus tres lados.
 * * @author Clax
 * @version 1.0
 */
public class Triangulo implements Figura {
    /**
     * Medidas de los tres lados del triángulo en privada
     * para garantizar el encapsulamiento y proteger la integridad de los datos.
     */
    private final double lado1;
    private final double lado3;
    private final double lado2;

    /**
     * Constructor de la clase Triángulo.
     * @param lado1 siendo esta la longitud del primer lado de la figura.
     * @param lado2 siendo esta la longitud del segundo lado de la figura.
     * @param lado3 siendo esta la longitud del tercer lado de la figura.
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Función para calcular el área del triángulo.
     * @return devolviendo el resultado basándose en la fórmula de Herón utilizando el semiperímetro.
     */
    @Override
    public double calcArea() {
        // Calculamos el área aplicando el teorema de Herón para obtener la altura.
        double s = (lado1 + lado2 + lado3) / 2;
        // s --> semiperímetro
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    /**
     * Función para calcular el perímetro del triángulo.
     * @return devolviendo el resultado basándose en la suma de la longitud de todos sus lados (lado1 + lado2 + lado3).
     */
    @Override
    public double calcPerimetro() {
        return lado1 + lado2 + lado3;
    }

    /**
     * Función para representar el objeto Triángulo como una cadena de texto.
     * @return Cadena de texto que muestra los datos que componen el objeto triángulo.
     */
    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado3=" + lado3 +
                ", lado2=" + lado2 +
                '}';
    }
}